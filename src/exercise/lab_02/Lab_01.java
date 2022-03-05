package exercise.lab_02;

import java.util.Scanner;

/*
 * Get input from user about height(m) and weight(kg) then calculate BMI
 *   Underweight < 18.5
 *   Normal weight = 18.5 --> 24.9
 *   Overweight = 25 --> 29.9
 *   Obesity = BMI of 30 or greater
 *   BMI = weight/(height*height)
 * */

public class Lab_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight: ");
        float weight = scanner.nextFloat();

        System.out.println("Please enter your height: ");
        float height = scanner.nextFloat();

        float bMI = weight / (height * height);
        System.out.println("Result bMI: " + bMI);

        if (bMI < 18.5) {
            System.out.println("Underweight");
        } else if (bMI <= 24.9) {
            System.out.println("Normal weight");
        } else if (bMI < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}
