package cs2.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetStuff {
  public static void main(String[] args) {
    String h = "Hello";
    String g = "He";
    g += "llo";
    System.out.println(h == g);

    HashSet<String> set = new HashSet<String>();
    System.out.println(set.add("Hello"));
    set.add("Goodbye");
    set.add("there");
    System.out.println(set);
    System.out.println(set.add("Hello"));
    set.add(h);
    set.add(g);
    System.out.println(set);
    System.out.println("-----");
    System.out.println(set.contains("there"));
    System.out.println(set.contains("over"));
    System.out.println(set.remove("Hello"));
    System.out.println(set.remove("over"));
    System.out.println(set);
    System.out.println(set.size());
    set.clear();
    System.out.println(set);

    Set<Integer> s1 = new HashSet<Integer>();
    Set<Integer> s2 = new HashSet<Integer>();
    for(int i=0; i<10; i+=2) { s1.add(i); }
    s2.add(3);
    s2.add(5);
    s2.add(8);
    s2.add(6);
    s2.add(10);
    System.out.println(s1);
    System.out.println(s2);
    s1.removeAll(s2);
    System.out.println(s1);
    System.out.println(s2);

    Iterator<Integer> it = s2.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }




  }
}
