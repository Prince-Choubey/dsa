package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }

    private static void hanoi(int n, char source, char helper, char destination) {
//        if(n==0) return;
//        // n-1 disks from A to B via C
//        hanoi(n-1, source, destination, helper);
//        // largest from A to C
//        System.out.println(source + " -> " + destination);
//        // n-1 disks from B to C via A
//        hanoi(n-1, helper, source, destination);
        if(n==0) return;
        hanoi(n-1, source, destination, helper);
        System.out.println(source + " -> " + destination);
        hanoi(n-1, helper, source, destination);
    }
}
