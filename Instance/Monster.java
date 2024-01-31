class Monster {
  String name;
  // char suffix;
  String suffix;
  public Monster(String currentChar) {
    this.suffix = currentChar;
  }

  public void attack(Ironman i){
    System.out.println("モンスター"+this.suffix+"の攻撃");
  }
  public void plus(String x) {
    System.out.println(x);
  }
}
