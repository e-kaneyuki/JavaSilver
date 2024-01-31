public class SuperSample {
  int val = 1;
  public void sample() {
    test();
  }
  public void test() {
    System.out.println("継承前のメソッドです。");
  }

  public void print() {
    System.out.println(val);
  }

  public void work(){
    System.out.println("extends");
  }
}
