import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task01 {

  public static void main(String[] args) {
    Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    addNumber("Иван Иванов", 11111, phoneBook);
    addNumber("Федор Федоров", 22222, phoneBook);
    addNumber("Петр Петров", 33333, phoneBook);
    addNumber("Иван Иванов", 44444, phoneBook);
    addNumber("Елена Еленова", 55555, phoneBook);
    addNumber("Галина Галеева", 66666, phoneBook);
    addNumber("Федор Федоров", 77777, phoneBook);
    printBook(phoneBook);
  }
  public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) { 
    if (map.containsKey(key)) {
      map.get(key).add(value);
    } else {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(value);
      map.put(key, list);
    }
  }
  public static void printBook(Map<String, ArrayList<Integer>> map) { 
    for (var item : map.entrySet()) {
      String phones = "";
      for (int el : item.getValue()) {
        phones = phones + el + ", ";
      }
      System.out.printf("%s: %s \n", item.getKey(), phones);
    }
  }
}
