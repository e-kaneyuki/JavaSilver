public class SubSample extends SuperSample implements InterfaceSample{
  int val = 2;
  @Override
  public void task() {
    InterfaceSample.super.task();
    System.out.println("継承タスクです");
  }
  @Override
  public void sample() {
    test();
  }
  @Override
  public void test() {
    System.out.println("うまく継承できました。");
  }

  // @Override
  // public void print() {
  //   System.out.println(val);
  // }
}
