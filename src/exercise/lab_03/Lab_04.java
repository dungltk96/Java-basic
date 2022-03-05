package exercise.lab_03;

/*
 * Merge 2 SHORTED integer array into one SORTED array
 */

public class Lab_04 {
    public static void main(String[] args) {
        int[] arr1 = {5,15,23,30,45};
        int[] arr2 = {11,20,20,25,50,52};
        int[] merged = merge(arr1,arr2);

        for (int value : merged) {
            System.out.print(value + " ");
        }
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 ==null){
            throw new IllegalArgumentException("Both arr are null");
        }

        if (arr1.length == 0 && arr2.length == 0){
            throw new IllegalArgumentException("Both arr are null");
        }

        if (arr1 == null || arr1.length == 0){
            return arr2;
        }

        if (arr2 == null || arr2.length == 0){
            return arr1;
        }

        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int[] merged = new int[arr1Length + arr2Length];

        int arr1Index = 0;
        int arr2Index = 0;
        int mergedIndex = 0;

        while (arr1Index < arr1Length && arr2Index < arr2Length) {
            if (arr1[arr1Index] < arr2[arr2Index]) {
                merged[mergedIndex++] = arr1[arr1Index++];
//                merged[mergedIndex] = arr1[arr1Index];
//                mergedIndex++;
//                arr1Index++;
            } else {
                merged[mergedIndex++] = arr2[arr2Index++];
            }
        }

        while (arr1Index < arr1Length) {
            merged[mergedIndex++] = arr1[arr1Index++];
        }

        while (arr2Index < arr2Length) {
            merged[mergedIndex++] = arr2[arr2Index++];
        }
        return merged;
    }
}
