package exercise.lab_03;

public class Lab_03_DifferentWay {
    /*
     * unsorted position --> sorted
     * swap
     * */

    public static void main(String[] args) {
        int[] arr = {12, 34, 1, 16, 16, -1, 28, 2};
        int usp = arr.length - 1;

        while (usp > 0) {
            for (int index = 0; index < usp; index++) {
                if (arr[index] > arr[index + 1]){
                    int temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                }
            }
            usp--;
        }
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
