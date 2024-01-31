class GarbageCollection {
  public static void main(String[] args) {
    //s1はStringインスタンスを参照する。
    String s1 = new String("S1");
    String s2 = new String("S2");
    //s3はs1と同じインスタンスを参照している。
    String s3 = s1;
    System.out.println(s1);
    //ここでs1はコンスタンントプールにある"変更"を参照する。
    //参照元の"Stringインスタンス"S1"の中身が変わったわけでは無い。
    s1 = "変更";
    // s3 = s1;
    System.out.println(s3);
    System.out.println(s1);
  }
}
