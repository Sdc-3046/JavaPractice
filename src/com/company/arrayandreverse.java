package com.company;
import java.util.Scanner;

public class arrayandreverse {
    public static void main(String[] args) {
        int[] arr={1,4,5,8,9};
        Scanner sc =new Scanner(System.in);
        arrayandreverse ar=new arrayandreverse();
        ar.reverse(arr);
        /*int number=sc.nextInt();
        int result;
        for (int i=0;i< (arr.length);i++) {
            if (arr[i] == number) {
                System.out.println("Number found at " + i + " location");
                return;
            }
        }
        System.out.println("Number not in the array.");
        */
    }
    public void reverse(int ...arr)
    {
        int[] arr1=new int[5];
        int index=0;
        for (int i=(arr.length-1);i>=0;i--)
        {
            arr1[index]=arr[i];
            index++;
        }
        System.out.println("Before :");
        for (int i:arr)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("After :");
        for (int i:arr1)
        {
            System.out.print(i+"\t");
        }

    }
}
