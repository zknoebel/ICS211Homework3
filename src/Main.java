/**
 * 
 * Main
 *
 * @author Zachery Knoebel
 *
 */

public class Main {

  /**
   * This class is used to test the updated or newly created classes in this package.
   * 
   * @param args
   */
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {

    CompareNumbers comp = new CompareNumbers();
    MyLinkedList<Integer>[] testList = new MyLinkedList[3];
    int listLength = 20;

    testList[0] = new MyLinkedList<Integer>();
    testList[1] = new MyLinkedList<Integer>();
    testList[2] = new MyLinkedList<Integer>();

    /**
     * tests the add method used without an index creates three linked lists to be tested
     */
    for (int i = listLength; i > 0; i--) {
      testList[0].add(i);
      testList[1].add(i);
      testList[2].add(i);
    }

    /**
     * tests the three sort methods
     */
    testList[0].bubbleSort(comp);
    testList[1].insertionSort(comp);
    testList[2].selectionSort(comp);

    /**
     * tests the remove and add at index methods
     */
    testList[0].remove(0);
    testList[0].remove(testList[0].size() - 1);
    testList[0].remove(7);
    testList[0].add(9, 999);

    /**
     * prints the three linked lists
     */
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

    /**
     * tests indexOf method
     */
    System.out.println(testList[2].indexOf(new Integer(18)));

    /**
     * tests tortoise and hare algorithm
     */
    System.out.println("\n" + "TestList[1] has a cycle: " + testList[1].hasCycle());
    testList[1].addCycle(1);
    System.out.println("\n" + "TestList[1] has a cycle: " + testList[1].hasCycle());

    // Creates an array of Contacts to test the MyArrayList and ContactList classes
    Contact[] contactListTest = new Contact[26];
    contactListTest[0] = new Contact("AAron", "Black", "Array Listery", "1-234-567-8900", "1-555-432-3456",
        "1-875-234-9765", "ABlack@esnail.edu");
    contactListTest[1] = new Contact("Barry", "HornField", "Array Listery", "1-766-900-1234", "1-233-543-6547",
        "1-875-234-9765", "BField@esnail.edu");
    contactListTest[2] = new Contact("Corey", "Karington", "Array Listery", "1-678-000-2578", "1-222-666-7777",
        "1-875-234-9765", "CKarington@esnail.edu");
    contactListTest[3] = new Contact("Darrel", "Waffelhausen", "Array Listery", "1-000-333-6666", "1-030-494-8901",
        "1-875-234-9765", "DWorther@esnail.edu");
    contactListTest[4] = new Contact("Ellen", "Smith", "Array Listery", "1-857-000-5432", "1-666-908-9900",
        "1-875-234-9765", "ESmith@esnail.com");
    contactListTest[5] = new Contact("Francis", "Forello", "Array Listery", "1-000-923-4455", "1-667-333-5970",
        "1-875-234-9765", "FForello@esnail.com");
    contactListTest[6] = new Contact("Greg", "Moore", "Array Listery", "1-456-111-2345", "1-999-567-4968",
        "1-875-234-9765", "GMoore@esnail.com");
    contactListTest[7] = new Contact("Hellena", "Snarl", "Array Listery", "1-831-844-4868", "1-789-321-7813",
        "1-875-234-9765", "HSnarl@esnail.com");
    contactListTest[8] = new Contact("Isabell", "Berkley", "Array Listery", "1-987-654-1478", "1-987-789-1236",
        "1-875-234-9765", "EBerkley@esnail.com");
    contactListTest[9] = new Contact("Julie", "Jensen", "Array Listery", "1-222-666-7894", "1-321-654-7899",
        "1-875-234-9765", "JJensen@esnail.com");
    contactListTest[10] = new Contact("Kyle", "McDoogle", "Array Listery", "1-888-335-6598", "1-321-789-4598",
        "1-875-234-9765", "KMcDoogle@esnail.com");
    contactListTest[11] = new Contact("Lawrence", "Flemming", "Array Listery", "0-555-985-4895", "1-456-456-1687",
        "1-875-234-9765", "LFlemming@esnail.com");
    contactListTest[12] =
        new Contact("Mike", "Glasgo", "Array Listery", "0", "0", "1-875-234-9765", "MGlasgo@esnail.com");
    contactListTest[13] = new Contact("Nedward", "Wentsworth", "Array Listery", "1-440-563-8915", "1-458-832-3456",
        "1-875-234-9765", "NWentsworth@esnail.com");
    contactListTest[14] = new Contact("Oskarr", "Squinktersmith", "Array Listery", "1-486-891-1111", "0",
        "1-875-234-9765", "OSquinktersmith@esnail.com");
    contactListTest[15] = new Contact("Patricia", "Merkel", "Array Listery", "1-483-332-5612", "0", "1-875-234-9765",
        "PMerkel@esnail.com");
    contactListTest[16] = new Contact("Qitra", "Sorrento", "Array Listery", "1-878-879-9999", "0", "1-875-234-9765",
        "QSorrento@esnail.com");
    contactListTest[17] = new Contact("Ralph", "Flemming", "Array Listery", "1-487-323-5689", "1-888-945-3654",
        "1-875-234-9765", "RFlemming@esnail.com");
    contactListTest[18] = new Contact("Samial", "Smith", "Array Listery", "1-857-000-4457", "1-666-908-9900",
        "1-875-234-9765", "SSmith@esnail.com");
    contactListTest[19] = new Contact("Tedward", "Wentsworth", "Array Listery", "1-542-789-8888", "0", "1-875-234-9765",
        "TWentsworth@esnail.com");
    contactListTest[20] = new Contact("Urdel", "Flippenstock", "Array Listery", "0", "1-555-666-9898", "1-875-234-9765",
        "UFlippenstock@esnail.com");
    contactListTest[21] = new Contact("Valentina", "Ferrara", "Array Listery", "1-856-489-3278", "0", "1-875-234-9765",
        "VFerrara@esnail.com");
    contactListTest[22] =
        new Contact("Waldo", "Arlington", "Array Listery", "0", "0", "1-875-234-9765", "WArlington@esnail.com");
    contactListTest[23] =
        new Contact("Xeekiel", "Quint", "Array Listery", "0", "0", "1-875-234-9765", "XQuint@esnail.com");
    contactListTest[24] = new Contact("Yannie", "Alexzandrovich", "Array Listery", "0", "1-842-876-2414",
        "1-875-234-9765", "YAlexzandrovich@esnail.com");
    contactListTest[25] = new Contact("Zebadia", "Ford", "Array Listery", "1-648-348-6844", "1-757-681-8645",
        "1-875-234-9765", "ZFord@esnail.com");

    // Creates a contact list to test MyArrayList and ContactList classes
    ContactList contacts = new ContactList();

    // Tests add method without index for MyArrayList class and its implementation of insertionSort method when used in
    // the ContactList class
    for (int i = 0; i < 20; i++) {
      contacts.add(contactListTest[i]);
    }

    /**
     * Prints out first and last names in order of "contacts" (The first 19 are sorted by last name The next 4 are added
     * in spots 0,6,12,18 Indices 1 and 11 are replaced with testList[24] and testList[25] Index 17 is removed)
     */
    for (int i = 0; i < contacts.size(); i++) {
      System.out.println(i + " " + contacts.get(i).toString());
    }

  }
}
