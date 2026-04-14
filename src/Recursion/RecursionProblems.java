package Recursion;

import java.util.*;

public class RecursionProblems {
    public static void main(String[] args) {
//        printDecreasingIncreasing(5);
//        int res = fact(1);
//        System.out.println("Res "+ res);
//        int res = reverse(987654321, 0);
//        System.out.println(res);
//        gcd(12, 16);
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        recPrint(arr, 0);
//        System.out.println(numberPresent(arr, -1, 0));
//        String str = "abc";
//        List<String> list = new ArrayList<String>();
//        printSubsets("", str, 0, list);
//        Collections.sort(list);
//        System.out.println(list);
        int[] arr = {3, 34, 4, 12, 5, 2};
        int target = 9;
        List<Integer> list = new ArrayList<>();
        boolean ans = isSubsetSum(arr, 100, 0, list);
        System.out.println(ans);
    }

    public static void printDecreasingIncreasing(int n) {
        if (n == 0) return;
        System.out.println(n);
        printDecreasingIncreasing(n - 1);
        if (n != 1) {
            System.out.println(n);
        }
    }

    public static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }

    public static int power(int a, int b) {
        if (b == 0) return 1;
        int call = power(a, b / 2);
        if (b % 2 == 0) return call * call;
        else return a * call * call;
    }

    public static int reverse(int n, int r) {
        if (n == 0) {
            return r;
        }
        return reverse(n / 10, (r * 10) + (n % 10));
    }

    public static int findSum(int n) {
        if (n <= 1) return n;
        return n + findSum(n - 1);
    }

    public static void gcd(int n, int m) {
        int smallNum = Math.min(n, m);
        int res = 1;
        for (int i = 1; i < smallNum; i++) {
            if ((n % i == 0) && (m % i == 0)) {
                res = i;
            }
        }
        System.out.println(res);

    }

    public static void recPrint(int[] arr, int index){
        if(arr.length == index) return;
        System.out.println(arr[index]);
        recPrint(arr, index + 1);
    }

    public static boolean numberPresent(int[] arr, int target, int index){
        if(index == arr.length) return false;
        if(arr[index] == target){
            return true;
        }
        return numberPresent(arr, target, index+1);
    }

    public static void printSubsets(String ans, String str, int index, List<String> list){
        if(index == str.length()){
            if(ans.length() != 0) list.add(ans);
            return;
        }
//        char ch = str.charAt(index);
//        printSubsets(ans+ch, str, index+1, list); // pick
//        printSubsets(ans, str, index+1, list); // skip
        char ch = str.charAt(index);
        printSubsets(ans+ch, str, index + 1, list);
        printSubsets(ans, str, index+1 , list);
    }

    public static boolean isSubsetSum(int[] arr, int target, int index, List<Integer> list){
        if(index == arr.length){
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum+= list.get(i);
            }
            return sum == target;
        }
//        int value = arr[index];
//        list.add(value);
//        boolean pick = isSubsetSum(arr,target,index+1, list); // pick
//        list.remove(list.size() - 1); // backtrack
//        boolean skip =  isSubsetSum(arr,target,index+1, list);
//        return pick || skip;
        int value = arr[index];
        list.add(value);
        boolean pick = isSubsetSum(arr,target,index+1, list);
        list.remove(list.size() - 1);
        boolean skip = isSubsetSum(arr, target, index + 1, list);
        return pick || skip;
    }



}
