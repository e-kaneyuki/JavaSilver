//defaultは package private
class StringMethod {
  public static void main(String[] args) {
    String str = "aaaa";
    String changeStr = str.replace("aa","bx");
    System.out.println(changeStr);
    System.out.println(changeStr.charAt(str.length()-1));
    //文字列連結の前までは数値計算。その後はすべて文字列連結
    System.out.println(10+10+"10"+10+10);
  }
}
