package com.xiejun.spi;

import com.xiejun.framework.Protocol;
import com.xiejun.framework.URL;
import com.xiejun.provider.api.HelloService;

import java.util.Iterator;
import java.util.ServiceLoader;

public class JavaSpi {
    public static void main(String[] args) {
        ServiceLoader<Protocol> serviceLoader = ServiceLoader.load(Protocol.class);
        Iterator<Protocol> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            Protocol protocol = iterator.next();
            protocol.start(new URL("localhost", 8080));
        }
    }
}
