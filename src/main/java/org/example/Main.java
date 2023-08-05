package org.example;

public class Main {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println("a = " + a + " b = " + b);

        int temp=a;
        a=b;
       b=temp;
        System.out.println("a = " + a + " b = " + b);

    }
}