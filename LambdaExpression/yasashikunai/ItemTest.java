public class ItemTest {
  public static void main(String[] args){
    //コンストラクタを使ったパターン
    // Item item = new Item("A100", "LX100G", "sample", 10000);

    //メソッドチェーンを使ったパターン
    // Item item = new Item().id("A100")
    //                       .name("LX100G")
    //                       .description("sample")
    //                       .price(10000)
    //                       .save();

    //メソッドチェーンを使ったパターン(変数は不要)
    new Item().id("A100")
                          .name("LX100G")
                          .description("sample")
                          .price(10000)
                          .save();
    //ラムダ式を使ったメソッドチェーン(Itemのsaveメソッドは satatic の save(Consumer con))
    Item.save(item -> {
      item.id("123")
          .name("剣")
          .description("戦う道具")
          .price(10);
    }
    );
  }
}
