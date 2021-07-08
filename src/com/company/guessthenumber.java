package com.company;
import java.util.Random;
import java.util.Scanner;

class cylinder{
    int height,radius;
    cylinder()
    {
        System.out.println("Height="+height+" & Radius="+radius);
    }
    cylinder(int height)
    {
        this.height=height;
        System.out.println("Height="+height+" & Radius="+radius);
    }
    /*
    protected void display()
    {
        System.out.println("Height="+height+" & Radius="+radius);
    }*/
}

public class guessthenumber extends cylinder  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        cylinder c1=new cylinder();
        c1=new cylinder(45);
        System.out.println(c1.height);
    }
}
