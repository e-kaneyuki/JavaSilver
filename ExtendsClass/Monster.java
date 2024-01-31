public class Monster {
  int hp = 100;
  String attack = "50";

  public String power() {
    return this.attack;
  }

  public String toString() {
    if (this.hp == 100) {
      return "なんちゃって";
    } else {
      return "変更した";
    }

  }
}
