import java.util.*;
class Demo{
  public static void main(String[] args){

    // create an array and convert to a list
    String[] stuff = {"apple", "banana", "corn", "ham"};
    
    ArrayList<String> list2 = new ArrayList<String>();
    list2.add("youtube");
    list2.add("google");
    list2.add("digg");

    for(String x: list2){
      System.out.printf("%s ", x);
    }
    System.out.println();

    Collections.addAll(list2, stuff);

    for(String x: list2){
      System.out.printf("%s ", x);
    }
    System.out.println();

  }
}
