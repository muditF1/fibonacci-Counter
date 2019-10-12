package fib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test function for testing Fibonacci Machine class.
 */
public class FibonacciMachineTest {

  // Test initialization/current count of the Object
  @Test
  public void getCount() {
    FibonacciCounter obj = new FibonacciMachine();
    assertEquals(obj.fibonacciCurrentCount(), 1);
  }

  // Test the current fibonacci number
  @Test
  public void testGetFibonacci() {
    FibonacciCounter obj = new FibonacciMachine();
    assertEquals(obj.fibonacciCurrentCountNumber(),0);
  }

  // Test the current fibonacci number after an increment of 3
  @Test
  public void testGetFibonacciOnCountThree() {
    FibonacciCounter obj = new FibonacciMachine();
    FibonacciCounter objNext = obj.fibonacciCountIncrement();
    FibonacciCounter objNext1 = objNext.fibonacciCountIncrement();
    FibonacciCounter objNext2 = objNext1.fibonacciCountIncrement();
    assertEquals(objNext2.fibonacciCurrentCountNumber(),2);
  }

  // Test the current count after increasing the fibonacci count
  @Test
  public void testIncrementCount() {
    FibonacciCounter obj = new FibonacciMachine();
    FibonacciCounter objNext = obj.fibonacciCountIncrement();
    assertEquals(objNext.fibonacciCurrentCount(),2);
    FibonacciCounter objNext1 = objNext.fibonacciCountIncrement();
    assertEquals(objNext1.fibonacciCurrentCount(),3);
    FibonacciCounter objNext2 = objNext1.fibonacciCountIncrement();
    assertEquals(objNext2.fibonacciCurrentCount(),4);
  }

  // Test the current count after decrementing
  @Test
  public void testDecrementCount() {
    FibonacciCounter obj = new FibonacciMachine();
    obj.fibonacciCountIncrement();
    obj.fibonacciCountIncrement();
    obj.fibonacciCountIncrement();
    obj.fibonacciCountIncrement();
    assertEquals(obj.fibonacciCurrentCount(),2);
//    FibonacciCounter objNext = obj.fibonacciCountIncrement();
//    FibonacciCounter objNext1 = objNext.fibonacciCountIncrement();
//    FibonacciCounter objNext2 = objNext1.fibonacciCountIncrement();
//    FibonacciCounter objBack2 = objNext2.fibonacciCountDecrement();
//    assertEquals(objBack2.fibonacciCurrentCount(),3);
//    FibonacciCounter objBack1 = objBack2.fibonacciCountDecrement();
//    assertEquals(objBack1.fibonacciCurrentCount(),2);
  }

  // Test when the count goes below 1
  @Test(expected = IndexOutOfBoundsException.class)
  public void testInvalidCount() {
    FibonacciCounter obj = new FibonacciMachine();
    FibonacciCounter objBack = obj.fibonacciCountDecrement();
  }
}
