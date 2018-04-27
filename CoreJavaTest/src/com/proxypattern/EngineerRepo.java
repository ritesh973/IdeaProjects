package com.proxypattern;

import java.util.ArrayList;
import java.util.List;

public class EngineerRepo {

    public List<Engineer> getEngineerList(){
        List<Engineer> list = new ArrayList<>();
        Engineer engineer = new Engineer();
        engineer.setName("Ritesh");
        engineer.setRole("DEV");
        list.add(engineer);

        Engineer engineer2 = new Engineer();
        engineer2.setName("Daniel");
        engineer2.setRole("System Engineer");
        list.add(engineer2);
        return list;
    }
}
