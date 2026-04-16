package Sorting;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 5, 6, 3, 9, 3, 7, -5,};
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

    public int findDuplicate(int[] arr) {
        int n = arr.length - 1;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1) {
                i++;
            } else {
                int idx = arr[i] - 1;
                if(arr[idx] == arr[i]){
                    return arr[idx];
                }
                swap(arr, i, idx);
            }
        }
        return -1;
    }

    private void swap(int[] arr, int i, int idx) {
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }
}
