import java.util.function.*;

public class UseConsumer {
  public static void main(String[] args){
    Consumer<String> c =  moji -> {
      System.out.println(moji);
    };
    c.accept("あ");

    Supplier<Integer> s = () -> {
      System.out.println(111);
      return 111;
    };
    s.get();

    Function<Integer,String> f = i -> {
      String str = "私は"+ i + "歳です。";
      return str;
    };
    System.out.println(f.apply(2));

  }
}
