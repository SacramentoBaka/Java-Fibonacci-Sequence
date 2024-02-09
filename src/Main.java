import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("Hello, Welcome to Fibonacci Sequence number Generator");
        System.out.print("How Many number you want to be Generated: ");
        int num = input.nextInt();
        System.out.println();
        System.out.println("Okay now i'm printing " + num + " Numbers in the Fibonacci Series");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacciSeries2(i) + " ");
        }
        System.out.println("[ Index " + num + " contain a value " + fibonacciSeries2(num) + " ].");
    }
    public static long fibonacciSeries2 (long n) {

        long firstValue = 0;
        long secondValue = 1;
        long nextValue = 1;

        if (n == 0)
            return firstValue;
        else if (n == 1)
            return secondValue;
        else if (n == 2) {
            return nextValue;
        }
        for (int i = 3; i <= n; i++) {

            nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;
        }
        return nextValue;
    }
}