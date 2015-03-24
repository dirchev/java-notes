# Методът addAll() с колекции в Java
В този урок ще разгледаме как се използва методът **addAll()**, който позволява събирането на две колекции в една.

### Подготовка
Преди да покажем как работи методът, нека първо да инициализираме един масив, в който ще поставим наколко низа.

```
String[] stuff = {"apple", "banana", "corn", "ham"};
```

След това ще направим и нашата колекция, в която също ще поставим няколко думи.

```
ArrayList<String> list2 = new ArrayList<String>();
list2.add("youtube");
list2.add("google");
list2.add("digg");
```

### Използване на addAll()
Вече имаме готов списък, който при принтиране на конзолата
```
for(String x: list2){
  System.out.printf("%s ", x);
}
System.out.println();
```

изкарва следния резултат

```
>>> youtube google digg
```

*Методът **addAll()** е от класа **Collections***. Той приема два параметъра: първият е списъкът, към който ще се добавят низовете от масива, а вторият е масивът.

```
Collections.addAll(list2, stuff);
```

След принтиране на списъка отново в конзолата

```
for(String x: list2){
  System.out.printf("%s ", x);
}
System.out.println();
```

получаваме следния резултат

```
>>> youtube google digg apple banana corn ham
```

### Краен резултат
Ето я и цялата програма
```
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

```
