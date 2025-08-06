package practice;

import java.util.Scanner;

class Rectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double width=0;
        double height=0;
        double area=0;

        System.out.print("Enter the width of a rectangle:");
        width=sc.nextDouble();

        System.out.print("Enter the height of a rectangle:");
        height=sc.nextDouble();

        area=width*height;

        System.out.println("Area of a rectangle: "+area +" cm^2");

        sc.close();
    }
}