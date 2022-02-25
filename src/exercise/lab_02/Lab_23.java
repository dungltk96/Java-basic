package exercise.lab_02;

import java.util.Scanner;

/*
 * (Optional) Lab_01 + Suggest user to increase/decrease weight
 * */

public class Lab_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight: ");
        float weight = scanner.nextFloat();

        System.out.println("Please enter your height: ");
        float height = scanner.nextFloat();

        float CurrentBMI = weight / (height * height);
        System.out.println("Current BMI Results: " + CurrentBMI);

//        //Solution 1
//        double NormalBMIAtLeast = 18.5;
//        double NormalBMIMost = 24.9;

//        double BMIIncrease = NormalBMIAtLeast - BMI;
//        System.out.printf("Increase %f BMI \n", BMIIncrease);
//        double IncreaseWeight = BMIIncrease * (height*height);

//        double BMIDecrease = BMI - NormalBMIMost;
//        System.out.printf("Decrease %f BMI \n", BMIDecrease);
//        double DecreaseWeight = BMIDecrease * (height*height);

//        //Solution 2
        double StandardBMI = 20;
        double NeedBMI = StandardBMI - CurrentBMI;
        System.out.printf("You need %f BMI\n", NeedBMI);
        double DesiredWeight = NeedBMI * (height * height);

        if (CurrentBMI < 18.5) {
            System.out.println("Underweight");
            System.out.println("You need to gain at least: " + DesiredWeight + "kg");
        } else if (CurrentBMI <= 24.9) {
            System.out.println("Normal weight");
            System.out.println("Good! Stay keep shape");
        } else if (CurrentBMI < 29.9) {
            System.out.println("Overweight");
            System.out.println("You need to reduce at least: " + DesiredWeight + "kg");
        } else {
            System.out.println("Obesity");
            System.out.println("You need to reduce at least: " + DesiredWeight + "kg");
        }
    }
}
