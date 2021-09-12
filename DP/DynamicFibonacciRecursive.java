package DP;

public class DynamicFibonacciRecursive {
    static int[] arr = new int[11];

    private int dynamicFibonacciRecursive(int data) {
        arr[0] = 0;
        arr[1] = 1;

        if (data <= 1) {
            return data;
        } else {
            if (arr[data] == 0) {
                arr[data] = dynamicFibonacciRecursive(data - 1) + dynamicFibonacciRecursive(data - 2);
                return arr[data];
            } else {
                return arr[data];
            }
        }
    }
    public static void main(String[] args) {
        DynamicFibonacciRecursive func = new DynamicFibonacciRecursive();

        System.out.println(func.dynamicFibonacciRecursive(1));
        System.out.println(func.dynamicFibonacciRecursive(2));
        System.out.println(func.dynamicFibonacciRecursive(3));
        System.out.println(func.dynamicFibonacciRecursive(4));
        System.out.println(func.dynamicFibonacciRecursive(5));
        System.out.println(func.dynamicFibonacciRecursive(10));
    }
}
