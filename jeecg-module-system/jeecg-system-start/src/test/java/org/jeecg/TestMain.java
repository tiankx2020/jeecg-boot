package org.jeecg;

import com.alibaba.fastjson.JSONObject;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.jeecg.common.util.RestUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 14:02
 */
public class TestMain {
    public static void main(String[] args) {
        // 请求地址
        String url = "https://api.boot.jeecg.com/sys/user/list";
        // 请求 Header （用于传递Token）
        HttpHeaders headers = getHeaders();
        // 请求方式是 GET 代表获取数据
        HttpMethod method = HttpMethod.GET;

        System.out.println("请求地址：" + url);
        System.out.println("请求方式：" + method);

        // 利用 RestUtil 请求该url
        ResponseEntity<JSONObject> result = RestUtil.request(url, method, headers, null, null, JSONObject.class);
        if (result != null && result.getBody() != null) {
            System.out.println("返回结果：" + result.getBody().toJSONString());
        } else {
            System.out.println("查询失败");
        }
    }
    private static HttpHeaders getHeaders() {
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.50h-g6INOZRVnznExiawFb1U6PPjcVVA4POeYRA5a5Q";
        System.out.println("请求Token：" + token);

        HttpHeaders headers = new HttpHeaders();
        String mediaType = MediaType.APPLICATION_JSON_VALUE;
        headers.setContentType(MediaType.parseMediaType(mediaType));
        headers.set("Accept", mediaType);
        headers.set("X-Access-Token", token);
        return headers;
    }
    @Before
    public void before() {
        //参数1  --> zk server 服务ip地址:端口号
        //参数2 -->  会话超时时间
        //参数3  --> 连接超时时间
        //参数4  --> 序列化方式
        zkClient = new ZkClient("127.0.0.1:2181", 60000 * 30, 60000, new SerializableSerializer());
    }

    private ZkClient zkClient;

    @Test
    public void  test01(){
        System.out.println(zkClient);
    }

    @After
    public void after() {

        zkClient.close();
    }


}
