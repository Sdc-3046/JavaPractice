package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class avgmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students.");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the marks-");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        float avg;
        for (int i:arr){
            sum=sum+i;
        }
        avg=(float)sum/size;
        System.out.println("Average is "+avg);
    }
}
