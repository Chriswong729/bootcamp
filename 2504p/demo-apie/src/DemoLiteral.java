public class DemoLiteral {
  // ! literal pool -> String
  // ! internal Cache -> int, byte, short, long, boolean, char
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    String s3 = "olleh";
    System.out.println(s1.equals(s2));// true, string Author determinr the defintion of equals()
    System.out.println(s3.equals(s2));

    System.out.println(s1 == s2);// true Literal

    String s4 = new String("hello");
    System.out.println(s1 == s4);
    String s5 = new String("hello");
    System.out.println(s4 == s5);

    String s6 = new String ("hello").intern();
    System.out.println(s1 == s6);
    System.out.println(s4 == s6);

    // -128 to 127
    Integer i1 = 127;
    Integer i2 = 127;
    Integer i3 = new Integer(127);
    System.out.println(i1 == i2); // true
    System.out.println(s1 == s3); //false

    // ! there will be two 128 object in memory
    Integer i4 = 128; 
    Integer i5 = 128;
    System.out.println(s4 == s5); // false

    // -128 to 127    
    Byte b1 = 127;
    Byte b2 = 127;
    System.out.println(b1 == b2);
    Byte b3 = new Byte("127");
    System.out.println(b1 == b3);

    Boolean n1 = true; 
    Boolean n2 = true;
    Boolean n3 = new Boolean(true);
    System.out.println(n1 == n2);
    System.out.println(n1 == n3);

    // character (0-6xxxx), Cache range 0-127
    Character c1 = 'A';
    Character c2 = 'A';
    Character c3 = new Character('A');
    System.out.println(c1 == c2);
    System.out.println(c1 == c3);
    Character c4 = '禪';
    Character c5 = '禪';
    System.out.println(c4 == c5);


    // valueof()
    Integer i10 = Integer.valueOf(100);
    Integer i11 = Integer.valueOf(100);
    System.out.println(i10 == i11); // true

    // Conclusion
    // ! For String, in real life, we should use "hello" or String.valueOf("hello")
    // ! For Integer, in real life, we should use "10" or Integer.valueOf(10))
    // You Should not use "new" 

  }
}
