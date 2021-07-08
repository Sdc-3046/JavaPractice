package com.company;
import java.util.Scanner;

class Tommy{
    void hit()
    {
        System.out.println("1-Hit");
    }
    void run()
    {
        System.out.println("running");
    }
    void fire()
    {
        System.out.println("shot-fired");
    }
}

public class Rockstargames {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Tommy t1=new Tommy();
        int choice=0;
        while (true)
        {
            System.out.println("Enter your choice :\n1.Hit\n2.Run\n3.Fire\n4.Exit");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1: t1.hit();
                        break;
                case 2: t1.run();
                        break;
                case 3: t1.fire();
                        break;
                case 4: return;
                default:
                    System.out.println("Wrong choice! Enter a correct choice");
                    break;
            }

        }
    }
}
