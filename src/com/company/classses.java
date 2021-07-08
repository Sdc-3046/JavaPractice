package com.company;
import java.util.Scanner;

class Square{
    float area,perimeter;

    float area(float length)
    {
        area=length*length;
        return area;
    }
    float perimeter(float length)
    {
        perimeter=(float)(4*length);
        return perimeter;
    }
}

class Circle{
    float area,circumference;

    float Area(float radius)
    {
        area=(float) (3.14*radius*radius);
        return area;
    }
    float Circumference(float radius)
    {
        circumference=(float)(2*3.14*radius);
        return circumference;
    }
}

public class classses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of side of square");
        float side=sc.nextFloat();
        Square sq=new Square();
        System.out.println("Area of the square is "+sq.area(side));
        System.out.println("Perimeter of the square is "+sq.perimeter(side));
        Circle c=new Circle();
        System.out.println("Enter the length of the radius");
        float radius= sc.nextFloat();
        System.out.println("Area of the circle is "+c.Area(radius));
        System.out.println("Circumference of the circle is "+c.Circumference(radius));
    }
}