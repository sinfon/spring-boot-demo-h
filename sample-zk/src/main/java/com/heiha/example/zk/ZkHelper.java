package com.heiha.example.zk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <br>
 * <b>Project:</b> spring-boot-demo<br>
 * <b>Date:</b> 2017/5/12 17:02<br>
 * <b>Author:</b> heiha<br>
 *
 * @see org.springframework.cloud.zookeeper.ZookeeperProperties
 * @see org.springframework.cloud.zookeeper.ZookeeperAutoConfiguration
 */
@Component
public class ZkHelper {


    @Autowired
    private ZookeeperProperties properties;

    public void use() {
        System.out.println(properties.getConnectString());
        System.out.println(properties.isEnable());
    }
}
