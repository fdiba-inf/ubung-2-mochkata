package exercise2;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();


        double D= b *b - 4 * a * c;

        if (a != 0) {
            if (D >= 0) {
                double x1 = (-b + Math.sqrt(D)) / (2*a);
                double x2 = (-b - Math.sqrt(D)) / (2*a);
                System.out.println(x1+", "+x2);
            } else {
                System.out.println("Imaginary values");
            }
        } else if (b != 0) {
            double x = -c / b;
            System.out.println(x);
        } else if (c != 0) {
            System.out.print("No values");
        } else {
            System.out.println("Many values");
        }
    }
}