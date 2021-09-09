public class RecursiveCall {
    private int factorial(int number) {
        if (number > 1) {
            return number = factorial(number - 1) * number;
        } else {
            return 1;
        }
    }

    private int problem(int number) {
        if (number == 1) {
            return 1;
        } else if (number == 2) {
            return 2;
        } else if (number == 3) {
            return 4;
        } else {
            return problem(number - 3) + problem(number - 2) + problem(number - 1);
        }
    }

    public static void main(String[] args) {
        RecursiveCall func = new RecursiveCall();

        System.out.println(func.factorial(10));
        System.out.println(func.problem(5));
    }
}
