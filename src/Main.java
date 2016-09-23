
public class Main {

  public static void main(String[] args) {

    CompareNumbers comp = new CompareNumbers();
    MyLinkedList[] testList = new MyLinkedList[3];
    int listLength = 20;

    testList[0] = new MyLinkedList();
    testList[1] = new MyLinkedList();
    testList[2] = new MyLinkedList();

    for (int i = listLength; i > 0; i--) {
      testList[0].add(i);
      testList[1].add(i);
      testList[2].add(i);
    }

    testList[0].bubbleSort(comp);
    testList[1].insertionSort(comp);
    testList[2].selectionSort(comp);

    testList[0].remove(0);
    testList[0].remove(testList[0].size() - 1);
    testList[0].remove(7);
    testList[0].add(9, 999);

    for (int i = 0; i < testList[0].size(); i++) {
      System.out.println(testList[0].get(i));
    }
    System.out.println("");
    for (int i = 0; i < testList[1].size(); i++) {
      System.out.println(testList[1].get(i));
    }
    System.out.println("");
    for (int i = 0; i < testList[2].size(); i++) {
      System.out.println(testList[2].get(i));
    }
  }
}
