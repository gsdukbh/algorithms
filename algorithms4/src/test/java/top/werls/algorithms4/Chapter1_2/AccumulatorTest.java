package top.werls.algorithms4.Chapter1_2;

import junit.framework.TestCase;

/**
 * @author JiaWei Lee
 * @since on   02 11月 2024
 */
public class AccumulatorTest extends TestCase {

  public void testDdev(){
    Accumulator accumulator = new Accumulator();
    accumulator.addDataValue(1);
    accumulator.addDataValue(2);
    accumulator.addDataValue(3);
    accumulator.addDataValue(4);
    accumulator.addDataValue(5);
    assertEquals(1.5811388300841898, accumulator.stddev());
  }
}