import java.util.function.Consumer;

public class Item {
  private String id;
  private String name;
  private String description;
  private int price;
  //コンストラクタ
  // public Item(String id, String name, String description, int price){
  //   super();
  //   this.id = id;
  //   this.name = name;
  //   this.description = description;
  //   this.price = price;
  // };

  public Item id(String id){
    this.id = id;
    return this;
  }
  public Item name(String name){
    this.name = name;
    return this;
  }
  public Item description(String description){
    this.description = description;
    return this;
  }
  public Item price(int price){
    this.price = price;
    return this;
  }
  public void save(){
    System.out.println("save");
  }
  public static void save(Consumer<Item> con) {
    con.accept(new Item());
    System.out.println("save");
  }
}
