import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Stack class which contains all the methods to successfully create a stack.
 * @author leila
 */
public class Stack {

  private int size = 0;
  private Entry[] arr = new Entry[100]; //array to hold the stack.

  /**
   * Returns true/false, depending if the variable size is equal to 0.
   * @return size
   */
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * Places the new entry in the stack to the top.
   * @param entry variable being pushed onto the stack.
   */
  public void push(Entry entry) {
    arr[size++] = entry;
  }

  /**
   * Returns an array called arr with a decrement in size, removes item at top of stack.
   * @return arr
   */
  public Entry pop() throws EmptyStackException {
    return arr[--size];
  }
    
  /**
   * Returns the array, arr.
   * @return arr
   */
  public Entry top() throws EmptyStackException {
    return arr[size - 1];
  }
    
  /**
   * Returns the integer variable size.
   * @return size
   */
  public int size() {
    return size;
  }

  /**
   * toString method, returns the stack in a string form.
   */
  @Override
    public String toString() {
    return "Stack [size=" + size + ", arr=" + Arrays.toString(arr) + "]";
  } 
}