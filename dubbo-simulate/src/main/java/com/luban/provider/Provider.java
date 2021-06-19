package com.xiejun.provider;

import com.xiejun.framework.Protocol;
import com.xiejun.framework.ProtocolFactory;
import com.xiejun.framework.URL;
import com.xiejun.protocol.dubbo.NettyServer;
import com.xiejun.protocol.http.HttpProtocol;
import com.xiejun.protocol.http.HttpServer;
import com.xiejun.provider.api.HelloService;
import com.xiejun.provider.impl.HelloServiceImpl;
import com.xiejun.register.RemoteMapRegister;
import com.xiejun.register.ZookeeperRegister;

public class Provider {

    private static boolean isRun = true;

    public static void main(String[] args) {
        // 1. 注册服务
        // 2. 本地注册
        // 3. 启动tomcat

        // 注册服务
        URL url = new URL("localhost", 8080); //NetUtil
        RemoteMapRegister.regist(HelloService.class.getName(), url);

        //  服务：实现类
        LocalRegister.regist(HelloService.class.getName(), HelloServiceImpl.class);


        Protocol protocol = ProtocolFactory.getProtocol();
        protocol.start(url);


    }
}
