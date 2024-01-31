public class CarMain extends Car {
  public static void main(String[] args) {
    setColor("あか");
    System.out.println(color);

    Car c = new Car();
    c.setName("ラファエル");
    System.out.println(c.name);
  }
}
