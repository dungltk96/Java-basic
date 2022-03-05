package exercise.lab_04;
/*
 * Create a simple Menu with 4 options
 * 1. Add number info list
 * 2. Print numbers
 * 3. Get maximum number
 * 4. Get minimum number
 * */

import java.util.*;

public class SimpleMenu {
    public static void main(String[] args) {
        boolean isContinuing = true;
        List<Integer> arrList = new ArrayList<>();
        while (isContinuing) {
            System.out.println("========MENU========");
            System.out.println("1. Add number info list");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("0. Exit programing!\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number, please!");
            int userInput = scanner.nextInt();

            if (userInput == 0) {
                isContinuing = false;
            } else {
                switch (userInput) {
                    case 1:
                        System.out.println("Adding number!");
                        int userAddNumber = scanner.nextInt();
                        arrList.add(userAddNumber);
                        break;
                    case 2:
                        System.out.println("List of numbers in array");
                        for (int index = 0; index < arrList.size(); index++) {
                            System.out.println(arrList.get(index));
                        }
                        break;
                    case 3:
                        System.out.println("Max value is: " + Collections.max(arrList));
                        break;
                    case 4:
                        System.out.println("Min value is: " + Collections.min(arrList));
                        break;
                    default:
                        System.out.println("Wrong option!");
                }
            }
        }
    }
}
