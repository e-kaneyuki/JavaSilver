public class Thief {
  String name;
  int hp;
  int mp;
  public Thief() {
    this.name = "名無しの権兵衛";
  };
  public Thief(String name) {
    this.name = name;
  }
  @Override
  public String toString() {
    // Integer i = Integer.valueOf(this.hp);
    // String s = i.toString();

    return this.name;
  }
}
