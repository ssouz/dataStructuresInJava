package org.ssouz;

public class execTime {
    public static long start;
    public static void starter(){
        start = System.currentTimeMillis();
    }
    public static void finish(){
        System.out.println(System.currentTimeMillis() - start +"ms");
    }
}