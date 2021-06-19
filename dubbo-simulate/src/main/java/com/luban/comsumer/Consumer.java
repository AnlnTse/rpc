package com.xiejun.comsumer;

import com.xiejun.framework.Invocation;
import com.xiejun.framework.ProxyFactory;
import com.xiejun.protocol.http.HttpClient;
import com.xiejun.provider.api.HelloService;

public class Consumer {

    public static void main(String[] args) {

        HelloService helloService = ProxyFactory.getProxy(HelloService.class);
        String xxx = helloService.sayHello("xxx");
        System.out.println(xxx);



    }
}
