package exercise.lab_02;

import java.util.Scanner;

/*
 * Allow user to input a number print out it's an odd or even number
 * */
public class Lab_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number!");

        int number = scanner.nextInt();
        if (number % 2 != 0) {
            System.out.println("Even number");
        } else {
            System.out.println("An odd");
        }
    }
}
