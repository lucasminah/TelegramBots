package org.telegram.telegrambots.facilities.proxysocketfactorys;

import java.net.Proxy;

public class HttpConnectionSocketFactory extends PlainConnectionSocketFactoryAbstract {

    public HttpConnectionSocketFactory() {
        this.proxyType = Proxy.Type.HTTP;
    }

}
