import java.util.function.*;
class Main {
  public static void main(String[] args) {
    Function<Integer,String> s = (Integer age) -> {return "年齢は"+age+"歳です。";};
    System.out.println(s.apply(20));
  }
}
