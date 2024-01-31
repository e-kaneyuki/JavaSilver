public class Goblin extends Monster {
  int hp = 200;
  String attack = "1000";

  public String power() {
    return this.attack;
  }

  public String toString() {
    return this.attack;
  }
}
