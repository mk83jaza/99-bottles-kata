package bottles;

public class Bottles {

  public String verse(int amountOfBottles) {
    String result =
        amountOfBottles + " bottles of beer on the wall, " + amountOfBottles + " bottles of beer.\n"
        + "Take one down and pass it around, " + (amountOfBottles - 1);
    if (amountOfBottles - 1 == 1) {
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
