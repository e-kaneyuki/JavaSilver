public class JavaDoc {

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
   * Javadocタグです。
   */
  public static final String AUTHOR = "@author";
  public static final String VERSION = "@version";
  public static final String PARAM = "@param";
  public static final String RETURN = "@return";
  public static final String THROWS = "@throws";
  public static final String SEE = "@see";



  public static void main(String[] args) {
    // アノテーションのリスト
    String[] annotations = {"@author", "@version", "@param", "@return", "@throws", "@see"};

    // アノテーションのループ
    for (String annotation : annotations) {
      // getAnnotation メソッドを使用してアノテーションの説明を取得します。
      String description = getAnnotation(annotation);

      // アノテーションの説明を表示します。
      System.out.println("\u0020" + "*" + "\u0020" +annotation + ":" + "\u0020" + description);
    }
  }

  public static String getAnnotation(String annotation) {
    switch (annotation) {
      case AUTHOR:
        return "メソッドの作成者の名前を記述するタグです。";
      case VERSION:
        return "メソッドのバージョン番号を記述するタグです。";
      case PARAM:
        return "メソッドのパラメータの名前と型を記述するタグです。";
      case RETURN:
        return "メソッドの戻り値の型と説明を記述するタグです。";
      case THROWS:
        return "メソッドがスローする例外の名前と説明を記述するタグです。";
      case SEE:
        return "関連するドキュメントの URL を記述するタグです。";
      default:
        return null;
    }
  }
}
