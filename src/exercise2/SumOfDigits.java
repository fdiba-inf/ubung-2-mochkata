package exercise2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();


        if ((number < 1000) && (number>=0)){
        int a=number/100;
        int rest = number - a*100;
        int b=rest/10;
        int rest1=rest -b*10;
           System.out.println("Sum of digits: " +(a+b+rest1));
        }
        else {
            System.out.println("Number isn't between 0 and 999.");
        }

    }
}