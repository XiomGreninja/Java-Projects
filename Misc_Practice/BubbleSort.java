package Interview.Misc_Practice;

import java.util.Arrays;

// bubble sort = pairs of adjacent elements are compared, and the elements
//		            swapped if they are not in order.

//				 Quadratic time O(n^2)
//				 small data set = okay-ish
//				 large data set = BAD (plz don't)

public class BubbleSort {
    public static void main() {
        int[] numbers = {2,4,6,1};
        bubbleSortArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void bubbleSortArray(int[] array){
        boolean swapped;
        for (int i =0; i < array.length-1; i++){
            swapped = false;
            for (int j=0;j<array.length-i-1;j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
