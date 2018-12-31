
public class Loops {

    public static void main(String args[]) {
    printOneToTen();
    printOneToTenWithDifLoop();
    printUpToN(35);
    printEvenNumbersUpToN(15);
    printSumOfNumbersOneToTen();
    printSumOfNumbersOneToN(10000);
    printStringSNNumberOfTimes(11, "I love you");
        firstNFibonacciNumbers();
        sumOfNNumberOfFibonacciNumbers(8);
    }

    public static void printOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void printOneToTenWithDifLoop() {
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }
    }

    public static void printUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void printEvenNumbersUpToN(int n) {
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printSumOfNumbersOneToTen() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void printSumOfNumbersOneToN(int n) {
        int sum = 0;
        n = 10000;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

    public static void printStringSNNumberOfTimes(int n, String s) {
        for (int i = 1; i <= n; i++) {
            if (n < 0) {
                System.out.println("");
            } else {
                System.out.println(s + " " + s);
            }
        }
    }

    public static void firstNFibonacciNumbers() {
        int number1 = 0;
        int number2 = 1;
        int fib = 1;
        System.out.print(number1 + " " + number2 + " ");
        for (int count = 3; count <= 10; count++) {
            fib = number1 + number2;
            number1 = number2;
            number2 = fib;
            System.out.print(fib + " ");
        }
    }
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,

    public static void sumOfNNumberOfFibonacciNumbers(int n) {
        int number1 = 0;
        int number2 = 1;
        int fib;
        int sum = 1;
        for (int i = 3; i <= n; i++) {
            fib = number1 + number2;
            number1 = number2;
            number2 = fib;
            sum = sum + fib;
        }
        System.out.println("\nSum: " + sum);
    }

}


// DONE 1. Write a method that prints the numbers 1 through 10 using a loop.
// DONE 2. Write a method that prints the numbers 1 through 10 using a different kind of loop.
// DONE 3. Write a method that takes in an `int` n and prints the numbers 1 through n.
// DONE 4. Write a method that takes in an `int` n and prints the even numbers 2 through n.
// DONE 5. Write a method that prints the sum of 1 through 10 using a loop.
// DONE 6. Write a method that takes in an `int` n and prints the sum of the numbers 1 through n using a loop.
// DONE 7. Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.
// DONE 8. Write a method that takes in an `int` n and a `String` s and prints out s on its own line, n times. If n is negative, print "".
// DONE 9. Modify the method to print out the string concatenated with itself n times.
// DONE 10. Write a method that prints the first ten Fibonnaci numbers.
// DONE 11. Modify the method to sum the first ten Fibonnaci numbers.
// DONE 12. Modify the method to take in an `int` n and sum the first n Fibonnaci numbers.