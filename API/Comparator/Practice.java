class Practice {
  private int age;
  private String name;

  public Practice(int age, String name){
    this.age = age;
    this.name = name;
  }
  public void setAge(int currentAge) {
    this.age = currentAge;
  }
  public void setName(String currentName) {
    this.name = currentName;
  }

  public int getAge() {
    return this.age;
  }
  public String getName() {
    return this.name;
  }
}
