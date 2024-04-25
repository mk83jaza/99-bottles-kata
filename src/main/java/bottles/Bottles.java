package bottles;

public class Bottles {

  public String verse(int n) {
    return n + " bottles of beer on the wall, " + n + " bottles of beer.\n" +
           "Take one down and pass it around, " + (n - 1) + " bottles of beer on the wall.\n";
  }

  public String verses(int upper, int lower) {
    throw new UnsupportedOperationException();
  }

  public String song() {
    throw new UnsupportedOperationException();
  }
}
