package com.company;
import java.util.Scanner;
import java.util.Random;

public class Rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rm=new Random();
        int choice=0;
        while (true)
        {
            System.out.println("Enter your choice :\n1.Rock\n2.Paper\n3.Scissor\n4.Exit");
            choice=sc.nextInt();
            int random= rm.nextInt(4);
            System.out.println("Random no is "+random);
            switch (choice)
            {
                case 1: if(random==3)
                {
                    System.out.println("Congrats! You Win");
                }
                else {
                    System.out.println("Sorry Yo lost");
                }
                    break;
                case 2: if(random==1)
                {
                    System.out.println("Congrats! You Win");
                }
                else {
                    System.out.println("Sorry Yo lost");
                }
                    break;
                case 3: if(random==2)
                {
                    System.out.println("Congrats! You Win");
                }
                else {
                    System.out.println("Sorry Yo lost");
                }
                    break;
                case 4: return;
                default:
                    System.out.println("Wrong choice! Enter a correct choice");
                    break;
            }

        }

    }
}
