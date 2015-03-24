import java.util.*;
class Demo{
  public static void main(String[] args){

    String[] stuff = {"bear", "watermelong", "melons", "balls"};
    LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));

    thelist.add("pumpking");
    thelist.addFirst("firstthing");

    // convert back to an array
    stuff = thelist.toArray(new String[thelist.size()]);

    for(String x: stuff){
      System.out.printf("%s ", x);
    }
    System.out.println();
  }
}
