package org.telegram.telegrambots.facilities.proxysocketfactorys;

import java.net.Proxy;
import javax.net.ssl.SSLContext;

public class SocksSSLConnectionSocketFactory extends SSLConnectionSocketFactoryAbstract {

    public SocksSSLConnectionSocketFactory(final SSLContext sslContext) {
        super(sslContext);
        this.proxyType = Proxy.Type.SOCKS;
    }

}
