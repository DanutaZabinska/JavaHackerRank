package com.hackerrank.javastaticinitializerblock;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double B = sc.nextInt();
        double H = sc.nextInt();
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
