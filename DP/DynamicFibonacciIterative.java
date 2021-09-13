package DP;

public class DynamicFibonacciIterative {
    private int dynamicFibonacciIterative(int data) {
        int[] arr = new int[data + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[data];
    }
    public static void main(String[] args) {
        DynamicFibonacciIterative func = new DynamicFibonacciIterative();

        System.out.println(func.dynamicFibonacciIterative(1));
        System.out.println(func.dynamicFibonacciIterative(2));
        System.out.println(func.dynamicFibonacciIterative(3));
        System.out.println(func.dynamicFibonacciIterative(4));
        System.out.println(func.dynamicFibonacciIterative(5));
        System.out.println(func.dynamicFibonacciIterative(10));
    }
}
