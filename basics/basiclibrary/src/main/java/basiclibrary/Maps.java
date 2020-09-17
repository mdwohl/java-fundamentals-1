package basiclibrary;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Maps {
  public String weatherReport (int[][] weatherData) {
    HashSet<Integer> uniqueTemps = new HashSet<>();
    uniqueTemps.add(weatherData[0][0]);
    uniqueTemps.add(weatherData[0][1]);
//    String weather = uniqueTemps.toString(0);
    System.out.println(uniqueTemps);
    return "yes";
  }

  public String tally(List<String> plants) { // Jack Nelson and Marchael Acode unlocked this
      HashMap<String, Integer> votes = new HashMap<>();
      int count = 0;
      String winner = "someone";

      for (String name : plants) {
        if (votes.containsKey(name)) {
          count = votes.get(name);
        } else {
          count = 0;
        }
        votes.put(name, count +1);
      }

      Set<String> allTheNames = votes.keySet();

      for (String voteTotal : allTheNames ) { // https://www.javacodeexamples.com/iterate-through-java-hashmap-example/112#:~:text=How%20to%20iterate%20over%20Java%20HashMap%3F%201%20Iterate,Iterate%20through%20keys%20and%20values%20of%20the%20HashMap
        // is what got me to find the right mix of key value getter and setter values.
        if (votes.get(voteTotal) > count) {
          winner = voteTotal;
        }
        System.out.println(voteTotal);
        System.out.println(votes.get(voteTotal));
      }

    String toTheWinner = (winner + " received the most votes!");
    return toTheWinner;
  }
}
