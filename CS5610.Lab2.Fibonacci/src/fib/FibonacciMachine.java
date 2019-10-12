/**
 * Represents the fibonacci counter machine.
 */

package fib;

/**
 * Class which implements the functionalities of Fibonacci counter.
 */
public class FibonacciMachine implements FibonacciCounter {
  private int count;

  /**
   * Constructor for initializing the object to set the count as 1 in the start.
   */
  public FibonacciMachine() {
    this.count = 1;
  }

  @Override
  public FibonacciCounter fibonacciCountIncrement() {
    int newCount = count + 1;
    FibonacciMachine countIncrement = new FibonacciMachine();
    countIncrement.updateCount(newCount);
    return countIncrement;
  }

  @Override
  public FibonacciCounter fibonacciCountDecrement() throws IndexOutOfBoundsException {
    int newCount = count - 1;
    // throw when the count goes below 1
    if (newCount <= 0) {
      throw new IndexOutOfBoundsException("Cannot get a Fibonacci number for zero or "
              + "negative count");
    }

    FibonacciMachine countDecrement = new FibonacciMachine();
    countDecrement.updateCount(newCount);
    return countDecrement;
  }

  @Override
  public int fibonacciCurrentCount() {
    return count;
  }

  @Override
  public long fibonacciCurrentCountNumber() {
    return calculateFibonacciNumber(count - 1);
  }

  /** Helper function to update the count value.
   * @param newCount this is the updated count for increment/decrement.
   */
  private void updateCount(int newCount) {
    this.count = newCount;
  }

  /** Function to calculate the Fibonacci Number.
   * @param index the index in the fibonacci list for which we want the number.
   * @return fibonacci number corresponding to the index in the fibonacci list.
   */
  private long calculateFibonacciNumber(int index) {
    if (index == 0) {
      return 0;
    }
    else if (index == 1) {
      return 1;
    }
    else {
      return calculateFibonacciNumber(index - 1) + calculateFibonacciNumber(index - 2);
    }
  }
}
