package cs2.adt;

public class ArrayQueue<T> implements Queue<T> {
  private T[] arr;
  private int len;
  private int beg;
  public ArrayQueue() {
    arr = (T[])new Object[10];
    len = 0;
    beg = 0;
  }
  public void enqueue(T item) {
    if(len == arr.length) {
      T[] tmp = (T[])new Object[len * 2];
      for(int i=0; i<len; i++) {
        tmp[i] = arr[(beg + i) % arr.length];
      }
      arr = tmp;
      beg = 0;
    }
    arr[(len + beg) % arr.length] = item;
    len++;
  }
  public T dequeue() {
    T retVal = arr[beg];
    beg = (beg + 1) % arr.length;
    len--;
    return retVal;
  }
  public T peek() {
    return arr[beg];
  }
  public boolean isEmpty() {
    return len == 0;
  }
}
