package inheritance;

public class Review extends Restaurant {

  String body;
  String author;

  public Review(String name, int stars, int priceCategory, String body, String author) {
    super(name, stars, priceCategory);
    this.body = body;
    this.author = author;
  }

  public String toString() {
    return String.format("Review of: %s By Author: %s \nBody: \n%s", name, author, body);
  }
}

// TODO: associated TESTing