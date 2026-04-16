package Recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 5, 6, 3, 9, 3, 7, -5,};
        mergeSort(arr);
        print(arr);
    }

    // divide and conquer technique used in merge sort O(nlogn)
    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n==1) return; // 1 length arr is always sorted
        // Step 1 : Create 2 new empty arrays of size n/2 each
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        // Step 2 : Copy and paste arr into a and b
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[index++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[index++];
        }
        // Step 3 : Magic on a and b for the sorting
        mergeSort(a);
        mergeSort(b);
        // Step 4 : Merge a and b into arr
        merge(a, b, arr);
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
    }

    private static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    int missingNumber(int[] arr){
        int n = 1 + arr.length;
        int i = 0;
        while(i< arr.length){
            if(arr[i] == i+1 || arr[i]==n) i++;
            else{
                int idx = arr[i]-1;
                swap(arr, i, idx);
            }
        }
        for(i=0; i< arr.length; i++){
            if(arr[i] != i+1) return i+1;
        }
        return n;
    }

    private void swap(int[] arr, int i, int idx) {
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }
}
