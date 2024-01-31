class Main {
  static String x;

  public static void main(String[] args) {
    Thief t = new Thief();
    t.hp = 100;
    // int i1 = t.hp;
    int[] i2 = new int[]{1,2,3,4,5};
    i2[0] = 50;
    System.out.println(i2.length);

    // System.out.println(toString());
    System.out.println(i2[0]);
    // System.out.println(i2[0] +"," + i2[1]);
    System.out.println(t);

    System.out.println("C");
    int a = 1;
    char x = (char)a;
    System.out.println(x);
  }

}
