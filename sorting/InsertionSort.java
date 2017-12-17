package sorting;

public class InsertionSort {

    static void sort(int[] arr, int length) {

        for(int i = 0 ; i < length; i++) {
            int current = arr[i];
            int j = i - 1; // to compare the previous element

            while(j >= 0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }

    public static void main(String... st) {
        int[] arr = {8, 5, 3, 7, 6, 2, 1, 4};
        System.out.println("Original Array : ");
        printArray(arr);

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
