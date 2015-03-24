import java.util.*;
class Demo{
  public static void main(String[] args){

    // create an array and convert to list
    Character[] array = {'p', 'w', 'n'};
    List<Character> list = Arrays.asList(array);
    System.out.println("List is : ");
    output(list);

    // reverse and print out the list
    Collections.reverse(list);
    System.out.println("After reverse: ");
    output(list);

    // create new array and new list
    Character[] newArray = new Character[3];
    List<Character> listCopy = Arrays.asList(newArray);

    // copy contents of list into listCopy
    Collections.copy(listCopy, list);
    System.out.println("Copy of list: ");
    output(listCopy);

    // fill collection with crap
    Collections.fill(list, 'X');
    System.out.println("After filling the list: ");
    output(list);

  }

  //output method
  public static void output(List<Character> thelist){
    for(Character thing : thelist){
      System.out.printf("%s ", thing);
    }
    System.out.println();
  }
}
