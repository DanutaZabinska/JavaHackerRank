package com.hackerrank.javastaticinitializerblock;

import java.util.Scanner;

public class Main {
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
      if( B <= 0 | H <= 0)
          System.out.println("java.lang.Exception: Breadth and height must be positive");
      else if(B > 100 | H > 100)
          flag = false;
      else
          flag = true;
    }

    public static void main(String[] args){
        if(flag){
            int area = B*H;
            System.out.print(area);
        }

    }
}
