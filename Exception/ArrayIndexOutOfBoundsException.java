class ArrayIndexOutOfBoundsException {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int s = returnTest(numbers);
    System.out.println(s);
    // try {
    //   System.out.println(numbers[4]);
    // } catch(Exception e) {
    //   System.out.println("例外処理が出ました。");
    // } finally {
    //   System.out.println("fainally");
    // }

  }
  public static int returnTest(int[] currentNumber) {
    int i = 0;
    try {
      int x = currentNumber[100];
      // System.out.println(currentNumber[2]);
    } catch(Exception e) {
      i = 10;
      return i;
    } finally {
      i += 20;
      // return i;
    }
    return i;
  }
}
