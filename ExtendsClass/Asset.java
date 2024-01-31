public abstract class Asset{
  String name;
  int price;

  public Asset(String name, int price) {
    this.name = name;
    this.price = price;
  }
  // interfaceではフィールドは作成できない。
  // メソッドのみの記載となる
  String getName(){return this.name;} //どのメソッドもpublic abstractがつくので通常は省略する
  int getPrice(){return this.price;}
}
