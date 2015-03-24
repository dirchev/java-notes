import java.util.*;
class Demo{
  public static void main(String[] args){

    String[] things = {"apples", "noobs", "pwnge", "bacon", "goATS"};
    List<String> list1 = new LinkedList<String>();

    for(String x: things){
      list1.add(x);
    }

    String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
    List<String> list2 = new LinkedList<String>();

    for(String y: things2){
      list2.add(y);
    }

    list1.addAll(list2);
    list2 = null;

    printMe(list1);
    removeStuff(list1, 2, 5);
    printMe(list1);
    reverseMe(list1);
  }

  //printMe method
  private static void printMe(List<String> list){
    for(String b: list){
      System.out.printf("%s ", b);
    }
    System.out.println();
  }

  //removeStuff method
  private static void removeStuff(List<String> list, int from, int to){
    list.subList(from, to).clear();
  }

  //reverseMe method
  private static void reverseMe(List<String> list){
    ListIterator<String> iterator = list.listIterator(list.size());
    while(iterator.hasPrevious()){
      System.out.printf("%s ", iterator.previous());
    }
    System.out.println();
  }
}
