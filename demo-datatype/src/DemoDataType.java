public class DemoDataType {
public static void main(String[] args) {
    System.out.println("Hello, World!");
    // Variable
    // ! integer (+ve -ve)
    // ! int
    // "="-> asssignment 
    // from right to left 
    // x and y are variable
    int x = 3;
    //put 7 into y
    int y = 7;

    System.out.println("x");
    System.out.println(x);
    System.out.println("y");
    System.out.println(y);
    
    //re-assign value 10 into variable x
    x = 10;
    System.out.println(x);
    
    y = 100; 
    System.out.println(y);
    // shortcut: sysoyt -> System.out.println();
    int age = 65; 
    int salary = 20000; 
    // variable name convention
    // 1. must started with a-z
    // 2. Camel case
    int tutorName = 3; 

System.out.println(tutorName);
// Declaration for variable type
int a;
// Same variable name can be declared once only
// Assignment
a = 4;
System.out.println(a);

// declaration and assignment
int w =10;

    //2 ! double 
    double d1 = 4.45;
    System.out.println(d1);

    double d3;
    d3 = 10.4; 
    System.out.println(d3);
    
    // + - * /
    int x2 = 6 + 1; 
System.out.println(x2);
    int x3 = 9;
    // ! put x3 value into
    x2 = x3; 
    System.out.println(x2);
    System.out.println(x3);

    int x4 = 10; 
    x2 = 7 + x4;
System.out.println(x2);

//add 3 to itself
    x2 = x2 + 8;
    System.out.println(x2);

    // Data Type: Primitives 
    // 1. Store integer: byte, short, int, long, 
    // 2. store number with decimal place: float, double
    // 3. Store single character: char
    // 4. store ture or false: boolean

    // byte
    byte b1 = 3; // (-128-127)
    short s1 = 3; // (-32768 - 32767)
    int i1 = 3; // (-21m.x - 21m.x)
    long l1 = 3; // (2^63)
    // over the number will back to start point, overflow. eg: 127 +1 = -128
    // prepare an long value 22m
    // assign a value into long variable
    // l1 = 2_200_000_000// system error (you can not prepare an int value over 21m )
    l1 = 2_200_000_000L; 
    l1 = l1 + 3L; 
System.out.println(l1);
l1 = l1 + 2_200_000_000L; 
System.out.println(l1);

// long + int -> long + long = long
long l2 = 2_200_000_000L + 5; 

    // byte short?
    //int i8 = 9; 
    //byte b9 = i8; // what is the type of i8? int not number, so not ok (unsafe)
    // byte b10 = 3 // direct value -> safe
    // short s11 = i8; // same not direct value so unsafe 

    // why not only use long? waste java think the range of int value should solve the majority of problem in system, so we won't use long as a default tye of variable for storing integer







  }
}