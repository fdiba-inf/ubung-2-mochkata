package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int fiki = number % 10;
        number = number /10;
        int azis = number % 10;
        number = number / 10;
        int djamaikata = number % 10;

        int sum = fiki + azis + djamaikata;

        System.out.println("Sum of digits:" + sum);
        
    }

}