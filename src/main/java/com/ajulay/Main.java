package com.ajulay;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            String s = "";
            for (int i = 0; i < args.length; i++) {
                s += args[i] + " ";
            }
            s = s.substring(0, s.length()-1);
            System.out.println("Hello, " + s + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
