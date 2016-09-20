
/**
 * 
 * List211
 *
 * @author Cam Moore
 *
 * @param <E> object to be added to the list
 * 
 * this is a shortened version of the List interface from java
 */

public interface List211<E> {
  boolean add(E e);


  void add(int index, E element);


  E get(int index);


  E remove(int index);


  E set(int index, E element);


  int size();
}