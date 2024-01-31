import java.util.Random;

class Wizard {
  String name;
  int mp = 7;
  final int MAXMP = 10;
  public static void main(String[] args) {
    Wizard w = new Wizard();
    w.pray(2);
  }
  public void pray(int praySecond) {
    Random rand = new Random();
    int num = rand.nextInt(3);
    int recovery = praySecond + num;
    // System.out.println("元々のmpは"+this.mp);
    // System.out.println("祈った時間" + praySecond + "秒");
    // System.out.println("ランダム" + num);
    // System.out.println("合計(回復したMP)は↓↓");
    // System.out.println(recovery);

    // System.out.println("ただのmp" + this.mp);
    // System.out.println("MPの上限" + this.MAXMP);

    if (recovery + this.mp <= MAXMP) {
      // System.out.println("回復した値は");
      // System.out.println(recovery);
      this.mp = this.mp + recovery;
    } else {
      // System.out.println("回復した値は");
      // System.out.println(this.MAXMP - this.mp);
      this.mp = this.MAXMP;
    }
    System.out.println(this.mp);
  }
}
