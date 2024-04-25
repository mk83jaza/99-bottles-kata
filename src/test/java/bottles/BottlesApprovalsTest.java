package bottles;

import com.github.larseckart.tcr.CommitOnGreenExtension;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@ExtendWith(CommitOnGreenExtension.class)
class BottlesApprovalsTest {

  private Bottles bottles;

  @BeforeEach
  void setUp() {
    bottles = new Bottles();
  }

  @Test
  void test_the_first_verse() {
    Approvals.verify(bottles.verse(99));
  }

  @Disabled("solve previous test first")
  @Test
  void test_another_verse() {
    Approvals.verify(bottles.verse(3));
  }

  @Disabled("solve previous test first")
  @Test
  void test_verse_2() {
    Approvals.verify(bottles.verse(2));
  }

  @Disabled("solve previous test first")
  @Test
  void test_verse_1() {
    Approvals.verify(bottles.verse(1));
  }

  @Disabled("solve previous test first")
  @Test
  void test_verse_0() {
    Approvals.verify(bottles.verse(0));
  }

  @Disabled("solve previous test first")
  @Test
  void test_a_couple_verses() {
    Approvals.verify(bottles.verses(99, 98));
  }

  @Disabled("solve previous test first")
  @Test
  void test_a_few_verses() {
    Approvals.verify(bottles.verses(2, 0));
  }

  @Disabled("solve previous test first")
  @Test
  void test_the_whole_song() {
    Approvals.verify(bottles.song());
  }
}
