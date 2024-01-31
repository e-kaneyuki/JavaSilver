import java.util.function.*;

public class Monster {
  private String name;
  private int age;

  public static void main(String[] args) {
    Character c1 = () -> {System.out.println("aaa");};
    c1.attack();

    // Monsterを扱う Consumerクラス を cm とする
    // Consumerクラスは、関数型インターフェースであり、acceptメソッドしか存在しない。
    // acceptメソッドのひ引数はConsumerクラスで扱うオブジェクトのみが対象となる。
    // ex) Consumer<Monster> で accept(String) とはならない。
    // なので、今回の場合ラムダ式で (m)となるものは必ず Monster の扱いとなる。(m)は仮引数扱い。
    // m.setName("ガスパール") は、MonsterオブジェクトのsetNameメソッドでnameに"ガスパール"をセット。
    //その後、MonsterオブジェクトのgetName()メソッドを実行そたものをターミナルへ出力する。

    Consumer<Monster> cm = (m) -> {
      m.setName("ガスパール");
      System.out.println(m.getName());
    };
    cm.accept(new Monster());

    String changeName = "ガス";
    Consumer<Monster> cm2 = (mon) -> {
      mon.setName(changeName);
      System.out.println(mon.getName());
    };
    cm2.accept(new Monster());
  }

  public void setName(String currentName){
    this.name = currentName;
  }
  public void setAge(int currentAge){
    this.age = currentAge;
  }

  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
}
