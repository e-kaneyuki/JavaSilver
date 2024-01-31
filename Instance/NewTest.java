class NewTest {
  public static void main(String[] args) {
    // int i1 = staticNumber();
    // System.out.println(i1);

    int z =  new NewTest().number();
    System.out.println(z);
  }
  public static int staticNumber() {
    // int x = number();
    // System.out.println(x);
    return 1;
  }

  public int number() {
    int y = staticNumber();
    System.out.println(y);
    return 2;
  }
}
