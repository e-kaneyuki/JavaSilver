class DoubleCatch {
  public static void main(String[] args) {
    try {
      throw new RuntimeException();
    } catch(RuntimeException e) {
      throw new Exception();
    } catch (Exception e) {
      System.out.println("A");
    } finally {
      System.out.println("B");
    }
  }
}
