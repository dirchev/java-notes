# Програма с колекции в Java
**В този урок ще покажем как се търсят и изтриват елементи от колекция**

Ще направим втора колекция, която да съдържа само някой от елементите на първата. След това ще направим собствен метод, който да  взима двете колекции и да изтрие елементите от първата, които се срещат и във втората. След дова ще принтираме новополучилата се колекция.

### Създаване на втората колекция
Създаването на втората колекция ще направим отново с помощта на масив от низове, който ще обходим с цикъл, за да изградим новата колекция.

```
// правим втори масив само с някой от елементите на първия
String[] morethings = {"eggs", "pie"};

// инициализираме новата колекция
List<String> list2 = new ArrayList<String>();

// копираме стойностите от масива в колекцията
for(String y: morethings){
  list2.add(y);
}
```

### Идеята за новия метод
За да направим премахването на повтаряшите се елементи, ще направим отделен метод.

```
editlist(list1, list2);
```

Методът ни ще приема 2 параметъра: първата колекция с всички неща, и втория, който ще съдържа само неща, които ще премахваме.

```
public static void editlist(Collection<String> list1, Collection<String> list2){
  // съдържание на метода
}
```

### Имплементация на новия метод
За да обходим първият лист този път ще използваме **итератори**.

**Итераторите преминават през всеки елемент от колекцията.**

Първо трябва да инициализираме отератор от първата колекция. Ще го кръстим "it":

```
Iterator<String> it = list1.iterator();
```

След това ще направим и цикъла, който да преминава през всеки елемент чрез итератора. Използваме it.hasNext(), което проверява дали сме на последният елемнт от колекцията, към която е направен итератора.

```
while(it.hasNext()){
  // команди в цикъла
}
```

В цикъла трябва за всеки елемент от list1 да проверим дали се съдържа в list2. Ако това е вярно, трябва да изтрием този елемент от list1.


```
while(it.hasNext()){
  if(list2.contains(it.next())){
    it.remove();
  }
}
```

Вече сме изтрили повтарящите се елементи, остава само да принтираме полученият резултат. Цялата програма изглежда така:

```
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
```
