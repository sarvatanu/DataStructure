package sorting;


public class BubbleSort {


    static void sort(int[] arr, int length) {

        if (length == 1) {
            return;
        }

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        printArray(arr);
        sort(arr, length - 1);
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


