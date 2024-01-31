public class Management {
  public static void main(String[] args){
    Book b = new Book("本", 600, "赤", "1234-456-789");
    Computer c = new Computer("コンピューター", 100000, "青", "株式会社かねゆき");
    String x = b.isbn;
    System.out.println(x);
    System.out.println(echoName(b));
    System.out.println(echoName(c));
  }

  public static String echoName(TangibleAsset a){

    /**
     * Javadocタグについて説明するコードです。
     *
     * @author [あなたの名前]
     * @version [バージョン番号]
     * @param: メソッドのパラメータの説明を記述するタグです。
     * @return: メソッドの戻り値の説明を記述するタグです。
     * @throws: メソッドで発生する例外を説明するタグです。
     * @see: 関連するドキュメントへのリンクを記述するタグです。
     */

    /**
     * a.isbn String Bookで新規作成したフィールド 管理番号
     * a.name String TangibleAssetで作成したフィールド 名前
     *
     * a.getName() String TangibleAssetで作成したメソッド nameの値を返す
     * a.setWeight() void Thingで作成したメソッド Weightをセット
     * a.getWeight() double Thingで作成したメソッド Weightの値を返す
     */

    // return a.isbn;
    // return a.name;

    // メソッド
    return a.getName();
    // a.setWeight(10.0);
    // return a.getWeight();

  }
}
