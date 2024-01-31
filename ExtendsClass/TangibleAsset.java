public abstract class TangibleAsset extends Asset implements Thing{
  //name,priceなど継承元にあるフィールドは記載不要
  String color;
  double weight;
  public TangibleAsset(String name, int price, String color) {
    // 継承元のコンストラクタを起動するためにsuperを記載
    // 意味はコンストラクタ名(name, price);
    // thisのようなもので、継承したコンストラクタ名(name, price);的な感じ

    /**
     * superクラスの引数に型宣言が省略できる理由は、
     ＊ superクラスの引数とサブクラス(TangibleAsset)のコンストラクタの引数を比較して
     * 同じ変数名のものは同じデータ型として認識するため
     */
    super(name, price);
    this.name = name;
    this.price = price;
    this.color = color;
  }
  public String getName(){return this.name;}
  public int getPrice(){return this.price;}
  public String getColor(){return this.color;}
  public void setWeight(double currentWeight){this.weight = currentWeight;}
  public double getWeight(){return this.weight;}

  // public static void main(String[] args){

  // }
}
