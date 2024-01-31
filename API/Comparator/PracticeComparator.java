import java.util.*;
class PracticeComparator implements Comparator<Practice> {
  @Override
  public int compare(Practice p1, Practice p2){
    if (p1.getAge() < p2.getAge()){
      return -1;
    } else if (p1.getAge() > p2.getAge()) {
      return 1;
    }
    return 0;
  };
}
