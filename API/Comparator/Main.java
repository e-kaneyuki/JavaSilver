import java.util.*;

class Main {

  public static void main(String[] args) {
    Sample[] samples = {
      new Sample(2, "B"),
      new Sample(3, "C"),
      new Sample(1, "A")
    };

    List<Sample> list = new ArrayList<Sample>(Arrays.asList(samples));
    //ここのsortで定義したcompareが反映される？
    list.sort(new SampleComparator());

    for(Sample s: list) {
      System.out.println(s.getName());
    }


    Practice p1 = new Practice(20, "ドラえもん");
    Practice p2 = new Practice(11, "野比のび太");
    Practice p3 = new Practice(12, "剛田たけし");
    List<Practice> practiceList = new ArrayList<Practice>();
    practiceList.add(p1);
    practiceList.add(p2);
    practiceList.add(p3);

    returnPractice(practiceList);
    for(Practice p: practiceList) {
      System.out.println(p.getAge());
    }
  }

  public static List<Practice> returnPractice(List<Practice> currentPracticeList){
    Collections.sort(currentPracticeList, new PracticeComparator());

    // currentPracticeList.sort(new PracticeComparator());
    return currentPracticeList;
  }
}
