package cs2.generics;

import java.util.ArrayList;

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

  public static void bubbleSort(int[] a) {
    for(int i=0; i<a.length-1; i++) {
      if(a[i] > a[i+1]) {
        int tmp = a[i];
        a[i] = a[i+1];
        a[i+1] = tmp;
      }
    }
  }



  public static void main(String[] args) {
    Integer[] myArr = {1, 3, 5, 7, 9};
    System.out.println(myArr);
    ArrayList<Integer> myAL = arrayToList(myArr);
    System.out.println(myAL);

    String[] myStrArr = {"Something","wicked","this","way"};
    System.out.println(myStrArr);
    ArrayList<String> myStrAL = arrayToList(myStrArr);
    System.out.println(myStrAL);



  }
}
