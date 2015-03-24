import java.util.*;
class Demo{
  public static void main(String[] args){
    String[] things = {"eggs", "lasers", "pie", "apple"};

    List<String> list1 = new ArrayList<String>();

    for(String x: things){
      list1.add(x);
    }

    String[] morethings = {"eggs", "pie"};

    List<String> list2 = new ArrayList<String>();

    for(String y: morethings){
      list2.add(y);
    }

    for(int i = 0; i < list1.size() ; i++){
      System.out.printf("%s ", list1.get(i));
    }

    editlist(list1, list2);
    System.out.println();

    for(int i = 0; i < list1.size() ; i++){
      System.out.printf("%s ", list1.get(i));
    }
    System.out.println();
  }

  public static void editlist(Collection<String> list1, Collection<String> list2){
    Iterator<String> it = list1.iterator();
    while(it.hasNext()){
      if(list2.contains(it.next())){
        it.remove();
      }
    }
  }
}
