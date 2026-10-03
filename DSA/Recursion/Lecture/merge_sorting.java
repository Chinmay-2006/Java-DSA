import java.util.*; // Imports utility classes from Java

public class merge_sorting {

    // Prints all elements of the array
    public static void printArr(int[] arr) {

        // Starts from index 0 and goes until the last index
        for (int i = 0; i < arr.length; i++) {

            // Prints the current array element
            System.out.print(arr[i] + " ");
        }

        // Moves the cursor to the next line after printing the array
        System.out.println();
    }


    // Divides the array into smaller parts and sorts them
    public static void mergeSort(int[] arr, int si, int ei) {

        // Stops recursion when the part contains 0 or 1 element
        if (si >= ei) {
            return;
        }

        // Finds the middle index without risking integer overflow
        int mid = si + (ei - si) / 2;

        // Recursively sorts the left half
        mergeSort(arr, si, mid);

        // Recursively sorts the right half
        mergeSort(arr, mid + 1, ei);

        // Merges the two sorted halves together
        merge(arr, si, mid, ei);
    }


    // Merges two already-sorted parts of the array
    public static void merge(int[] arr, int si, int mid, int ei) {

        // Creates a temporary array to store the merged result
        int temp[] = new int[ei - si + 1];

        // i points to the beginning of the left half
        int i = si;

        // j points to the beginning of the right half
        int j = mid + 1;

        // k represents the next empty position in temp
        int k = 0;


        // Continues comparing elements while both halves still have elements
        while (i <= mid && j <= ei) {

            // Checks which current element is smaller
            if (arr[i] < arr[j]) {

                // Places the smaller left-half element into temp
                temp[k] = arr[i];

                // Moves to the next element in the left half
                i++;

            } else {

                // Places the smaller right-half element into temp
                temp[k] = arr[j];

                // Moves to the next element in the right half
                j++;
            }

            // Moves to the next empty position in temp
            k++;
        }


        // Copies any remaining elements from the left half
        while (i <= mid) {

            // Puts the remaining left-half element into temp
            temp[k++] = arr[i++];

        }


        // Copies any remaining elements from the right half
        while (j <= ei) {

            // Puts the remaining right-half element into temp
            temp[k++] = arr[j++];

        }


        // Copies the sorted temp array back into the correct portion of arr
        for (k = 0; k < temp.length; k++) {

            // si + k maps temp's index back to the original array's index
            arr[si + k] = temp[k];
        }
    }


    // Program execution starts here
    public static void main(String args[]) {

        // Creates the unsorted array
        int arr[] = {6, 3, 9, 5, 2, 8};

        // Calls merge sort on the entire array
        mergeSort(arr, 0, arr.length - 1);

        // Prints the sorted array
        printArr(arr);
    }
}