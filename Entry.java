/**
 * Entry represents the types that are used in stack.
 * @author leila
 *
 */

public class Entry {

  private int num;
  private Symbol sym;
  private String str;
  private Type atype;

  /**
   * Constructor for variable sym of type Symbol.
   * @param sym variable of type Symbol
   */
  public Entry(Symbol sym) {
    this.sym = sym;
  }

  /**
   * Constructor for variable atype of type Type.
   * @param atype variable of type Type
   */
  public Entry(Type atype) {
    this.atype = atype;
  }

  /**
   * Constructor for variable num of type integer.
   * @param num variable of type integer.
   */
  public Entry(int num) {
    this.num = num;
  }

  /**
   * Constructor for variable str of type String.
   * @param str variable of type string.
   */
  public Entry(String str) {
    this.str = str;
  }

  /**
   * Returns the value of integer variable num.
   * @return num
   */
  public int getValue() {
    return num;
  }

  /**
   * Takes the integer variable num and sets it to the value of i. 
   * @param i the value being set
   */
  public void setValue(int i) {
    num = i;
  }

  /**
   * Returns the Type variable type.
   * @return atype
   */
  public Type getType() {
    return atype;
  }

  /**
   * Returns the Symbol variable sym.
   * @return sym
   */
  public Symbol getSymbol() {
    return sym;
  }

  /**
   * Returns the string variable str.
   * @return str
   */
  public String getString() {
    return str;
  }

  /**
   * Creates the hashCode method. Tests for object inequality. 
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + num;
    result = prime * result + ((str == null) ? 0 : str.hashCode());
    result = prime * result + ((atype == null) ? 0 : atype.hashCode());
    result = prime * result + ((sym == null) ? 0 : sym.hashCode());
    return result;
  }

  /**
   * Creates the equals method. Tests if two objects are equal.
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Entry other = (Entry) obj;
    if (num != other.num) {
      return false;
    }
    if (str == null) {
      if (other.str != null) {
        return false;
      } 
    } else if (!str.equals(other.str)) {
      return false;
    }
    if (atype != other.atype) {
      return false;
    }
    if (sym != other.sym) {
      return false;
    }
    return true;
  }

  /**
   * toString method.
   */
  @Override
    public String toString() {
    return "Entry[Integer=" + num + ", Symbol=" + sym + ", String=" + str + ", Type=" + atype + "]";
  }
}