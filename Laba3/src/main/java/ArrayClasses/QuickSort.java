package ArrayClasses;

/**
 * Created by Egor on 25.11.2017.
 */
public class QuickSort {
     private int[] numbers;
     private int number;

    public void sort(int[] arr) {
        // check for empty or null array
        if (arr ==null || arr.length==0){
            return;
        }
        numbers = arr;
        number = arr.length;
        quicksort(0, number - 1);
    }

     private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            
            while (numbers[i] < pivot) {
                i++;
            }
            
            while (numbers[j] > pivot) {
                j--;
            }

         
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

     private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
