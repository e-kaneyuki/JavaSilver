import java.util.function.*;

public class ExtendsConsumer implements Consumer<Integer> {
  @Override
  public void accept(Integer number){
    int result = number * 2;
    System.out.println(result);
  }
}
