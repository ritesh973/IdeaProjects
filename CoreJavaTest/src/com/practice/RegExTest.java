package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

    public static void main(String[] args) {

        String str ="KPI_CORE_V_KPI_11_ENB_ONLY_ACTUAL";
        Pattern ptn1 = Pattern.compile("^KPI_");
        Pattern ptn2 = Pattern.compile("_CORE_V_KPI_11_ENB_ONLY_");
        Pattern ptn3 = Pattern.compile("_ACTUAL");

        final List<Pattern> rxs = new ArrayList<>();
        rxs.add(ptn1);
        rxs.add(ptn2);
        rxs.add(ptn3);


        for (Pattern rx : rxs) {
            Matcher matcher1 = rx.matcher(str);
            if (matcher1.find()) {
                System.out.println(matcher1.group());
            }
        }

     Pattern pt = Pattern.compile("(^KPI_)(.*)_(\\w+)\\s*(KPI_)(.*)_(\\w+)");
        String s = pt.matcher(str).toMatchResult().group();
        System.out.println(s);


    }
}
