package org.jeecg.modules.zookeeper.lock;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.retry.RetryOneTime;

/**
 * @Author tkx
 * @Date 2024 12 02 22 05
 **/
public class MainDemo {

    public static void main(String[] args) throws Exception {
        Demo12306 demo12306 = new Demo12306();
        Thread t1 = new Thread(demo12306,"携程");
        Thread t2 = new Thread(demo12306,"飞猪");

        t1.start();
        t2.start();

    }
}