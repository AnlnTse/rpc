package com.xiejun.spi;

import com.xiejun.framework.Protocol;
import com.xiejun.framework.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class DubboSpi {

    public static void main(String[] args) {
        ExtensionLoader<Protocol> extensionLoader =
                ExtensionLoader.getExtensionLoader(Protocol.class);
        Protocol protocol = extensionLoader.getExtension("http");
        protocol.start(new URL("localhost", 8080));
    }
}
