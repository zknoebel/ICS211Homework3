import java.util.Comparator;

public class MyLinkedList<E> implements List211<E> {

  private boolean finished;
  private DLinkedNode<E> head;
  private DLinkedNode<E> tail;
  private DLinkedNode<E> temp;
  private E tempData;
  private int placeHolder;
  private int size = 0;


  MyLinkedList(){

  }

  private class DLinkedNode<E>{


    private E data = null;
    private DLinkedNode<E> next = null;
    private DLinkedNode<E> prev = null;

    DLinkedNode(E data){
      this.data = data;
    } 
  }


  public void insertionSort(Comparator<? super E> compare){


    temp = head;
    
    for (int i = 0; i < size - 1; i++) {
      
      temp = temp.next;

      while (compare.compare(temp.prev.data, temp.data) > 0) {

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = temp.prev;
        temp.prev.prev.next = temp;
        temp.prev = temp.prev.prev;
        temp.next.prev = temp;

        if (temp.prev.prev != null && !temp.prev.prev.equals(tail)) {
          temp = temp.prev;
        }
      }
    }
  }


  public void bubbleSort(Comparator<? super E> compare){

    for (int i = 0; i < size - 1; i++) {

      finished = true;
      temp = head;
      
      for (int j = 0; j < size - 1 - i; j++) {
        temp = temp.next;
        
        if (compare.compare(temp.prev.data, temp.data) > 0) {

          finished = false;
          
          temp.next.prev = temp.prev;
          temp.prev.next = temp.next;
          temp.next = temp.prev;
          temp.prev.prev.next = temp;
          temp.prev = temp.prev.prev;
          temp.next.prev = temp;
          
        }
      }

      if (finished == true) {
        break;
      }
    }
  }


  public void selectionSort(Comparator<? super E> compare){

    DLinkedNode<E>[] data = new DLinkedNode[size];
    
    temp = head;
    for(int d = 0; d < size; d ++){
     
      data[d] = temp;
      temp = temp.next;
    }
    
    

    for (int i = 0; i < size - 1; i++) {

      temp = data[i];
      placeHolder = i;

      for (int j = i; j < size; j++) {

        if (compare.compare(temp.data, (E)data[j].data) > 0) {

          temp = data[j];
          placeHolder = j;
        }
      }

      data[placeHolder] = data[i];
      data[i] = temp;
    }
    
    temp = head;
    
    for(int i = 0; i < size; i ++){
    	temp.data = (E)data[i].data;
    	temp = temp.next;
    }
  }


  @Override
  public boolean add(E e) {

    DLinkedNode<E> n = new DLinkedNode<E>(e);

    if (size == 0){
      head = n;  
    }

    n.next = tail.next;
    n.prev = tail;
    tail.next = n;
    tail = n;
    
    
    size ++;

    return true;
  }


  @Override
  public void add(int index, E e) {

    checkIndex(index);

    DLinkedNode<E> n = new DLinkedNode<E>(e);

    temp = head;
    
    for(int i = 0; i < index; i ++){
      temp = temp.next;
    }

    n.prev = temp.prev;
    n.next = temp;
    n.prev.next = n;
    n.next.prev = n;    

    size ++;
  }


  public void checkIndex(int index){
    
    if(index < 0 || index >= size){
      
      throw new IndexOutOfBoundsException();
    }
  }

  
  @Override
  public E get(int index) {

    checkIndex(index);

    temp = head;

    for(int i = 0; i < index; i ++){
      temp = temp.next;  
    }

    return temp.data;
  }


  @Override
  public E remove(int index) {

    checkIndex(index);

    temp = head;

    for(int i = 0; i < index; i ++){
      temp = temp.next;
    }
    tempData = temp.data;
    temp.next.prev = temp.prev;
    temp.prev.next = temp.next;

    size --;
    return tempData;
  }


  @Override
  public E set(int index, E e) {

    checkIndex(index);

    temp = head;

    for(int i = 0; i < index; i ++){

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
