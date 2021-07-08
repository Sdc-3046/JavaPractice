package com.company;
import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        incometax in=new incometax();
        in.caltax();
    }
    public void caltax()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n Enter your income in lakhs.");
        float income,tax;
        income=sc.nextFloat();
        if (income<2.5){
            System.out.println("\n You're not able to pay the tax");
        }
        else if(income>=2.5 && income<5.0){
            tax=(float)(0.05 * (income));
            tax=tax*100000;
            System.out.println("You're tax is: "+tax);
        }
        else if(income>=5.0 && income<10.0){
            tax=(float)(0.2 * (income));
            tax=tax*100000;
            System.out.println("You're tax is: "+tax);
        }
        else {
            tax=(float)(0.3 * (income));
            tax=tax*100000;
            System.out.println("You're tax is: "+tax);
        }

    }
}
