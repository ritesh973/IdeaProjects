package com.proxypattern;

public class ProxyServer implements ServerAccess {

    private String name;

    EngineerRepo repo = new EngineerRepo();

    public ProxyServer(String name){
        this.name = name;

    }
    @Override
    public void getServerDetail() {

        ServerAccess access = new ProductionServer();
        for (Engineer engineer : repo.getEngineerList()) {
            if (engineer.getName().equalsIgnoreCase(name) && engineer.getRole().equalsIgnoreCase("System Engineer")){
                System.out.println(name+ " Acess the production server");
                access.getServerDetail();
                break;
            }
        }
    }
}
