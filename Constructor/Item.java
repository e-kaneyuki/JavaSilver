public class Item {

  public Item() {
    this(1);
    System.out.println("A");
  }

  public Item(String s) {
    this();
    System.out.println("B");
  }

  public Item(int i) {
    this(1, 2);
    System.out.println("C");
  }

  public Item(int i , int i2) {
    System.out.println("D");
  }

  // public void Item() {
  //   System.out.println("B");
  // }
}
