

public class Arrays_and_String {


    public static void main(String[] args) {

/*

An array is a collection of elements of the same data type stored in contiguous memory locations.

Key Points:
Fixed size, declared at creation.
Indexed starting from 0.
Can store primitives or objects.
*/

// Declaration
int[] numbers;
// Initialization
numbers = new int[5];
// Declaration + Initialization
int[] number = {1, 2, 3, 4, 5};
// Accessing array elements
        System.out.println(number[2]); // getting 3rd element
        numbers[3] = 100; // Modify the 4th element

// Multi Dimensional Array
        int [][] matrix = {{1,1,3},{1,3}};

        System.out.println(matrix[1][1]); // row1 column 3



        // Strings
//        A String is a sequence of characters, represented as an object in Java.
//         Strings are immutable, meaning once created, their content cannot be changed.

        String s1 = "Hello"; // Using string literal
        String s2 = new String("World"); // Using new keyword

        System.out.println("Strings");

        System.out.println(s1);
        System.out.println(s2);
        s1="Helllllo";
        System.out.println(s1);
//        Strings are objects of the String class.
//        Provides many built-in methods for manipulation.



        String s = "Java Programming";

// Length of string
        System.out.println(s.length());

// Access character at index
        System.out.println(s.charAt(5));

// Substring
        System.out.println(s.substring(5, 8));

// String comparison
        System.out.println(s.equals("Java Programming"));

// Convert to uppercase
        System.out.println(s.toUpperCase());

// Replace characters
        System.out.println(s.replace("a", "o"));


//        String concatenation

        String n1 = "Hello";
        String n2 = "World";
        String result = n1 + " " + n2; // Using + operator
        System.out.println(result);


  // If you want mutable string you can use string builder or buffer classes

       StringBuffer stringBuffer = new StringBuffer("Apple");
        System.out.println(stringBuffer);
        stringBuffer.append(" is a Fruit.");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Farooque Sajjad");
        System.out.println(stringBuilder);
        stringBuilder.append(" KK");
        System.out.println(stringBuilder);



    }
}
