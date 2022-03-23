package org.telegram.telegrambots.facilities.proxysocketfactorys;

import java.net.Proxy;

public class SocksConnectionSocketFactory extends PlainConnectionSocketFactoryAbstract {

    public SocksConnectionSocketFactory() {
        this.proxyType = Proxy.Type.SOCKS;
    }

}
