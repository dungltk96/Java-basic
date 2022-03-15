package exercise.lab_06;

import java.util.Scanner;

/*
 * String myPassword = "password123";
 * */
public class Lab02 {
    public static void main(String[] args) {
        String myPassword = "password123";
        int userInputTimes = 0;

        while (userInputTimes < 3){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Password, Pls!");
            String userInputPass = scanner.nextLine();

            if (userInputPass == null || userInputPass.isBlank()){
                throw new IllegalArgumentException("String can't be null or empty!");
            }else {
                if (myPassword.equals(userInputPass)){
                    System.out.println("Password in correct");
                    break;
                }else {
                    System.out.println("Password is not correct");
                    userInputTimes++;
                }
            }
            if (userInputTimes == 3){
                System.out.println("Please try again later 5 minutes!");
            }
        }
    }
}
