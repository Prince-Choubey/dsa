package Sorting;

import java.util.*;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 5, 6, 3, 9, 3, 7, -5,};
    }

    int missingNumber(int[] arr) {
        int n = 1 + arr.length;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1 || arr[i] == n) i++;
            else {
                int idx = arr[i] - 1;
                swap(arr, i, idx);
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) return i + 1;
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
                if (arr[idx] == arr[i]) {
                    return arr[idx];
                }
                swap(arr, i, idx);
            }
        }
        return -1;
    }

    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while (i < arr.length) {
            int idx = arr[i] - 1;
            if (arr[i] == i + 1 || arr[idx] == arr[i]) {
                i++;
            } else {
                swap(arr, i, idx);
            }
        }

        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                res.add(arr[i]);
            }
        }
        return res;
    }

    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while (i < arr.length) {
            int idx = arr[i] - 1;
            if (arr[i] == i + 1 || arr[idx] == arr[i]) {
                i++;
            } else {
                swap(arr, i, idx);
            }
        }

        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                res.add(i+1);
            }
        }
        return res;
    }

    public int[] findErrorNums(int[] arr) {
        int[] res = new int[2];
        int n = arr.length;
        int i = 0;
        while (i < arr.length) {
            int idx = arr[i] - 1;
            if (arr[i] == i + 1 || arr[idx] == arr[i]) {
                i++;
            } else {
                swap(arr, i, idx);
            }
        }

        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                res[0] = arr[i];
                res[1] = i + 1;
            }
        }
        return res;
    }

    private void swap(int[] arr, int i, int idx) {
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }
}
