
public class ClassesAndObjects {

  public static void main (String args[]) {

    Person john = new Person("John");


    Cat garfield = new Cat("Garfield");
    garfield.setFavoriteFood("Lasagna");
    garfield.setAge(4);
    garfield.setOwner(john);
    Cat pinkPanther = new Cat("Pink Panther");
    pinkPanther.setFavoriteFood("Pizza");
    pinkPanther.setAge(10);
    pinkPanther.setOwner(john);
    Cat catwoman = new Cat("Catwoman");
    catwoman.setFavoriteFood("Hamburger");
    catwoman.setAge(15);

    System.out.println(isOlder(garfield, pinkPanther));

    System.out.println(makeKitten(garfield,catwoman));

    adoption(garfield,john);

    System.out.println(isFree(pinkPanther));

    System.out.println(isSibling(garfield,pinkPanther));
  }

  public static boolean isOlder(Cat cat1, Cat cat2){
    int first = cat1.getAge();
    int second = cat2.getAge();
    if(first > second){
      return true;
    }
    return false;
  }

  public static void makeBestFriends(Cat cat1, Cat cat2){
    String favFood = "Pizza";
    cat1.setFavoriteFood(favFood);
    cat2.setFavoriteFood(favFood);
  }

  //TODO cant make this return the cat name
  public static Cat makeKitten(Cat cat1, Cat cat2){
    Cat newCat = new Cat();
    newCat.setName(cat1.getName() + cat2.getName());
    newCat.setAge(0);
    return newCat;
   // a Cat named "GarfieldCatwoman" with age 0
  }

  public static void adoption(Cat cat1, Person person1){

    if(cat1.getName().equals("Catwoman")){
      System.out.println("Catwoman will never be anyone's pet!");
    }else {
      cat1.setOwner(person1);
      System.out.println(person1.getName() + " is now " + cat1.getName() + " owner!");
    }
  }

  public static boolean isFree(Cat catName){
    if(catName.getOwner() != null){
      return true;
    }
    return false;
  }

  public static boolean isSibling(Cat cat1, Cat cat2){
    if(cat1.getOwner().equals(cat2.getOwner())){
      return true;
    }
    return false;
  }
}


//Complete these exercises in `ClassesAndObjects.java`. Please use the `Cat.java` and `Person.java` classes to complete these exercises.
//
//#### DONE 1. Cool Cats
//1. Create 3 cats named `Garfield`, `Pink Panther`, and `Catwoman`.
//2. Assign each of them a favorite food (Garfield's favorite food should be `Lasagna`).
//3. Assign each of them an age.
//
//#### DONE 2. isOlder
//Write a method called `isOlder` that takes 2 Cats as parameters and returns whether or not the first Cat is older than the second.
//ex: // if Garfield is 9 years old and Catwoman is 10 years old
//    isOlder(garfield, catwoman) returns false
//```
//#### DONE 3. Best Friends
//Write a method called `makeBestFriends` that takes 2 Cats as parameters and sets both of their favorite foods to the same thing.
//*Hint: this method does not return anything!*
//
//#### ALMOST 4. Kitten
//Write a method called `makeKitten` that takes 2 Cats as parameters and returns a new Cat with a name that is the combination of
// the 2 parent Cats' names. The age of the new Cat should be `0`.
//ex: makeKitten(garfield, catwoman) returns a Cat named "GarfieldCatwoman" with age 0
//```
//#### DONE 5. Adoption
//Write a method called `adoption` that takes 1 Cat and 1 Person as a paramater and sets the Cat's owner to be the Person.
//ex: Person jon = Person('Jon');
//    adoption(garfield, jon); // Jon is now Garfield's owner!
//*Hint: this method does not return anything!*
//
// DONE **Bonus Challenge**
//If the Cat's name is `Catwoman`, don't set the owner, but instead print: "Catwoman will never be anyone's pet!"
//
//#### 6. isFree
//Write a method called `isFree` that checks whether or not a Cat has an owner.
//ex: isFree(garfield) returns false
//```
//#### DONE 7. isSibling
//Write a method called `isSibling` that checks whether or not 2 Cats have the same owner.