package cs2.util;

import java.util.*;

public class MapStuff {
  public static void main(String[] args) {

    HashMap<Character,String> map = new HashMap<Character,String>();
    map.put('A',"apple");
    map.put('C',"carrot");
    map.put('B',"banana");
    map.put('D',"apple");
    System.out.println(map);
    System.out.println(map.containsKey('A'));
    System.out.println(map.containsKey('Q'));
    System.out.println(map.containsValue("apple"));
    System.out.println(map.containsValue("Apple"));
    System.out.println(map.size());
    System.out.println(map.get('B'));
    System.out.println(map.get('Q'));
    map.put('A',"aardvark");
    System.out.println(map);
    System.out.println(map.keySet());

    for(Character key : map.keySet()) {
      System.out.println(key + " has value " + map.get(key));
    }
  
  }
}
