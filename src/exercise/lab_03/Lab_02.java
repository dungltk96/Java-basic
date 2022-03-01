package exercise.lab_03;

/*
 * Finding maximum value | minimum value from an integer array
 * */

public class Lab_02 {
    public static void main(String[] args) {
        int[] intArr = {1, 5, 10, 9, 25, 1};
        int min = intArr[0];
        int max = intArr[0];
        for (int elementIndex = 0; elementIndex < intArr.length; elementIndex++) {
            if (intArr[elementIndex] < min) {
                min = intArr[elementIndex];
            }

            if (intArr[elementIndex] > max) {
                max = intArr[elementIndex];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
