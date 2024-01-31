class Round {
  public static void main(String[] args) {
    int x = 5; int y = 2;

    float a = (float) x/y * 100;
    int b = Math.round(a);
    System.out.println(b);
    float c = b/(float)100;
    System.out.println(c);
  }
}
