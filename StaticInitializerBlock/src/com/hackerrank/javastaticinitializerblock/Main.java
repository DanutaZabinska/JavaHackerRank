package com.hackerrank.javastaticinitializerblock;

import java.util.Scanner;

public class Main {
    static double B;
    static double H;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
    }

    public static void main(String[] args) {
        if(B <= 0 | H <= 0)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else if (B > 100 | H > 100)
        {
            System.out.println("Numbers are too big");
        }
        else
        {
            System.out.println(B * H);
        }

    }
}
