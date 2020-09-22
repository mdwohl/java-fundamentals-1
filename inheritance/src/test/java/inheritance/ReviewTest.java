package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {
  @Test public void testReviewConstructor() {
    Review newReview = new Review("Serafina", 4, 3, "A fantastic place to eat! \nThe very best!", "Paul O'Brien");
    assertEquals("Body should be", "A fantastic place to eat! \nThe very best!", newReview.body);
  }

  @Test public void testReviewString(){
    Review newReview = new Review("Serafina", 4, 3, "A fantastic place to eat! \nThe very best!", "Paul O'Brien");
    assertEquals("This is the Review.", "Review of: Serafina By Author: Paul O'Brien \nBody: \nA fantastic place to eat! \nThe very best!", newReview.toString());
  }
}
