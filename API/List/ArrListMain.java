import java.util.Arrays;
import java.util.function.Supplier;
import java.util.List;
import java.util.ArrayList;

class ArrListMain {
  public static void main(String[] args) {
    String[] a = {"a", "a", "c"};
    String[] b = {"a", "b", "c"};
    System.out.println(Arrays.asList(a));
    System.out.println(Arrays.compare(a, b));

    List<String> strList = new ArrayList<>();
    strList.add("A");
    strList.add("B");
    strList.add("C");
    strList.add("D");
    strList.add("E");
    try{
      int i = 0;
      for(String o: strList){

          if("B".equals(o)) {
            strList.remove(o);
          }else{
            // System.out.println(o);
          }
          for(String s : strList){
            // System.out.println(s);
          }
          // System.out.println(i);
          i++;
      }
    }catch(Exception e){
        System.out.println("もう、ありません");
      }
    // for(String o: strList){
    //   System.out.println(o);
    // }
    var list = List.of(1,2,3);
    // list.forEach (System.out::println);
    list.forEach ((Integer i) -> {System.out.println(i);});
    // for (int i: list) {
    //   System.out.println(i);
    // }
    // list.forEach();

    Supplier<List<String>> listSupplier = ArrayList::new;

    // 新しい ArrayList を取得
    List<String> list2 = listSupplier.get();

    // リストに要素を追加
    list2.add("Apple");
    list2.add("Banana");
    list2.add("Cherry");

    // リストの要素を表示
    for (String fruit : list2) {
        System.out.println(fruit);
    }
  }
}
