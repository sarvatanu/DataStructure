package sorting;

/**
 * Created by saravanan on 17/12/17.
 */
public class MergeSort {

    static void mergeSort(int[] arr, int start, int end) {
        int length = arr.length;

        if(start < end) {
            int mid  = (start+end)/2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);

        }
    }

    public static void merge(int arr[], int start, int mid, int end) {
        int sizeOfLeft =  mid - start +1;
        int sizeOfRight =  end- mid;

        int[] aLeft = new int[sizeOfLeft];
        int[] aRight =  new int[sizeOfRight];

        for (int i = 0; i < sizeOfLeft; i++) {
            aLeft[i] = arr[start + i];
        }
        for (int j = 0; j < sizeOfRight; j++) {
            aRight[j] = arr[mid + 1 + j];
        }

        int i=0, j = 0;
        for(int k=start; k<=end; k++) {
            if((j >= sizeOfRight) || (i < sizeOfLeft && aLeft[i] <= aRight[j])) {
                arr[k] = aLeft[i];
                i++;
            } else {
                arr[k] = aRight[j];
                j++;
            }
        }
    }


    public static void main(String... st) {
        int[] arr = {8, 5, 3, 7, 6, 2, 1, 4};
        System.out.println("Original Array : ");
        printArray(arr);
        mergeSort(arr, 0, arr.length-1);

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
