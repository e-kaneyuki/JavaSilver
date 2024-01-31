public class Main {
  // public static void main(String[] args) {
  //   List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
  //   int sum = list.stream().reduce(0, (a, b) -> a + b);
  //   System.out.println(sum);
  //   System.out.println();
  // }
  public static void main(String[] args){
    // Worker w = new Engineer();
    Test t = new Test();
    // t.process(new Engineer());
    // t.process(new Worker() {
    //   @Override
    //   public void work(){
    //     System.out.println("Hello");
    //   }
    // });
    t.process(() -> {
        System.out.println("Hello with Lamda");
      }
    );
    t.returnTest(() -> {
        System.out.println("Hello with number");
      }
    );
  }
}
