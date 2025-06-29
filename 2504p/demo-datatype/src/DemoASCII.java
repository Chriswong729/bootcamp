public class DemoASCII {
  public static void main(String[] args) {
    // convert char to int
    char c = 'a'; // 97 in ascii
    int x = c; 
    System.out.println(x);

int y = 65; 
char c2 = (char) y; // char c2 =y !during compile time, variable y is int range, so is unsafe
System.out.println(c2);

// overflow ()
// char range 0 - 65535
System.out.println((char) 65610);

int x1 = 128;
byte b1 = (byte) x1; 
System.out.println(b1);

// byte -> short -> int -> long -> float -> double
//          char -> int
float f1 = 10L; 
System.out.println(f1);
double d1 = 100.25f;
System.out.println(d1);

long l2 = (long) 10.9f; 
System.out.println(l2);


  }
}
