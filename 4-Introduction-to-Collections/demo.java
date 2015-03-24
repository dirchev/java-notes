import java.util.*;
class Demo{
  public static void main(String[] args){
    String[] things = {"eggs", "lasers", "pie", "apple"};

    List<String> list = new ArrayList<String>();

    for(String x: things){
      list.add(x);
    }

    for(int i = 0; i < list.size() ; i++){
      System.out.println(list.get(i));
    }
    
  }
}
