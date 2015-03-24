# Свързани списъци (LinkedList) в Java
**Свързаните списъци са съшите като обикновените списъци, които използвахме до сега, но имат допълнителни методи, които ни позволяват да правим повече неща.**

В този урок ще направим отново 2 колекции, след което ще добавим нещата от втория списък в първия. Освен това ще подготвим няколко метода, които да правят различни неща с нашите списъци.

### Създаване на двата списъка
Ще създадем нови два списъка, по обичайният начин - чрез масиви.

```
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
```

### Сливане на двата списъка
За добавянето на елементите от втория списък в първия ще използваме един от методите, които се предлагат в свързаните списъци - allAll();
```
list1.addAll(list2);
```
След като сме прехвърлили елементите, може да изчистим вторият списък.
```

list2 = null;
```

### Методите, които ще направим сами са:
1.  Принтиране на списък.
```
  printMe(list1);
```
2. Изтриване на елементи от списък *с въвеждане на начална и крайна позиция*.
```
  removeStuff(list1, 2, 5);
```
3. Принтиране на елементите в обратен ред.
```
reverseMe(list1);
```

### Краен резултат
**имплементацията на тези методи ще направим в следващия урок...**

```
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
}
```
