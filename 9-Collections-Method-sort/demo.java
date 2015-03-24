import java.util.*;
class Demo {
  public static void main(String[] args){

    String[] crap = {"apple", "lemons", "bacon", "youtube"};
    List<String> list1 = new LinkedList<String>(Arrays.asList(crap));

    Collections.sort(list1);
    System.out.printf("%s\n", list1);

    Collections.sort(list1, Collections.reverseOrder());
    System.out.printf("%s\n", list1);

  }
}
