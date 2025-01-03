# Items to Refresh on:

These are all items that I either had to search online or got wrong on the first try and had to retype.

## Number Practice
### Floats
Create a float using the "float" keyword and an "f" at the end of the number.
```
float exampleFloat = 0.123f;
```
### Print to console
To print in Java, call the println() method on System.out.
```
System.out.println("")
```

## List Practice
### Imports
To use an ArrayList, you must first import the java.util package.
```
import java.util.ArrayList;
```
### List types
When you create a list or an array list, you should specify the type of data is contained in that list, using "<>".
```
List<String> stringList = new ArrayList<String>();
```
### Adding to a list
Use the "add" method to add an item to a list or array list.
```
listOfDigits.add(2);
```
### Changing an element at an index on a list
Use the "set" method to change the item at a specific index without changing the length of the list.
```
listOfFruit.set(0, "apple");
```
### Collections
To use the Collections library, you must first import the java.util package.
```
import java.util.Collections;
```
Use Collections.sort() to sort the contents of a list or array list.
```
Collections.sort(listOfGrades);
```
### For Each
The syntax for a for-each loop is as follows: "for (TYPE VARIABLE : SOURCE) { // do code};"
```
   for (String animal : zoo) {
      System.out.println(animal);
    };
```
## Array Practice
### Create an Array
Create an array with the following syntax:
```
String[] arr = {"hi", "hey", "hello};
```
### Print an array
To print an array, you must convert it to a String.
```
import java.util.Arrays;
int[] numbers = {1, 2, 3}
System.out.println(Arrays.toString(numbers)) // expected output: "[1, 2, 3]"
```
- 