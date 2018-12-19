package com.ajulay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name...");
        String s = sc.nextLine().trim();
        if (s.length() > 0) {
            System.out.println("Hello, " + s + "!");
        } else {
            System.out.println("Hello, World!");
        }
        sc.close();
    }
}
