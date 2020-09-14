// import java.util.Random;

public class Main{
  public static void main(String[] args) {
    int dogCount = 0;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int gerbilCount = 1;
    System.out.println("I own " + gerbilCount + " " + pluralize("gerbil", gerbilCount) + ".");

    System.out.println(flipNHeads(5));
  }

  public static String pluralize(String word, int animalCount) {
    if (animalCount > 1 || animalCount == 0) {
      String pluralWord = word + 's';
      return pluralWord;
    } else {
      return word;
    }
  }

  public static String flipNHeads (int howManyFlips) {
    int theNumber = 0;
    int totalCount = 0;
    // for (int i = 0; i < 5; i++) {
    //   System.out.println("random number is " + Math.random());  
    // }
    while (theNumber != howManyFlips) { // w David Dicken, found that the Math.random is standard/built-in, no need to import.
      if (Math.random() < .5) {
        theNumber++;
        totalCount++;
      } else {
        totalCount++;
        theNumber = 0;
      }
    }
    return "It took " + totalCount + " flips to have " + howManyFlips + " heads in a row.";
  }
}