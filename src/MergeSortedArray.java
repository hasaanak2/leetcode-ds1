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
    private static int[] mergeAndSort(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        Arrays.sort(mergedArray);
        return mergedArray;
    }



}
