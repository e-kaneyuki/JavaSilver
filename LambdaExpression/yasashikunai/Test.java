public class Test {
  public void process(Worker worker){
    System.out.println("start");
    worker.work();
    System.out.println("end");
  }
  public void returnTest(Test t){
    System.out.println("start");
    t.returnNumber();
    System.out.println("end");
  }
  public int returnNumber(){
    return 1;
  }
}
