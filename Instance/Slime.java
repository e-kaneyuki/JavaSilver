class Slime extends Monster {
  // String name;
  // char suffix;
  public Slime(String currentChar) {
    super(currentChar);
    this.suffix = currentChar;
  }
  @Override
  public void attack(Ironman i) {
    super.attack(i);
    super.plus(i.name);
    
    System.out.println(this.suffix+"はさらに攻撃を仕掛けた");
  }
}
