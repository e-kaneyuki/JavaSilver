import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Integer;

class LengthList {
  public static void main(String[] args) {
    var list = List.of(1,2,3);
    var list2 = Arrays.asList(new Integer[] {1,2,3});
    list2.set(1,5);
    System.out.println(list2);
    // list2.add(4);
    var v = new String();
    v = "あああ";
    System.out.println(v);
    // System.out.println();
  }
}
