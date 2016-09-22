import java.util.Comparator;

public class MyLinkedList<E> implements List211<E> {

  private DLinkedNode<E> head;
  private DLinkedNode<E> tail;
  private int size = 0;


  MyLinkedList(){
    
    head = new DLinkedNode(null);
    tail = new DLinkedNode(null);
    
    head.prev = tail;
    head.next = tail;
    tail.prev = head;
    tail.next = head;
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
    
  }


  public void bubbleSort(Comparator<? super E> compare){

  }


  public void selectionSort(Comparator<? super E> compare){

  }


  @Override
  public boolean add(E e) {
      
    // TODO Auto-generated method stub
    DLinkedNode temp = new DLinkedNode(e);
    
    temp.prev = tail.prev;
    temp.next = tail;
    tail.prev.next = temp;
    tail.prev = temp;
    
    size ++;
    
    return true;
  }


  @Override
  public void add(int index, E e) {
    
    DLinkedNode temp = new DLinkedNode(e);
    temp.next = head.next;
    
    for(int i = 0; i < index; i ++){
      temp.next = temp.next.next;
      
    }
    
    temp.prev = temp.next.prev;
    temp.prev.next = temp;
    temp.next.prev = temp;
  }


  @Override
  public E get(int index) {
    DLinkedNode temp = new DLinkedNode(null);
    temp.next = head.next;
    
    for(int i = 0; i < index; i ++){
      
    }
    
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public E remove(int index) {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public E set(int index, E element) {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public int size() {

    return size;
  }

}
