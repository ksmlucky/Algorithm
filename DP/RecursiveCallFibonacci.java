package DP;

public class RecursiveCallFibonacci {
    private int recursiveCallFibonacci(int data) {
        if (data <= 1) {
            return data;
        } else {
            return recursiveCallFibonacci(data - 1) + recursiveCallFibonacci(data - 2);
        }
    }

    public static void main(String[] args) {
        RecursiveCallFibonacci func = new RecursiveCallFibonacci();
        System.out.println(func.recursiveCallFibonacci(5));
        System.out.println(func.recursiveCallFibonacci(10));

    }
}
