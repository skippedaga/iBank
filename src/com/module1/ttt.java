package com.module1;

import java.lang.String;

class ttt {
    private static String ss;

    public static void main(String[] args) {
        System.out.println("Hi, " + ss);
    }

    public static String getSs() {
        return ss;
    }

    public static void setSs(String ss) {
        ttt.ss = ss;
    }
}
