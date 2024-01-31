public class Number {
  private int num;
  private int[] numArray;

  public void setNum(int... number) {
    // this.num = number.length;
    this.numArray = number;
  }

  public int[] getNum() {
    // return this.num;
    return this.numArray;
  }

  public String toString() {
    String s = new String();
    for (int a : this.numArray) {
      s = s + a;
    }
    return s;
  }

  void sdsd() {
    System.out.println("hello");
  }

  int divide(int a, int b) {
    return (float) a / b;
    int x = 1;
    (float)a; // 1.0
    float y = 1.5;
    (int)y; //1
  }

}
