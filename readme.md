## Anatomy of a Java Program-
- Java is an Object oriented programming language. To write anything with Java, we need to follow a template. After creating a new Java project, you need to create a class and all of our functionalities will go inside the method mentioned inside that class. That is the structure we need to follow.
  - public class inheritance.Main{ --inheritance.Main class
        public static void main(){ --main method
            System.out.println("Hello World");
        }
    }
- It is not mandatory to use the name inheritance.Main, but main is generally the entry point to the code.

## Data Types in Java-
- We have got two main data types in Java. Primitive type and reference type.
- Primitive Type-- This type stores the data inside the variable, the variable directly points to the data. Which means If we copy the data, It creates a deep copy.
  - byte myByte = 20 //To store very small Integer values. //1 byte memory
  - short myShort = 234 //It stores bigger Int values than a byte. //2 byte memory
  - int myInt = 5000 //It can store much larger Integers. This is what we use mostly to store numbers. //4 byte memory
  - long myLong = 50000L //For storing very big numbers. // 8 byte memory
  - float myFloat = 3.55F //For storing decimal numbers.(less precision) // 4 byte memory
  - double myDouble = 3.56666 //For storing more precise decimal numbers. //8 byte memory
  - char myChar = 'd' //To store single character(remember to use '' brackets). //2 byte memory
  - boolean myBool = false //To store true/false values. //1 bit memory

- Reference Type-- Here the variable stores the pointer or the address of the actual value. The data gets stored inside the heap and If we copy only a new pointer gets created, not new value.
  - String
  - Object
  - Class
  - Array

## String-

- Strings are reference type in Java. And also immutable in nature, which means when we create a string the variable stores the pointer to the memory location and If we create another string with same value, Java just creates a new pointer but don't assign a new memory.
- For this reason only we cannot mutate a string, 
  - For example If str1 points to "Deep" and str2 also points to "Deep", and we change str1 to "Walter". In the background Java will create a new memory location with the value "Walter" and str1 will just point to that memory location. But str1 will still point to "Deep".
#### How to create a String-
- String myName = "Deep";
- String myName = new String("Deep"); //Here new Instance of String object gets created everytime, even If the values are same. It will always create a new memory location and store the value. Use It carefully.

## Curious case of == and .equals()-
- Both can be used to check If two values are same or not.
- == are used to compare primitive values, where the variable stores the data/value
- .equals() is used to compare any object type or reference type  like String, Array.

## Array and ArrayList-

### Array-
- Used to store multiple values of same data type inside one variable.
   - They are fixed in size.
   - By default, arrays can hold any type of data.
   - ### Declaration
   - String[] friendsArr = new String[4];
   - String[] friendsArr = {"Walter", "Gus", "Mike", "Saul"};
   - Here we are declaring an array of strings with four values.
   - **Array Methods-**
     - To modify the value friendsArr[0] = "Deep"
     - To access the value System.out.println(friendsArr[0]);
     - To know the length friendsArr.length;
   - If you try to print the Array, you will get some gibberish as output and that is the memory location/ the pointer. To print the Array with all the values you can do _System.out.println(Arrays.toString(friendsArr));_
   - if you want to compare two Array for equalities use _Arrays.equals(arr1, arr2)_
      -Note **import java.util.Arrays;** You need to import Arrays package.
   - If you create an array of n size with the  **new** keyword and don't assign any value, by default for _integers_ the values will be **0** and for _string_ the values will be **null**.

### ArrayList-
- Use case is same as an array but with some changes.
  - Arraylist are not fixed in size, they are dynamic.
  - By default, ArrayList can hold only non-primitive type.
    - But there is a way around you need to use the wrapper class of primitive data type. _ArrayList_<_int_> this will not work but _ArrayList_<_Integer_> this will.
  - You need to use **import java.util.ArrayList;**
  - ### Declaration
  - ArrayList<String> friends = new ArrayList<>();
  - ArrayList<String> friendsList = new ArrayList<>(Arrays.asList("Gus", "Walter", "Mike", "Saul"));
  - **Arraylist Methods-**
    - To access friendsList.get(0);
    - To add values to the end friendsList.add("Deep");
    - To modify value friendsList.set(2, "Gale");
    - To remove value friendsList.remove(index or the value);
    - To know the length friendsList.size();

### Arrays and loop-
- To print all the values of an Array or Arraylist we use loop. We can use any kind of loop but forEach loop is recommended with arrays
- for(String element: friendsList){
  System.out.println(element);
  }

## Map and HashMap-


## Access Modifier-
MODIFIER   CLASS PACKAGE SUBCLASS WORLD
public       Y      Y        Y       Y
protected    Y      Y        Y       N
no modifier  Y      Y        N       N
private      Y      N        N       N

## Inheritance-
- 'is a'
- Java does not allow multiple inheritance. Means one subclass cannot extend two parent class. This is also known as diamond problem. Because the child class struggles to understand which parent class to follow.

## Abstract Class-
- sometimes a class can have some method which is not defined just declared. In that case we need to make that method abstract and also the class an Abstract class. 
- public abstract method(); --Method declaration
- public method(){
     System.out.println("..."); --Method definition
   }
### Some points to remember-
1. You cannot create an object from an abstract class.
2. If any class extends abstract class, that class needs to define all the declared method from the abstract class.
3. You can create objects in Java from concrete class.

## Interface-
