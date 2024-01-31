public class Computer extends TangibleAsset {
  String makerName;
  // コンストラクタ
  public Computer(String name, int price, String color, String makerName) {
    super(name, price, color);
    this.name = name;
    this.price = price;
    this.color = color;
    this.makerName = makerName;
  }
  // メソッド
  private String getMakerName() { return this.makerName; }
  public String getName() { return this.name; }
}
