public class Question8 {
  String name;
  public Question8(String name){
    this.name = name;
  }
  public static void main (String[] args){
    String[][] array = { {"A","B"},null,{"C","D","E"}};
    String[] a = null;
    System.out.println(a.getClass());
    int total = 0;
    for (String[] tmp: array){
      // System.out.println(tmp);
      // total += tmp.length;
    }
  }
}
