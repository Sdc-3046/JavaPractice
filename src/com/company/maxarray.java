package com.company;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class maxarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr={1,2,3,4,5,6};
        maxarray m=new maxarray();
        boolean result=m.sortcheck(arr);
        if (result)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted.");
        }
    }
    public boolean sortcheck(int ...arr)
    {
        int[] arr1=new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
