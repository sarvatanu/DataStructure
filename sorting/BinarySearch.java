package sorting;

public class BinarySearch {

    static int binarySarch(int[] arr, int numberToFind, int low, int max) {

        if (low > max) {
            return -1;
        }

       int mid  = (low+max)/2;

        if(arr[mid] == numberToFind) {
            return mid;
        } else if(arr[mid] > numberToFind) {
            return binarySarch(arr, numberToFind, low, mid-1);
        } else {
            return binarySarch(arr, numberToFind,mid + 1, max);
        }
    }

    public static void main(String... st) {
        int[] arr = {1,2,3,4,5,6,7,8};

        int foundIndex  = binarySarch(arr, 1, 0, arr.length);
        System.out.println(String.format("Found elememt %s at index %s", 1, foundIndex));
    }


}
