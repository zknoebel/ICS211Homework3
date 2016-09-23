import java.util.Comparator;

public class main {

  public static void main(String[] args) {

    CompareNumbers comp = new CompareNumbers();
    MyLinkedList testList = new MyLinkedList();
    int listLength = 20;

    for (int i = listLength; i > 0; i--) {
      testList.add(i);
    }

    testList.bubbleSort(comp);

    testList.remove(0);
    testList.remove(testList.size() - 1);
    testList.remove(7);
    testList.add(9, 999);

    for (int i = 0; i < testList.size(); i++) {
      System.out.println(testList.get(i));
    }
  }
}
