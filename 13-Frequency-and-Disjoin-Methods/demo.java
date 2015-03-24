import java.util.*;
class Demo{
  public static void main(String[] args){
    String[] things1 = {"apple", "beer", "kiwi", "cat", "beer", "guitar"};
    List<String> list1 = Arrays.asList(things1);

    String[] things2 = {"kiwi", "reader"};
    List<String> list2 = Arrays.asList(things2);

    System.out.println("List1 have " + Collections.frequency(list1, "beer") + " times beer in it");
    System.out.println("List1 have " + Collections.frequency(list1, "cat") + " times cat in it");

    boolean trueOrFalse = Collections.disjoint(list1, list2);
    System.out.println(trueOrFalse);

  }
}
