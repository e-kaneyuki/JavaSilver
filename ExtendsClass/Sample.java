public class Sample {
  int money;
  public Sample(int i){
    this.money = i;
    System.out.println("引数がint型のコンストラクタ");
  }
  public Sample() {
    System.out.println("引数なしのコンストラクタ");
  }
  String s = "aaaa";
  System.out.println(s.replace("aa","ba"));
}
