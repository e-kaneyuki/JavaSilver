class MonsterMain {
  public static void main(String[] args) {
    Monster m1 = new Monster("A");
    Slime m2 = new Slime("B");
    Ironman i1 = new Ironman();
    m1.attack(i1);
    m2.attack(i1);
  }
}
