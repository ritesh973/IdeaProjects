package com.proxypattern;

public class ProxyDesignPattern {
    public static void main(String[] args) {

        ServerAccess access = new ProxyServer("Ritesh");
        access.getServerDetail();

        ServerAccess access1 = new ProxyServer("Daniel");
        access1.getServerDetail();

    }
}
