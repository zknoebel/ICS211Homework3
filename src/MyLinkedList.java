import java.util.Comparator;

public class MyLinkedList<E> implements List211<E> {

  private boolean finished;
  private DLinkedNode<E> head;
  private DLinkedNode<E> tail;
  private DLinkedNode<E> temp;
  private E tempData;
  private int placeHolder;
  private int size = 0;
  private Object[] dataArray;


  MyLinkedList() {

  }

  private class DLinkedNode<E> {

    private E data = null;
    private DLinkedNode<E> next = null;
    private DLinkedNode<E> prev = null;


    DLinkedNode(E data) {
      this.data = data;
    }
  }


  public void insertionSort(Comparator<? super E> comp) {

    for (int i = 0; i < size - 1; i++) {

      placeHolder = i;

      while (comp.compare((E) dataArray[placeHolder], (E) dataArray[placeHolder + 1]) > 0) {

        tempData = (E) dataArray[placeHolder];
        dataArray[placeHolder] = dataArray[placeHolder + 1];
        dataArray[placeHolder + 1] = tempData;

        if (placeHolder > 0) {
          placeHolder--;
        }
      }
    }
  }


  public void bubbleSort(Comparator<? super E> comp) {

    for (int i = 0; i < size - 1; i++) {

      finished = true;
      temp = head;

      for (int j = 0; j < size - 1 - i; j++) {

        if (comp.compare(temp.data, temp.next.data) > 0) {

          finished = false;

          tempData = temp.data;
          temp.data = temp.next.data;
          temp.next.data = tempData;

        }

        temp = temp.next;
      }

      if (finished == true) {
        break;
      }
    }
  }


  public void selectionSort(Comparator<? super E> comp) {

    for (int i = 0; i < size - 1; i++) {

      tempData = (E) dataArray[i];
      placeHolder = i;

      for (int j = i; j < size; j++) {

        if (comp.compare(tempData, (E) dataArray[j]) > 0) {

          tempData = (E) dataArray[j];
          placeHolder = j;
        }
      }

      dataArray[placeHolder] = dataArray[i];
      dataArray[i] = tempData;
    }
  }


  @Override
  public boolean add(E e) {

    DLinkedNode<E> n = new DLinkedNode<E>(e);

    if (size == 0) {
      head = n;
      tail = n;
    }
    else {

      n.prev = tail;
      tail.next = n;
      tail = n;
    }
    size++;

    return true;
  }


  @Override
  public void add(int index, E e) {

    if (index < 0 || index > size) {

      throw new IndexOutOfBoundsException();
    }

    DLinkedNode<E> n = new DLinkedNode<E>(e);

    if (index == size) {
      add(e);
    }
    else if (index == 0) {
      if (size == 0) {
        head = n;
        tail = n;
      }
      else {

        head.prev = n;
        n.next = head;
        head = n;
      }
      size++;
    }
    else {

      temp = head;

      for (int i = 0; i < index; i++) {
        temp = temp.next;
      }

      n.prev = temp.prev;
      n.next = temp;
      temp.prev = n;
      n.prev.next = n;
      size++;
    }
  }


  public void checkIndex(int index) {

    if (index < 0 || index >= size) {

      throw new IndexOutOfBoundsException();
    }
  }


  @Override
  public E get(int index) {

    checkIndex(index);

    temp = head;

    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }

    return temp.data;
  }


  public E[] makeArray() {
    dataArray = new Object[size];
    temp = head;
    for (int i = 0; i < size; i++) {
      dataArray[i] = temp.data;
      temp = temp.next;
    }
    return (E[]) dataArray;
  }


  @Override
  public E remove(int index) {

    checkIndex(index);

    if (index == 0) {
      head = head.next;
      head.prev = null;
    }
    else if (index == size - 1) {
      tail = tail.prev;
      tail.next = null;
    }

    else {

      temp = head;

      for (int i = 0; i < index; i++) {
        temp = temp.next;
      }

      tempData = temp.data;
      temp.next.prev = temp.prev;
      temp.prev.next = temp.next;
    }

    size--;
    return tempData;
  }


  @Override
  public E set(int index, E e) {

    checkIndex(index);

    temp = head;

    for (int i = 0; i < index; i++) {

      temp = temp.next;
    }

    tempData = temp.data;

    temp.data = e;
    return tempData;
  }


  @Override
  public int size() {

    return size;
  }

}
