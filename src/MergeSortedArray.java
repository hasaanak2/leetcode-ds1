import java.util.Arrays;

/*
* Given 2 arrays merge and sort the arrays
* Print the value of the merged array
* and ensure the arrays values are sorted.
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] array1 = {2, 7, 13};
        int[] array2 = {11, 2, 5};

        int[] mergedArray = (array1, array2);
        int middleValue = (mergedArray);

        System.out.println("Merged and Sorted Array: " + Arrays.toString(mergedArray));
        System.out.println("Middle Value: " + middleValue);
    }



}
