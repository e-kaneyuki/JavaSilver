interface Worker {
  default void work(){
    System.out.println("first work");
  };
  public void test();
}
