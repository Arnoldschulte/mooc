import java.util.ArrayList;

public class Exercise71 {

  public static void main(String[] args) {
    ArrayList<Integer> list3 = new ArrayList<Integer>();
    ArrayList<Integer> list4 = new ArrayList<Integer>();

    list3.add(2);
    list3.add(9);
    list3.add(1);

    list4.add(9);
    list4.add(6);
    list4.add(1);
    list4.add(5);

    smartCombine(list3, list4);

    System.out.println(list3); // prints [2, 9, 1, 6, 5]
    System.out.println(list4); // prints [9, 6, 1, 5]
  }

  private static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
    for (Integer integer : second) {
      if (!first.contains(integer)) {
        first.add(integer);
      }
    }
  }
}