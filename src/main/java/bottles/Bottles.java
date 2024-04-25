package bottles;

public class Bottles {

  public String verse(int amountOfBottles) {
    int nextAmountOfBottles = amountOfBottles - 1;
    String result =
        amountOfBottles + " bottles of beer on the wall, " + amountOfBottles + " bottles of beer.\n"
        + "Take one down and pass it around, " + nextAmountOfBottles;
    if (nextAmountOfBottles == 1) {
      result += " bottle of beer on the wall.\n";
    } else {
      result += " bottles of beer on the wall.\n";
    }

    return result;
  }

  public String verses(int upper, int lower) {
    throw new UnsupportedOperationException();
  }

  public String song() {
    throw new UnsupportedOperationException();
  }
}
