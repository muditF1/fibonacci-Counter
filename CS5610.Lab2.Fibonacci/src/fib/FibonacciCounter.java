package fib;

/**
 * This interface represents a single Fibonacci counter. Fibonacci counter is a machine which counts
 * the fibonacci numbers.
 */
public interface FibonacciCounter {

  /**
   * Return the current position in the fibonacci list numbers.
   * @return FibonacciCounter object with position/count increased by 1.
   */
  FibonacciCounter fibonacciCountIncrement();

  /**
   * Return the object of type FibonacciCounter which has the position/count decreased by 1.
   * @return FibonacciCounter object with position/count decreased by 1.
   */
  FibonacciCounter fibonacciCountDecrement();

  /**
   * Return the current position in the fibonacci list numbers.
   * @return current position in the fibonacci list numbers
   */
  int fibonacciCurrentCount();

  /**
   * Return the fibonacci number of the current position we ar pointing to.
   * @return fibonacci number of the current position we ar pointing to
   */
  long fibonacciCurrentCountNumber();
}
