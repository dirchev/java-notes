# Методите frequency() и disjoint() с колекции в Java
В този урок ще разгледаме методите:
  . frequency() - проверява колко пъти променлива се среща в даден списък
  . disjoint() - проверява дали поне един от елементите на един списък се срещат в друг

## Подготовка
За да можем да разгледаме тези методи е нужно да създадем два списъка
```
String[] things1 = {"apple", "beer", "kiwi", "cat", "beer", "guitar"};
List<String> list1 = Arrays.asList(things1);

String[] things2 = {"kiwi", "reader"};
List<String> list2 = Arrays.asList(things2);
```

## frequency()
Методът **frequency()** е част от класа **Collections** и приема 2 параметъра:
  1. първият е за списъка, в който ще се проверява
  2. вторият е порменливата, която ще се търси в списъка

Методът връща променлива от тип **int**, която отговаря на броя на срещанията на променливата в списъка.

След 2 теста с думите **beer** и **cat**

```
System.out.println("List1 have " + Collections.frequency(list1, "beer") + " times beer in it");
System.out.println("List1 have " + Collections.frequency(list1, "cat") + " times cat in it");
```

получаваме следният изход в конзолата

```
>>> List1 have 2 times beer in it
>>> List1 have 1 times cat in it
```

## disjoint()
Методът **disjoint()** е част от класа **Collections** и приема 2 параметара: листите, които ще се сравняват.
  * Ако има съвпадение на поне една променлива в двата листа, методът връща **false**
  * Ако няма съвпадение на поне една променлива в двата листа, методът връща **true**

Нека запишем резултата от този метод в променлива и след това я принтираме в конзолата

```
boolean trueOrFalse = Collections.disjoint(list1, list2);
System.out.println(trueOrFalse);
```

в конзолата получаваме

```
>>> false
```

## Краен резултат
Цялата програма изглежда така

```
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
```
