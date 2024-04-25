package bottles;

public class Bottles {

  public String verse(int amountOfBottles) {
//    if (amountOfBottles == 1) {
//      return "1 bottle of beer on the wall, 1 bottle of beer.\n" +
//          "Take it down and pass it around, no more bottles of beer on the wall.\n";
//    }
    int nextAmountOfBottles = amountOfBottles - 1;
    String result = "";
        if (amountOfBottles == 1) {
          result += "1 bottle of beer on the wall, 1 bottle of beer.\n";
          result += "Take it down and pass it around, no more";
        } else {
          result += amountOfBottles + " bottles of beer on the wall, " + amountOfBottles + " bottles of beer.\n";
          result += "Take one down and pass it around, " + nextAmountOfBottles;
        }
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
