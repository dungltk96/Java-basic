package exercise.lab_03;

/*
 * Count how many odd, even number(s) in an integer array
 * */

public class Lab_01 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 5, 10};
        int oddCount = 0;
        int evenCount = 0;
        for (int elementIndex = 0; elementIndex < intArr.length; elementIndex++) {
            if (intArr[elementIndex] % 2 == 0) {
                evenCount = evenCount + 1;
            } else {
                oddCount = oddCount + 1;
            }
        }
        System.out.println("Total even number: " + evenCount);
        System.out.println("Total odd number: " + oddCount);
    }
}
