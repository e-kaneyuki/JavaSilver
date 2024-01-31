import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    //int → Integerへオートボクシングされる
    int i = 100;
    int y = 200;
    //引数なしで戻り値あり
    Supplier<Integer> foo = () -> i;
    System.out.println(foo.get());

    /**
    * Consumer 引数ありで戻り値なし
    * @param: x のデータ型はInteger 宣言時にすでに宣言されている変数名は使用不可
    * @return: 戻り値なし 実行時に使用される変数 i は事実上の定数でなければならない。
    */
    Consumer<Integer> c = (x) -> System.out.println(i);
    c.accept(y);


  }
}
