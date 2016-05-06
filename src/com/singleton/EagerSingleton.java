package com.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * author :hxjxiaojun
 * date :2016/5/5
 *
 * 饿汉模式
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();
    //服务器集合
    private List serverList = null;
    private EagerSingleton() {
        serverList = new ArrayList();
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    //增加服务器
    public void addServer(String server) {
        serverList.add(server);
    }

    //删除服务器
    public void removeServer(String server) {
        serverList.remove(server);
    }

    //使用Random类随机获取服务器
    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }
}