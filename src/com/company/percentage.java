package com.company;
import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        float p,q,r,total;
        boolean result=true;
        System.out.println("\n Enter the marks of the student");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        p=((float)a*100)/200;
        q=((float)b*100)/200;
        r=((float)c*100)/200;
        total= (((float)(a+b+c))*100)/600;
        if (total>=40){
            if (p>33 && q>33 && r>33){
                System.out.println("\n Congratulations! You passed the exam.You got "+total+"%.");
            }
            else {
                System.out.println("\n Sorry, You're Failed. Better luck next time.You got "+total+"%.");
            }
        }
        else {
            System.out.println("\n Sorry, You're Failed. Better luck next time.You got "+total+"%.");
        }
    }
}
