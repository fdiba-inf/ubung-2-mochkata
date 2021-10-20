package exercise2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int radius=input.nextInt();
        double circ=2*Math.PI*radius;
        System.out.println("Circumference: "+ circ);
        double ar=Math.PI*radius*radius;
        System.out.println("Area: "+ ar);
        }

    }