public class ImplementsSample extends SampleAbstract implements SampleInterface  {
  public static void main(String[] args) {
    ImplementsSample i = new ImplementsSample();
    i.sample();
    i.secondSample();
  }
  public void morning() {
    System.out.println("good morning");
  }
  @Override
  public void sample() {
    SampleInterface.super.sample();
    System.out.println("java");
  }
  @Override
  public void test() {
    System.out.println("B");
  };
}
