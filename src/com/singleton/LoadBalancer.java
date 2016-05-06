package com.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 负载均衡器
 * @author hxjxiaojun
 * @time 2016-5-3
 *  单例模式(Singleton Pattern)：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类称为单例类，它提供全局访问的方法。单例模式是一种对象创建型模式
 *   单例模式有三个要点：一是某个类只能有一个实例；二是它必须自行创建这个实例；三是它必须自行向整个系统提供这个实例。
 *   
 *   负载均衡器
 *   将并发访问和数据流量分发到服务器集群中的多台设备上进行并发处理，提高系统的整体处理能力，缩短响应时间。由于集群中的服务器需要动态删减，且客户端请求需要统一分发，
 *   因此需要确保负载均衡器的唯一性，只能有一个负载均衡器来负责服务器请求的的管理和分发，否则将会带来服务器状态的不一致以及请求分配冲突等问题。如何确保负载均衡器的唯一性是该软件成功的关键
 *
 *   懒汉模式
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class LoadBalancer {

	 //私有静态成员变量，存储唯一实例  
    private volatile static LoadBalancer instance = null;
    //服务器集合  
	private List serverList = null;  
      
    //私有构造函数  
    private LoadBalancer() {  
        serverList = new ArrayList();  
    }  
      
    //公有静态成员方法，返回唯一实例
    //synchronized 处理多个线程同时访问
    public static LoadBalancer getLoadBalancer() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized(LoadBalancer.class){
                //第二重判断
                if(instance == null){
                    instance = new LoadBalancer();
                }
            }
        }
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