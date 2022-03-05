package exercise.lab_03;

public class ArrayPostfixIndex {
    public static void main(String[] args) {
        int arrLength = 5;
        int[] arr = new int[arrLength];

        int index = 0;
        while (index < arrLength) {
            arr[index++] = index; //Postfix in arr ==> index = 0 --> arr[0] = 1 --> index = 1 | arr[1] = 2, v.v.
        }
        for (int value : arr){
            System.out.println(value);
        }
    }
}
