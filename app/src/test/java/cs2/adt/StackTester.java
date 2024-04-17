package cs2.adt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTester {
  private Stack<Integer> s;

  @BeforeEach
  void init() {
    s = new ArrayStack<Integer>();
  }

  @Test
  void testPushPop() {
    assertTrue(s.isEmpty());
    s.push(7);
    assertFalse(s.isEmpty());
    assertEquals(s.peek(), 7);
    assertEquals(s.pop(), 7);
    assertTrue(s.isEmpty());
    //s.pop();
  }
}
