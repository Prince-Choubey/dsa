//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        binarySearchFirstOccurence(arr, 6);
    }

    public static void binarySearch1(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                System.out.println("Answer Found");
                return;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Not Found");
    }

    public static void binarySearchFirstOccurence(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                    ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if(ans == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Found At " + ans);
        }

    }


}