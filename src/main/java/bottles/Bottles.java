package bottles;

import java.util.List;

public class Bottles {

  public String verse(int amountOfBottles) {
    int nextAmountOfBottles = amountOfBottles - 1;
    String result = "";
    if (amountOfBottles == 0) {
      result += "No more bottles of beer on the wall, no more bottles of beer.\n";
    } else if (amountOfBottles == 1) {
      result += amountOfBottles + " bottle of beer on the wall, " + amountOfBottles
                + " bottle of beer.\n";
      result += "Take it down and pass it around, no more";
    } else {
      result += amountOfBottles + " bottles of beer on the wall, " + amountOfBottles
                + " bottles of beer.\n";
      result += "Take one down and pass it around, " + nextAmountOfBottles;
    }
    if (nextAmountOfBottles == 1) {
      result += " bottle of beer on the wall.\n";
    } else if (nextAmountOfBottles == -1) {
      result += "Go to the store and buy some more, 99 bottles of beer on the wall.";
    } else {
      result += " bottles of beer on the wall.\n";
    }

    return result;
  }

  public String verses(int upper, int lower) {
    String result = "";
    for (int i = upper; i >= lower; i--) {
      result += verse(i);
      if (!(i == lower)) {
        result += "\n";
      }
    }
    return result;
  }

  public String song() {
    return verses(99, 0);
  }
}
