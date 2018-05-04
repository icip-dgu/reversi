package assignment1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Reversi Test")
class ReversiTest {
  static Reversi reversi = new Reversi();

  @Test
  @DisplayName("Test reverseWords")
  void reverseWords() {
    assertEquals(
        reversi.reverseWords("the sky is blue"),
        "blue is sky the");
    assertEquals(
        reversi.reverseWords("   the   sky    is  blue   "),
        "blue is sky the");
    assertEquals(reversi.reverseWords("the"), "the");
    assertEquals(reversi.reverseWords("   the"), "the");
    assertNotEquals(
        reversi.reverseWords("the sky is blue"),
        "the");
    assertNotEquals(
        reversi.reverseWords("sky    is  blue   "),
        "blue is sky the");
  }
}