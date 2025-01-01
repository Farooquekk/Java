public class Control_Structures {


   // if else
    void isAllowed(int age){
        if(age<0 || age>120) System.out.println("Invalid Age");
        else if (age >18) {
            System.out.println("You are allowed to go");
        }
        else{
            System.out.println("You are not allowed");
        }


    }

    // switch statement
    void dayOfWeek(int day) {
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");

        }
    }

    // enhanced switch statement

    void dayOfWeek2(int day) {
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Day");
        }
    }
    public static void main(String[] args) {

      Control_Structures controlStructures = new Control_Structures();
        System.out.println();
       controlStructures.isAllowed(14);
       controlStructures.isAllowed(-114);
       controlStructures.isAllowed(0);
       controlStructures.isAllowed(19);
       controlStructures.isAllowed(134);

        System.out.println();
        controlStructures.dayOfWeek(0);
        controlStructures.dayOfWeek(1);
        controlStructures.dayOfWeek(2);
        controlStructures.dayOfWeek(3);
        controlStructures.dayOfWeek(4);
        controlStructures.dayOfWeek(5);
        controlStructures.dayOfWeek(6);
        controlStructures.dayOfWeek(7);
        controlStructures.dayOfWeek(8);


    }
}


//    Control structures determine the flow of execution in a Java program. They
//    enable you to make decisions, repeat actions, or manage different paths based on
//    conditions.

//if-else: Evaluates boolean conditions and supports complex logical expressions.
//switch: Matches a value against predefined cases; does not support boolean conditions.
//Enhanced switch: Introduced in Java 12+, supports multiple case labels, -> syntax, and
// can return values directly (expression-based).
