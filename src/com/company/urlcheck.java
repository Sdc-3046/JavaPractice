package com.company;
import java.util.Scanner;
import java.lang.String;

public class urlcheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the url of your site.");
        String url=sc.next();
        if (url.contains(".com")){
            System.out.println("This website is commercial website.");
        }
        else if(url.contains(".org")){
            System.out.println("This website is Organization Website");
        }
        else if (url.contains(".in")){
            System.out.println("This website is an Indian Website");
        }
    }
}
