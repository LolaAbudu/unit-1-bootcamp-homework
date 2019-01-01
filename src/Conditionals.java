
public class Conditionals {

  public static void main (String args[]) {
    Person john = new Person();
    john.setCity("London");
    john.setName("John");
    Person susana = new Person();
    susana.setCity("Paris");
    susana.setName("Susana");


    System.out.println(isOdd(11));

    System.out.println(isMultipleOfThree(9));

    System.out.println(isOddAndIsMultipleOfThree(9));

    System.out.println(isOddAndIsMultipleOfThree2(12));

    fizzMultipleofThree(18);

    System.out.println(fromLondon(susana));

    nameLongerThan5Characters(john);

    System.out.println(cigarParty(30, true));

    System.out.println(caughtSpeeding(65, true));

    System.out.println(alarmClock(5,false));

    System.out.println(lotteryTicket(1,2,3));

    System.out.println(blackjack(18,20));

    System.out.println(evenlySpaced(5,6,4));
  }

  private static boolean isOdd(int n){
    if(n % 2 != 0){
      return true;
    }
    return false;
  }

  private static boolean isMultipleOfThree(int n){
    if(n % 3 == 0){
      return true;
    }
    return false;
  }

  private static boolean isOddAndIsMultipleOfThree(int n){
    if(n % 2 != 0 && n % 3 == 0){
      return true;
    }
    return false;
  }

  private static boolean isOddAndIsMultipleOfThree2(int n){
    if(isOdd(n) && isMultipleOfThree(n)){
      return true;
    }
    return false;
  }

  private static void fizzMultipleofThree(int n){
    if(n % 3 == 0){
      System.out.println("Fizz");
    }else{
      System.out.println(n);
    }
  }

  private static boolean fromLondon(Person person){
    if(person.getCity().equals("London")){
      return true;
    }
    return false;
  }

  private static void nameLongerThan5Characters(Person person){
    if(person.getName().length() > 5){
      System.out.println(person.getName());
    }else{
      System.out.println("Name is too short");
    }
  }

  private static boolean cigarParty(int cigarNum, boolean isWeekend){
    if(isWeekend && cigarNum >= 40){
      return true;
    }
    else if(cigarNum >= 40 && cigarNum <= 60){
      return true;
    }
    return false;
  }

  private static int caughtSpeeding(int speedNum, boolean isBirthday){
    int ticket;
    if(speedNum <= 60 && !isBirthday || speedNum <= 65 && isBirthday){
      ticket = 0;
    }else if(speedNum <= 80 && !isBirthday || speedNum <= 85 && isBirthday){
      ticket = 1;
    }else {
      ticket = 2;
    }
    return ticket;
  }

  private static String alarmClock(int dayOfWeek, boolean onVaca){

    String alarmRing = "off";
    switch (dayOfWeek){
      case 0: case 6:
        if(onVaca) {
          alarmRing = "off";
          break;
        }else {
          alarmRing = "10:00";
          break;
        }
      case 1: case 2: case 3: case 4: case 5:
        if(onVaca) {
          alarmRing = "10:00";
          break;
        }else {
          alarmRing = "7:00";
          break;
        }
    }
    return alarmRing;
  }

  private static int lotteryTicket(int a, int b,int c){
    int result;
    if(a == b && a == c){
      result = 20;
    } else if(a == b || a == c || b == c){
      result = 10;
    }else {
      result = 0;
    }
    return result;
  }

  //TODO try making this better
  private static int blackjack(int value1, int value2){
    int result = 0;
    if(value1 > 21 && value2 > 21){
      return result;
    } else if(value1 < 22 && value1 > value2){
      return value1;
    } else if(value2 < 22 && value2 > value1){
      return value2;
    } else if (value1 > 21){
      return value2;
    } else if (value2 > 21){
      return value1;
    }
    return result;
  }

  private static boolean evenlySpaced(int a, int b, int c){
    int aMinusB = a-b;
    int bMinusC = b-c;
    int aMinusC = a-c;
    int cMinusB = c-b;
    int cMinusA = c-a;
    if((aMinusB == bMinusC) || (aMinusC == cMinusB) || (aMinusB == cMinusA)){
      return true;
    }
    return false;
  }
}


//DONE 1. Write a method `isOdd` that takes in an `int` n. Returns a `true` if n is odd, and `false` otherwise.
//DONE 2. Write a method `isMultipleOfThree` that takes in an `int` n. Returns `true` if n is a multiple of three, and `false` otherwise.
//DONE 3. Write a method `isOddAndIsMultipleOfThree` that takes in an `int` n. Returns `true` if n is both odd and a multiple of three,
// and false otherwise.
//4.DONE Write a method `isOddAndIsMultipleOfThree2` - if you used `isOdd` and `isMultipleofThree` in your last solution, don't use it
// this time. If you did not, write this method building on your last methods.
//5.DONE Write a method `fizzMultipleofThree` that takes in an `int` n and prints "Fizz" if n is a multiple of three, and prints n otherwise.

//5.DONE Write a method that takes in a `Person` and returns `true` if the person is from London, and `false` otherwise.
//6.DONE Write a method that takes in a `Person` and prints the name if the person has a name longer than 5 characters, and otherwise prints
// "Name is too short."

//## Exercises++
//
//#### 1.DONE Cigar Party
//
//When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is
// between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars.
// Write a method called `cigarParty` that takes an `int` (the number of cigars) and `boolean` (whether or not it is the weekend)
// as parameters, and returns `true` if the party with the given values is successful, or `false` otherwise.
//
//#### 2. DONE Caught Speeding
//
//You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value:
// 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive,
// the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher
// in all cases.
//
//```
//caughtSpeeding(60, false) → 0
//caughtSpeeding(65, false) → 1
//caughtSpeeding(65, true) → 0
//```
//
//#### 3.DONE Alarm Clock
//
//Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string
// of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should
// be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
//
//```
//alarmClock(1, false) → "7:00"
//alarmClock(5, false) → "7:00"
//alarmClock(0, false) → "10:00"
//```
//
//#### 4.DONE Lottery Ticket
//
//You have a green lottery ticket, with `int`s a, b, and c on it. If the numbers are all different from each other, the result is 0.
// If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10. Write a method that
// takes 3 `int`s as parameters and returns the correct result.
//
//#### 5.DONE Blackjack
//
//Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
//
//```
//blackjack(19, 21) → 21
//blackjack(21, 19) → 21
//blackjack(19, 22) → 19
//```
//
//#### 6.DONE Evenly Spaced
//
//Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced,
// so the difference between small and medium is the same as the difference between medium and large.
//
//```
//evenlySpaced(2, 4, 6) → true
//evenlySpaced(4, 6, 2) → true
//evenlySpaced(4, 6, 3) → false