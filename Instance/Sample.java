import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {
  Map<String, String> map2 = new HashMap<>();

  static Map<String, String> map = new HashMap<>();
  static {
    map.put("kaneko", "eita");
    map.put("kkinchan", "taro");
  }
  public void setMap2(){
    map2.put("kaneko", "eita");
    map2.put("kkinchan", "taro");
  }

}
