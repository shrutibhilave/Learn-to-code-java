# Java Arrays

An **array** is a data structure that consists of a group of elements. Typically the elements will be of the same data type, such as a *string* or an *integer*. Arrays are commonly used to organise data so that a related set of values can be easily sorted or searched.

As an example, an online shopping cart may use an array to store items selected by the user for purchase. When viewing the cart, the program will output one element of the array at a time. While the program could create a new variable for each result found, storing the results in an array is much more efficient way to programme and manage memory.

To declare an array, define the variable type with square brackets:

    String[] products;

Once declared, this variable now holds an array of strings. To add values to it, we can use what is known as an array literal - put the values in a comma-separated list, within curly braces:

    String[] products = {"Book", "Keyboard", "Toy", "Camera"};

Similarly, to create an array of integers, you could specify:

    int[] prices = {4, 12, 8, 40};

**Useful resources**

[w3schools - arrays](https://www.w3schools.com/java/java_arrays.asp)

[Oracle - Java arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

# ArrayList 

In addition to the arrays, Java provides an ArrayList class that can be used to create
containers that store lists of objects. The ArrayList class provides some advantages over
the Arrays class. Specifically, an ArrayList is **dynamically resizable** , meaning that its size
can change during program execution. This means that:

* You can add an item at any point in an ArrayList container, and the array size expands
automatically to accommodate the new item.

* You can remove an item at any point in an ArrayList container, and the array size
contracts automatically.

To use the ArrayList class, you must use one of the following import statements:

`import java.util.ArrayList;`

`import java.util.*;`
