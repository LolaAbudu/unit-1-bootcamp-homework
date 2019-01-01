import java.util.*;

public class DataStructures {

    public static void main(String args[]) {
        ArrayList<Cat> myCats = new ArrayList<>();
        Cat cat1 = new Cat("Lisa");
        Cat cat2 = new Cat("John");
        Cat cat3 = new Cat("Strolly");
        Cat cat4 = new Cat("Moose");
        Cat cat5 = new Cat("Jack");

        myCats.add(cat1);
        myCats.add(cat2);
        myCats.add(cat3);
        myCats.add(cat4);
        myCats.add(cat5);

        for (Cat cat : myCats) {
            System.out.println(cat.getName());
        }


        HashMap<String, Integer> groupMembers = new HashMap<>();
        groupMembers.put("Lola",29);
        groupMembers.put("Sheriff",25);
        groupMembers.put("Naomy",24);
        groupMembers.put("Fribel",27);

        for(Map.Entry<String, Integer> entry :groupMembers.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Member: " + key + ", " + value + " years old.");
        }

        String[] numbers = {"mom", "moms", "momsm", "momsmo", "mom", "33", "1234", "321" };
        System.out.println(wordsWithoutList(numbers,3));

        ArrayList<Integer>myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(3);
        myArrayList.add(3);
        System.out.println(howManyClumps(myArrayList));

        String mySentence = "Hello Omolola Today Is Monday December 31st";
        System.out.println(alphabeticalOrderString(mySentence));
    }


    public static void mostFrequentElement(ArrayList<Integer> numbersArrayList) {
        Map<Integer, Integer> allNumbersMap = new HashMap<>();

        for (int i = 0; i < numbersArrayList.size(); i++) {
            int key = numbersArrayList.get(i);
            if (allNumbersMap.containsKey(key)) {
                int frequency = allNumbersMap.get(key);
                frequency++;
                allNumbersMap.put(key, frequency);
            } else {
                allNumbersMap.put(key, 1);
            }
        }

        int maxCount = 0;
        int maxNumber = 0;
        for (Map.Entry<Integer, Integer> value : allNumbersMap.entrySet()) {
            if (maxCount < value.getValue()) {
                maxNumber = value.getKey();
                maxCount = value.getValue();
            }
        }
        System.out.println("Most Frequent Number: " + maxNumber);
        System.out.println("Count: " + maxCount);
    }


    //for array of Strings
    public static void mostFrequentElement2(ArrayList<String> numbersArrayList) {
        Map<String, Integer> allNumbersMap = new HashMap<>();
        for (int i = 0; i < numbersArrayList.size(); i++) {
            String key = numbersArrayList.get(i);
            if (allNumbersMap.containsKey(key)) {
                int frequency = allNumbersMap.get(key);
                frequency++;
                allNumbersMap.put(key, frequency);
            } else {
                allNumbersMap.put(key, 1);
            }
        }

        int maxCount = 0;
        String maxNumber = "zero";
        for (Map.Entry<String, Integer> value : allNumbersMap.entrySet()) {
            if (maxCount < value.getValue()) {
                maxNumber = value.getKey();
                maxCount = value.getValue();
            }
        }
        System.out.println("Most Frequent Number: " + maxNumber);
        System.out.println("Count: " + maxCount);
    }




    public static boolean canRentACar(HashMap<String, Integer> groupMembers) {
        boolean result = false;
        for (int i = 0; i < groupMembers.size(); i++) {
            if (groupMembers.get(i) > 25) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }


    public static ArrayList<String> wordsWithoutList(String[] stringArray, int num){
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 0; i < stringArray.length; i++){
            if(stringArray[i].length() != num){
                numbers.add(stringArray[i]);
            }
        }
        return numbers;
    }

    public static int howManyClumps(ArrayList<Integer> numberElements){
        int counter = 0;
        boolean match = false;
        for(int i = 0; i < numberElements.size()-1; i++){
            if(numberElements.get(i).equals(numberElements.get(i+1)) && !match){
                match = true;
                counter++;
            }  else if (!numberElements.get(i).equals(numberElements.get(i+1))) {
                match = false;
            }
        }
        return counter;
    }

    public static ArrayList<String> alphabeticalOrderString(String sentence){
        String[] splitStrings = sentence.split(" ");
        Arrays.sort(splitStrings);
        ArrayList<String> brokenString = new ArrayList<>();
        for (String word : splitStrings){
            brokenString.add(word.toLowerCase());
        }
        return brokenString;
    }
}

//TODO ask how to check those method inside the main that require an arraylist
//DONE 1. Create an ArrayList of 5 Cats.
//DONE 2. Use a loop to print the contents of each object in the ArrayList.
//DONE 3. Write a method called `mostFrequentElement` that takes an ArrayList of Integers and finds the most frequently occurring
//  element in the ArrayList. At the end print the element and its number of occurrences. If there is more than one such element,
//  any one of them may be printed.
//**Bonus Challenge**
//DONE What needs to be changed to make this work on an array of Strings?
//DONE 4. 1. Create a HashMap that maps the names of all the Pursuit Fellows in your last group HW project to their age.
//DONE 2. Use a loop to print each key-value pair of the HashMap.
//DONE 5. Write a method called `canRentACar` that takes the Pod HashMap as a parameter and returns whether or not the Pod can rent a car.
//  If one or more studetns is over 25, it should return `true`. If no one in the Pod is over 25, it should return `false`.
// DONE 7. wordsWithoutList-Given an array of strings and an integer, write a method that return a an ArrayList where all the strings of
//  the given length are omitted.
// DONE 8. Say that a "clump" in an ArrayList is a series of 2 or more adjacent elements of the same value. Write a method that returns the
//  number of clumps in the given ArrayList.
// DONE 9. Write a method that takes a String sentence, breaks it up into an ArrayList of Strings (one word per ArrayList element), and
//  prints out the words in alphabetical order.
