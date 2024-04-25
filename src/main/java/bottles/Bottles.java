package bottles;

public class Bottles {

  public String verse(int amountOfBottles) {
    return amountOfBottles + " bottles of beer on the wall, " + amountOfBottles + " bottles of beer.\n" +
           "Take one down and pass it around, " + (amountOfBottles - 1) + " bottles of beer on the wall.\n";
  }

  public String verses(int upper, int lower) {
    throw new UnsupportedOperationException();
  }

  public String song() {
    throw new UnsupportedOperationException();
  }
}
