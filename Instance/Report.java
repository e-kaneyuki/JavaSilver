public class Report {
  public static void main(String[] args) {
    int myAreaNumber = 5;
    String[] sArray = {"新宿", "池袋", "渋谷", "六本木", "下北沢"};
    int[] iArray = {100, 200, 300, 800, 50};
    for (int i = 0; i < myAreaNumber; i++) {
      //可変変数を作ろうとしたが、静的型付け言語のjavaでは不可。
      //代用しようとする場合はMapで実装する必要がある。
      Karaoke k = new Karaoke();
      k.store = sArray[i];
      k.sales = iArray[i];
      // System.out.println(k_i.store + " : " + k_i.sales);
      // k_i.today(sArray[i], iArray[i]);
    }
  }
}
