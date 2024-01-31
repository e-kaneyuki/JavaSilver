class Equals {
  static String s1;
  public static void main(String[] args) {
    // Object a = new Object();
    // Object b = null;
    // // System.out.println(a.equals(b));
    // System.out.println(b.equals(a));


    Object a = new Sample(10);
    Object b = new Sample(10);
    // System.out.println(a.equals(b));

    new Equals().test(s1);
    // int x;
    // int y = 3;
    // if(y>2){
    //   x = y++;
    //   y = x + 5;
    //   System.out.println(x);
    //   System.out.println(y);
    // }

  }
  void test(String s2) {
    System.out.println(s2);
  }
}
