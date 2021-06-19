package com.xiejun.provider;

import com.xiejun.api.ProviderServiceInterface;
import com.xiejun.api.User;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ProviderService implements ProviderServiceInterface {

    public User getUser() {
        return new User("周瑜");
    }
}
