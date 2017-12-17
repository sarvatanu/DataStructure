package sorting;

/**
 * Selection sort is to select the min element and sort
 */
public class SelectionSort {

    static void sort(int[] arr, int length) {

        for (int i = 0; i < length - 1; i++) {
            //Find the minimum index and then swap
            int tempIndex  = i;
            for(int j = i +1; j<= length-1; j++) {
                if (arr[j] < arr[tempIndex]) {
                    tempIndex = j;
                }
            }
            int temp = arr[tempIndex];
            arr[tempIndex] = arr[i];
            arr[i] = temp;
            printArray(arr);
        }
    }

    public static void main(String... st) {
        int[] arr = {8, 5, 3, 7, 6, 2, 1, 4};
        System.out.println("Original Array : ");
        printArray(arr);

        System.out.println("pass through Array : ");
        sort(arr, arr.length);

        System.out.println("sorted Array : ");
        printArray(arr);
    }

    private static void printArray(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(anArray[i]);
        }

        System.out.println("");
    }
}
