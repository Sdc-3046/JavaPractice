package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[][] arr= {
                {1,2,3},{4,5,6}
        };
        int[][] arr1={
                {11,12,13},{14,15,16}
        };
        int[][] sum=new int[2][3];
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<3;j++)
            {
                sum[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("Sum of the 2D arrays is :");
        for (int i=0;i<2;i++)
        {
         for (int j=0;j<3;j++)
         {
             System.out.print(sum[i][j]+"\t");
         }
         System.out.println();
        }

    }
}
