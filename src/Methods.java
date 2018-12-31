
public class Methods {

  public static void main (String args[]) {
    System.out.println(calculateSquare(10));

    System.out.println(calculateSquareRoot(25));

    System.out.println(toLowerCase("MONEY"));

    System.out.println(isMultiple(25, 4));

    prettyInteger(5);

    System.out.println(random(5,1000));
  }

  public static int calculateSquare(int number){
    return number * number;
  }

  public static double calculateSquareRoot(int number){
    double squareRoot = Math.sqrt(number);
    return squareRoot;
  }

  public static String toLowerCase(String word){
    return word.toLowerCase();
  }

  //TODO ITS NOT WORKING
  public static boolean isMultiple(int number1, int number2){
    if(number2 % number1 == 0){
      return true;
    }
    return false;
  }

  public static void prettyInteger(int number){
    for (int i=0; i<number; i++){
      System.out.print("*");
    }
    System.out.print(number);
    for (int i=0; i<number; i++){
      System.out.print("*");
    }
  }

  public static int random(int number1, int number2){
    int randomNumber = (int) (Math.random() * (number1 - number2)) + number2;
    System.out.println("");
    return randomNumber;
  }

  // DONE Write a method called `calculateSquare` that takes an int as a parameter and returns the square of that integer.
  // DONE Write a method called `calculateSquareRoot` that takes an int as a parameter and returns the square root of that integer.
  // DONE Write a method called `toLowerCase` that takes a String as a parameter and returns the String in lower case.
  // ALMOST Write a method called `isMultiple` that takes 2 int parameters and determines if the second is a multiple of the first.
  // DONE Write a method called `prettyInteger` that takes an int as a parameter and prints the integer surrounded by asterisks
  //    with the length of each side equal to the given integer.
  // DONE Write a method called `random` that takes 2 ints as parameters and returns a random int within that range.
}
