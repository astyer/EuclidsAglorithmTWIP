package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1 = input.nextInt();
        System.out.println("Enter the second number:");
        int n2 = input.nextInt();
        System.out.println("The greatest common divisor found recursively is: " + Euclid.recursively(n1, n2));
        System.out.println("The greatest common divisor found iteratively is: " + Euclid.iteratively(n1, n2));
    }
}
