
public class Methods {

  public static void main (String args[]) {
    System.out.println(calculateSquare(10));

    System.out.println(calculateSquareRoot(25));

    System.out.println(toLowerCase("MONEY"));

    System.out.println(isMultiple(5, 30));

    prettyInteger(5);

    System.out.println(random(9,1000));
  }

  private static int calculateSquare(int number){
    return number * number;
  }

  private static double calculateSquareRoot(int number){
    return Math.sqrt(number);
  }

  private static String toLowerCase(String word){
    return word.toLowerCase();
  }

  private static boolean isMultiple(int number1, int number2){
    if(number2 % number1 == 0){
      return true;
    }
    return false;
  }

  private static void prettyInteger(int number){
    for (int i=0; i<number; i++){
      System.out.print("*");
    }
    System.out.print(number);
    for (int i=0; i<number; i++){
      System.out.print("*");
    }
  }

  private static int random(int number1, int number2){
    int randomNumber = (int) (Math.random() * ((number1-1) - number2)) + number2;
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
