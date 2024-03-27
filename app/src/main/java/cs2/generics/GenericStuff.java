package cs2.generics;

import java.util.ArrayList;

import cs2.util.Vec2;

public class GenericStuff {
  
  public static ArrayList<Integer> arrayToListInts(int[] arr) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    for(int i=0; i<arr.length; i++) {
      al.add(arr[i]);
    }
    return al;
  }

  public static <T> ArrayList<T> arrayToList(T[] arr) {
    ArrayList<T> al = new ArrayList<T>();
    for(int i=0; i<arr.length; i++) {
      al.add(arr[i]);
    }
    return al;
  }

  public static <T extends Comparable<T>> void bubbleSort(T[] a) {
    for(int j=0; j<a.length; j++) {
      for(int i=0; i<a.length-1; i++) {
        if(a[i].compareTo(a[i+1]) > 0) {
          T tmp = a[i];
          a[i] = a[i+1];
          a[i+1] = tmp;
        }
      }
    }
  }

  public static void main(String[] args) {
    Integer[] myArr = {14, 1, 3, 2, 5, 18, 7, 9};
    System.out.println(myArr);
    ArrayList<Integer> myAL = arrayToList(myArr);
    System.out.println(myAL);

    bubbleSort(myArr);
    myAL = arrayToList(myArr);
    System.out.println(myAL);
    
    String[] myStrArr = {"Something","wicked","this","way"};
    System.out.println(myStrArr);
    ArrayList<String> myStrAL = arrayToList(myStrArr);
    System.out.println(myStrAL);

    Vec2[] vecs = { new Vec2(4,2), new Vec2(1,3), new Vec2(2,5) };
    System.out.println(arrayToList(vecs));
    bubbleSort(vecs);
    System.out.println(arrayToList(vecs));


  }
}
