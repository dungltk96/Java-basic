package exercise.lab_03;

/*
 * Sort an integer array from min to max
 * */

import java.util.Arrays;

public class Lab_03 {
    public static void main(String[] args) {
        int[] intArr = {15, 12, 10, 34, 20, 10, 55, 45};
        int tempVariable = 0;

        System.out.println("Sorted array elements in ascending order:");
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    tempVariable = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = tempVariable;
                }
            }
            System.out.println(intArr[i]);
        }

//        System.out.println("Array elements: " + arrNum);
//        System.out.println("Arrays in original order: " + Arrays.toString(arrNum));
//        Arrays.sort(arrNum);
//        System.out.println("Sorted arrays in ascending order: " + Arrays.toString(arrNum));
    }
}
