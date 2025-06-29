public class DemoString {
  public static void main(String[] args) {
      // string is NOT primitive, which consist of a set of char value
// 8 primitive store values only
// string store values + functions
    String s3 = "vincent";
    System.out.println(s3);

    // Function 1: equals ()
    System.out.println(s3.equals("vincent"));
    System.out.println(s3.equals("Vincent"));

    // Function 2: length ()
System.out.println(s3.length());

    // Function 3: charAt()
// index starts with 0 
// index range from 0-6
System.out.println(s3.charAt(0)); // 'n' the char at postion 3
// System.out.println(s3.chars(7)); // out of range 
// System.out.println(s3.charAt(-1)); // out of range

// Question
// print the last character of s3
// Frist one = 0
System.out.println(s3.charAt(s3.length()-1));

// find middle character of name
    String name = "joey"; 
System.out.println(name.charAt((name.length()+1)/2));

// function 4 : indexof()
String s4 = "Sally";
System.out.println(s4.indexOf('a'));
System.out.println(s4.indexOf('b'));
System.out.println(s4.indexOf('l'));
System.out.println(s4.lastIndexOf("ll"));


// function 5 contains()
System.out.println(s4.contains("ll"));
System.out.println(s4.contains("lll"));

if (s4.contains("ll")){
    System.out.println("the name contains \"ll\"");
}

// function 6 startwith()
System.out.println(s4.startsWith("Sa"));
System.out.println(s4.startsWith("SA"));

if (s4.startsWith("Sa")){
    System.out.println("is start with \"Sa\"");
}

// function 7 endwith()
System.out.println(s4.endsWith("ly"));
System.out.println(s4.endsWith("llly"));

// function 8 isempty
String s5 = ""; // empty string
System.out.println(s5.isEmpty());
System.out.println(s4.isEmpty());

if (s5.isEmpty()){
    System.out.println("s5 is really an empty string");
} else {
    System.out.println("s5 is not empty string");
}

// function 9 concat
String s6 = "adc";
System.out.println(s6.concat("def"));
System.out.println(s6);

// function 10 replace(old, new)
String s7 = "hello";
System.out.println(s7.replace('l', 'x'));
System.out.println(s7.replace("ll", "abc"));

// function 11 substring ()
String s8 = "hello world";
System.out.println(s8.substring(4, 7)); 
// End number will -1

// function 12 toLowercase(), toUpperCase()
String s9 = "Hello";
System.out.println(s9.toLowerCase());
System.out.println(s9.toUpperCase());

// function 13 valueOf() -> Conversion
int x = 3;
String ss = String.valueOf(x);
System.out.println(ss);
String ss2 = String.valueOf(3.3); 
System.out.println(ss2);

Double d1 = Double.valueOf("3.3");
System.out.println(d1);











  }
}
