package Basics_of_java;

public class Operators {
    public static void main(String[] args) {
        Operators operators = new Operators();


        // Operators are symbols that perform operations on variables and values. They are categorized based
        // on their functionality.

        // The Arithmetic Operator

        int a = 3;
        float b = 4.3f;
//        System.out.println("Arithmetic Operator");
//        System.out.println(a+b);// Addition
//        System.out.println(a-b);// Subtraction
//        System.out.println(a*b);// Multiplication
//        System.out.println(a/b);// Division
//        System.out.println(a%b);// Modulus

        // The Relational Operator
        int c = 3;
//        System.out.println(a == c);
//        System.out.println(a == b);
//        System.out.println(a != c);
//        System.out.println(a != c);
//        System.out.println(a < b);
//        System.out.println(a < c);
//        System.out.println(a > b);
//        System.out.println(a > c);
//        System.out.println(a <= b);
//        System.out.println(a <= c);
//        System.out.println(a >= b);
//        System.out.println(a >= c);

        // The Logical Operator
//        System.out.println((a==b&&b==c));// logical and
//        System.out.println((a==b||b==c));// logical or
//        System.out.println((a!=b&&a==c)); // Logical not

        // The Bitwise Operator
//        int a1 = 10 , b1 = 20,c1=10;
//        System.out.println((a1&b1)); // Bitwise and
//        System.out.println((a1&c1));
//
//        System.out.println((a1|b1)); // Bitwise or
//        System.out.println((a1|c1));
//
//        System.out.println((a1^b1));// Bitwise XOR
//        System.out.println((a1^c1));
//
//        System.out.println((~a1)); // Bitwise Complement
//        System.out.println((~b1));
//
//        System.out.println(a1<<b1); // Bitwise Left Shift
//        System.out.println(b1<<a1); // Bitwise Left Shift
//
//        System.out.println(a1>>b1); // Bitwise Right Shift
//        System.out.println((b1>>a1)); // Bitwise Right Shift
//
//        System.out.println(a1>>>b1); // Unsigned Right shift
//        System.out.println((a1>>>c1));

        // The Assignment Operator
        int f;
        f=1000; // = assigning operator

        // compound assignment
        f+=2;
        f-=1;
        f*=4;
        f/=2;
        f%=5;

        // Unary Operators

       // + --> unary plus
        // - --> unary minus

        int x = 0;
        x++;// increment
        x--; // decrement
        // ! logical complement

        // Ternary Operator

        int y=3;
        int ans = (x==y)?x+y:y++;



     // Instance of Operator
        System.out.println(operators instanceof Operators ? operators:null);



    }}



/*

Notes :-

Arithmetic Operators: Perform basic math operations.
+ (Addition), - (Subtraction), * (Multiplication), / (Division), % (Modulus)

Relational (Comparison) Operators: Compare two values.
== (Equal), != (Not Equal), < (Less Than), > (Greater Than), <= (Less Than or Equal),
>= (Greater Than or Equal)

Logical Operators: Combine boolean conditions.
&& (Logical AND), || (Logical OR), ! (Logical NOT)

Bitwise Operators: Perform bit-level operations.
& (Bitwise AND), | (Bitwise OR), ^ (Bitwise XOR), ~ (Bitwise Complement),
<< (Left Shift), >> (Right Shift), >>> (Unsigned Right Shift)

Assignment Operators: Assign or update values.
= (Assign), +=, -=, *=, /=, %= (Compound Assignments)

Unary Operators: Operate on a single operand.
+ (Unary Plus), - (Unary Minus), ++ (Increment), -- (Decrement), ! (Logical Complement)

Ternary Operator: A concise conditional expression.
? : (Ternary)

Instanceof Operator: Test if an object is of a specific type.
instanceof


*/
