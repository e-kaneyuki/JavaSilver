import java.time.DayOfWeek;
import java.time.LocalDate;

class Sample {
  public static void main(String[] args) {

    LocalDate a1 = LocalDate.of(2015,1,1);
    System.out.println("第1チェック");
    LocalDate a2 = a1;
    // a1 と a2 のスタック領域は一緒
    System.out.println(a1 == a2);

    a1 = LocalDate.of(2015,1,1);
    System.out.println(a1+", "+a2);
    // なぜfalseを返すのか
    System.out.println("第2チェック");
    System.out.println(a1 == a2);
    System.out.println("第3チェック");
    System.out.println(a1.equals(a2));
    System.out.println("--------------------");


    String s1 = "Hello";
    String s2 = s1;

    System.out.println(s1+", "+s2);
    s1 = "Hello";
    System.out.println(s1+"のテスト");
    System.out.println(s1 == s2);
    s1 = "こんにちは";
    System.out.println(s1+"のテスト");
    System.out.println(s1 == s2);


    int i1 = 1;
    // int i2 = i1;
    // System.out.println(i1+", "+i2);
    int i3 = 1;
    System.out.println(i1 == i3);

    LocalDate b = LocalDate.parse("2015-01-01");
    // LocalDate c = LocalDate.now();
    LocalDate d = LocalDate.now();
    System.out.println("----------------");
    System.out.println(d);
    LocalDate e = d.with(DayOfWeek.MONDAY);
    System.out.println(d);
    System.out.println(e);
    // System.out.println(a1.equals(b));
    // System.out.println(c);
    // System.out.println(d);
    // System.out.println(e);
    // // System.out.println(a.equals(c) + ", " + a.isBefore(c));
    // System.out.println(a1 == b);
    // System.out.println(c == d);
  }

}
