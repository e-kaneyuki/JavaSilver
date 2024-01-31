public class Book extends TangibleAsset {
  String isbn;

  // コンストラクタ
  public Book(String name, int price, String color, String isbn) {
    super(name, price, color);
    this.name = name;
    this.price = price;
    this.color = color;
    this.isbn = isbn;
  }

  public static void main(String[] args) {
    Book b = new Book("かね", 100, "赤", "1234");
    // System.out.println(b.name);

    Computer c = new Computer("きん", 100, "青", "9876");
    System.out.println(c.getName());
    // System.out.println(c.getMakerName());
  }
  // メソッド
  public String getIsbn() { return this.isbn; }
}
