public class Main{
  public static void main(String[] args) {
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

  }

  public static String pluralize(String word, int animalCount) {
    if (animalCount > 1) {
      String pluralWord = word + 's';
      return pluralWord;
    } else {
      return word;
    }
  }
}