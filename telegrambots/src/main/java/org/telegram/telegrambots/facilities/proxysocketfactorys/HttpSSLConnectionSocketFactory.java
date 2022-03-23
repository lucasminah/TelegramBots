package org.telegram.telegrambots.facilities.proxysocketfactorys;

import javax.net.ssl.SSLContext;
import java.net.Proxy;

public class HttpSSLConnectionSocketFactory extends SSLConnectionSocketFactoryAbstract {

    public HttpSSLConnectionSocketFactory(final SSLContext sslContext) {
        super(sslContext);
        this.proxyType = Proxy.Type.HTTP;
    }

}
