package com.proxypattern;

public class ProductionServer implements ServerAccess {
    @Override
    public void getServerDetail() {
        System.out.println("Production server accessed and fetched detail");
    }
}
