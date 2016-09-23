
public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		CompareNumbers comp = new CompareNumbers();
		MyLinkedList<Integer>[] testList = new MyLinkedList[3];
		int listLength = 20;

		testList[0] = new MyLinkedList<Integer>();
		testList[1] = new MyLinkedList<Integer>();
		testList[2] = new MyLinkedList<Integer>();

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

		System.out.println(testList[2].indexOf(new Integer(18)));

		System.out.println("\n" + "TestList[1] has a cycle: " + testList[1].hasCycle());
		testList[1].addCycle(1);
		System.out.println("\n" + "TestList[1] has a cycle: " + testList[1].hasCycle());
	}
}
