package cs2.util;

import java.util.*;
import java.io.*;

public class TextAnalysis {

  public static HashSet<String> getWords(String filename) {
    HashSet<String> words = new HashSet<String>();
    try {
      Scanner fin = new Scanner(new File(filename));
      while(fin.hasNextLine()) {
        String line = fin.nextLine();
        System.out.println(line);
        String[] parts = line.split("\\s");
        System.out.println(parts.length);
        for(int i=0; i<parts.length; i++) {
          words.add(parts[i].replaceAll("[^A-Za-z]","").toLowerCase());
        }
      }
    
    } catch (Exception e) {
      e.printStackTrace();
    }
    return words;
  }

  public static void main(String[] args) {
    HashSet<String> temp = getWords("tempest.txt");
    HashSet<String> mid = getWords("midsummer.txt");

    System.out.println(temp.size());
    System.out.println(mid.size());

    HashSet<String> copy = (HashSet<String>)temp.clone();

    copy.removeAll(mid);
    System.out.println(temp.size());
    
    Iterator<String> myIt = temp.iterator();
    while(myIt.hasNext()) {
      System.out.println(myIt.next());
    }

    for(String word : temp) {
      System.out.println(word);
    }
    System.out.println(temp.size());

  }
}
