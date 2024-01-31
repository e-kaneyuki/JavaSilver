public class IntegerMethod {
  public static void main(String[] args) {
    echo(10);
    long i1 = 10;
    long i2 = 20;
    // Long l = i1 + i2;
    Long l2 = 20L + 20L;
    System.out.println(l2);
  }
  static void echo(Integer i) {
    System.out.println("A");
  }
  // static void echo(int i) {
  //   System.out.println("B");
  // }
}
