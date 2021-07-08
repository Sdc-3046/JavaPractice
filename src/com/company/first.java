package com.company;
import java.util.Scanner;
import java.math.*;


public class first {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }

    protected static int factorial(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * (factorial(number - 1));
        }
    }
}
