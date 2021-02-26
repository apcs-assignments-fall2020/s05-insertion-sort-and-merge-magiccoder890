import java.util.ArrayList;

public class MyMain {

    // Sorts the ArrayList using insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        // YOUR CODE HERE
        int n = list.size();
        for (int a = 0; a < n; a ++){
            int num1 = list.get(a);
            int i = a - 1;
            while ((i > -1) && (list.get(i) > num1)){
                list.set(i + 1, list.get(i));
                i--;
            }
            list.set(i + 1, num1);
        }

        return list;
    }

     // Merges two sorted arrays into one large combined
     // sorted array
     // You may assume arr1 and arr2 are the same length
    public static int[] merge(int[] arr1, int[] arr2) { 
        // YOUR CODE HERE
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0,j = 0, k = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                mergedArray[k] = arr1[i];
                i++;
                k++;
            }
            else{
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length){
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length){
           mergedArray[k] = arr2[j];
           j++;
           k++;
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
