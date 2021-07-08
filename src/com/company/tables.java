package com.company;
import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        tables tb=new tables();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        tb.table(n);
    }
    public void table(int n)
    {
        System.out.println("Multiplication table of "+n+" :");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i*n);
        }
    }
}
