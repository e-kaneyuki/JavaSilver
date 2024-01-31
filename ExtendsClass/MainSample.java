public class MainSample {
  public static void main(String[] args) {
    SuperSample s = new SubSample();
    s.sample();
    // s.print();
    s.work();
    SubSample ss = new SubSample();
    ss.task();
  }
}
