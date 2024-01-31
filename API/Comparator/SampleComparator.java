import java.util.Comparator;

/**
 * Comparator<Sample> interfaceで定義時はComparator<T>で定義されている。
 * 実際に使用する際にジェネリックスで型をパラメータとして指定する
 * Comparator<T> の抽象メソッドで 	compare(T o1, T o2)がある。
 * compare(比較その1、 比較その2)で その1 と その2 の型は ジェネリックスで指定した型となる。
 * 例えばComparator<Sample>を使う場合、compareメソッドは compare(Sample型 変数その1, Sample型 変数その2)となる.
 * で、compareメソッドは抽象メソッドで処理内容が決まっていないので、compare(Sample型 変数その1, Sample型 変数その2)のブロックを記載する。
 * compareメソッドの戻り値は int で -1 or 1 or 0 となるようにする。
 */
class SampleComparator implements Comparator<Sample> {
  @Override
  public int compare(Sample s1, Sample s2) {
    if (s1.getId() < s2.getId()) {
      return 1;
    }
    if (s2.getId() < s1.getId()) {
      return -1;
    }
    return 0;
  }
}
