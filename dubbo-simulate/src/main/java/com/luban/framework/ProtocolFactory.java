package com.xiejun.framework;

import com.xiejun.protocol.dubbo.DubboProtocol;
import com.xiejun.protocol.http.HttpProtocol;

public class ProtocolFactory {

    public static Protocol getProtocol() {

        String name = System.getProperty("protocolName");
        if (name == null || name.equals("")) name = "http";
        switch (name) {
            case "http":
                return new HttpProtocol();
            case "dubbo":
                return new DubboProtocol();
            default:
                break;
        }
        return new HttpProtocol();
    }
}
