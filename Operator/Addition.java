class Addition {
  public static void main(String[] args) {
    int a = 5;
    int b = a = a+3;
    //aとbともに8
    System.out.println(a+b);

    int c = 10;
    //開始時 c = 10 終了時c=11 合計値11
    //11+11=22 合計値22
    //開始 c=11,22+11-1=32 終了でc=10 合計値32
    //開始時 c=10, 32-10-1=21 終了でc=9 合計21
    //開始時 c=9 21+10=31
    int x = 1, y = 2, z = 3;
    // int x = 1 ;
    // int y = 2 ;
    // int z = 3;
    System.out.println(x+y+z);
    String s = "s", t = "t", u = "u";
    // String s = "s"; String t = "t"; String u = "u";
    System.out.println(s+t+u);
  }
}
