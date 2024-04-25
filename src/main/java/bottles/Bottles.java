package bottles;

public class Bottles {

  public String verse(int amountOfBottles) {
    String result =
        amountOfBottles + " bottles of beer on the wall, " + amountOfBottles + " bottles of beer.\n"
        + "Take one down and pass it around, " + (amountOfBottles - 1);
    String temp =
        amountOfBottles - 1 == 1 ? " bottle of beer on the wall.\n"
            : " bottles of beer on the wall.\n";

    return result + temp;
  }

  public String verses(int upper, int lower) {
    throw new UnsupportedOperationException();
  }

  public String song() {
    throw new UnsupportedOperationException();
  }
}
