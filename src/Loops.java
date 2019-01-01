
public class Loops {

    public static void main(String args[]) {
//    printOneToTen();
//    printOneToTenWithDifLoop();
//    printUpToN(35);
//    printEvenNumbersUpToN(15);
//    printSumOfNumbersOneToTen();
//    printSumOfNumbersOneToN(10000);
//    printStringSNNumberOfTimes(11, "I love you");
//    firstNFibonacciNumbers();
//    sumOfNNumberOfFibonacciNumbers(8);
//
//        System.out.println(sumNumbers("aa11b33"));
//        System.out.println(notReplace(("is-is")));
//        System.out.println(wordEnds("abcXY123XYijk", "XY"));

        for (int i = 10; i <= 50; i++) {
            for (int j = 10; j <= 50; j++) {
                if ((i + j) == 60 && Math.abs(i - j) == 14) {
                    System.out.print(i + ", " + j + "\n");
                }
            }
        }


        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "" + j + ", " + i + "+" + j + " = " + (i + j));
            }
        }
    }

    private static void printOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void printOneToTenWithDifLoop() {
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }
    }

    private static void printUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    private static void printEvenNumbersUpToN(int n) {
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void printSumOfNumbersOneToTen() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    private static void printSumOfNumbersOneToN(int n) {
        int sum = 0;
        n = 10000;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

    private static void printStringSNNumberOfTimes(int n, String s) {
        for (int i = 1; i <= n; i++) {
            if (n < 0) {
                System.out.println("");
            } else {
                System.out.println(s + " " + s);
            }
        }
    }

    private static void firstNFibonacciNumbers() {
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

    private static void sumOfNNumberOfFibonacciNumbers(int n) {
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

    private static int sumNumbers(String myString){
        int sum = 0;
        String numbersOnly = "";
        myString = myString + " ";
        for(int i = 0; i < myString.length(); i++){
            if(Character.isDigit(myString.charAt(i))){
                numbersOnly = numbersOnly + myString.charAt(i);
            } else if(!numbersOnly.equals("")){
                sum = sum + Integer.parseInt(numbersOnly);
                numbersOnly = "";
            }
        }
        return sum;
    }

    private static String notReplace(String myString) {
        String result = "";
        for (int i = 0; i < myString.length(); i++) {
           // if(myString.charAt(i) == 'i' && myString.charAt(i+1) == 's'){
            if (i - 1 >= 0 && Character.isLetter(myString.charAt(i - 1)) || i + 2 < myString.length() && Character.isLetter(myString.charAt(i + 2))) {
                result += myString.charAt(i);
            } else if(i + 1 < myString.length() && myString.substring(i, i + 2).equals("is")){
                result += "is not";
                i++;
            } else {
                result += myString.charAt(i);
            }
        }
        return result;
    }

    private static String wordEnds(String firstString, String wordString){
          int firstStringLength = firstString.length();
          int wordStringLength = wordString.length();
          String finalString = "";
          for (int i = 0; i < firstStringLength-wordStringLength+1; i++) {
            String word = firstString.substring(i,i+wordStringLength);
            if (i > 0 && word.equals(wordString))
              finalString += firstString.substring(i-1,i);
            if (i < firstStringLength-wordStringLength && word.equals(wordString))
              finalString += firstString.substring(i+wordStringLength,i+wordStringLength+1);
          }
          return finalString;
    }


}
//16. Number Puzzle
//Use nested for loops to generate a list of all the pairs of positive two digit numbers whose sum is 60, and whose difference is 14.

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

// DONE 13. sumNumbers`
//Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a
// series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0',
// '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
// DONE 14. Is Not
//Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
// The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does
// not count. (Note: Character.isLetter(char) tests if a char is a letter.)
// DONE 15. Between Words
//Given a string and a non-empty word string, return a string made of each char just before and just after every appearance
// of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included
// twice if it is between two words.
// DONE 16. Number Puzzle
//Use nested for loops to generate a list of all the pairs of positive two digit numbers whose sum is 60, and whose difference is 14.
// DONE 17. Digits
//Use nested for loops to generate a list of all the positive two digit numbers. Display the numbers, and the sums of their digits.
