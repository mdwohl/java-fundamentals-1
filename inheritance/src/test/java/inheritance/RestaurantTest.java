/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void testRestaurantConstructor() {
        Restaurant newRestaurant = new Restaurant("Serafina", 4, 3);
        assertEquals("Name should be Serafina", "Serafina", newRestaurant.name);
    }

    @Test public void testRestaurantString() {
        Restaurant newRestaurant = new Restaurant("Serafina", 4, 3);
        assertEquals("Here's the toString result.", "Name: Serafina Stars: 4 Price Category: 3", newRestaurant.toString());
    }

    @Test public void testRestaurantReviewAdd() {
        Review newReview = new Review("Serafina", 4, 3, "A fantastic place to eat! \nThe very best!", "Paul O'Brien");
        Review secondReview = new Review("Serafina", 1, 3, "A fantastic place to eat! \nThe very best!", "Paul O'Brien");
        Restaurant newRestaurant = new Restaurant("Serafina", 4, 3);
        newRestaurant.addReview(newReview);
        newRestaurant.addReview(secondReview);
        assertEquals("Average reviews should be 2.", 2, newRestaurant.stars);
    }
}
