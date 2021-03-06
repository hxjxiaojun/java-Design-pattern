package com.singleton;

/**
 * 客户端请求
 * @author hxjxiaojun
 * @time 2016-5-3
 */
public class Client {

	public static void main(String args[]) {  
        //创建四个LoadBalancer对象  
//        LoadBalancer balancer1,balancer2,balancer3,balancer4;
//        balancer1 = LoadBalancer.getLoadBalancer();
//        balancer2 = LoadBalancer.getLoadBalancer();
//        balancer3 = LoadBalancer.getLoadBalancer();
//        balancer4 = LoadBalancer.getLoadBalancer();

        //创建四个EagerSingleton对象
        EagerSingleton balancer1,balancer2,balancer3,balancer4;
        balancer1 = EagerSingleton.getInstance();
        balancer2 = EagerSingleton.getInstance();
        balancer3 = EagerSingleton.getInstance();
        balancer4 = EagerSingleton.getInstance();

        //判断服务器负载均衡器是否相同  
        if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {  
            System.out.println("服务器负载均衡器具有唯一性！");  
        }  
          
        //增加服务器  
        balancer2.addServer("Server 1");  
        balancer3.addServer("Server 2");  
        balancer4.addServer("Server 3");  
        balancer1.addServer("Server 4");  
        
        //删除服务器
        balancer1.removeServer("Server 1");
          
        //模拟客户端请求的分发  
        for (int i = 0; i < 4; i++) {
            String server = balancer2.getServer();  
            System.out.println("分发请求至服务器： " + server);  
      }  
    }  
}  