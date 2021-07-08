package com.company;
import java.util.Scanner;

public class recursivesum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a natural number");
        int number=sc.nextInt();
        recursivesum r=new recursivesum();
        int s=r.rsum(number);
        System.out.println("Sum of first "+number+" natural numbers is "+s);
    }
    public int rsum(int n)
    {
        if(n>0)
        {
            return (n+rsum(n-1));
        }
        return n;
    }
}
