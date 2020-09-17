package basiclibrary;

public class DuplicateFinder {
  public boolean duplicatePresent(double[] toCheckAgainst) {
    boolean isThereADuple = false;
    double currentCheck = 0.0;

    for (int i = 0; i < toCheckAgainst.length; i++)
      currentCheck = toCheckAgainst[i];
      for (int j = 0; j < toCheckAgainst.length; j++)
        if (currentCheck == toCheckAgainst[j]) {
          isThereADuple = true;
          break;
        }
    return isThereADuple;
  }
}
