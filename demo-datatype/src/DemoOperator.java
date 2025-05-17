public class DemoOperator {
  public static void main(String[] args) {
    // +,-,*,/,%
    int x = 3;
    x = 6 + 9;
    int y = 5 + x -10;
System.out.println(y);
    int a = y - 9 * 2;
System.out.println(a);
int b = (y - 9) * 2;
System.out.println(b);


// divided by zero -> error 
// java : int/ int value = int (5/2=2) double/ int = double (eg 5.0/2=2.5)

double score1 = 71;
double score2 = 82;
double averageScore = (score1 + score2) / 2.0; 
System.out.println(averageScore);

// big problem
double d5 = 0.1 + 0.2;
System.out.println(d5); // 0.300000004

double d6 = 0.2 + 0.3;
System.out.println(d6);

int r8 = 10 % 3; 
// remainder of 10/3 
System.out.println(r8);//1

// boolean (either true or false)
boolean b9 = true; 
b9 = false; 

int result = 5; 
// "result % 2 = 1
boolean isResultOddNumber = result % 2 == 1; // == checking if equals to 
System.out.println(isResultOddNumber);

int johnage = 64;
boolean isElderly = johnage >= 65; 
System.out.println(isElderly);

boolean isMale = false; 

// char (keyboard), single quote
// Assign char value 'a' into char value
char c1 = '@';
System.out.println(c1);
c1 = '$';
c1 = 'a';
char c2 = 'A'; 
System.out.println(c1 == c2);// because java is case sensitive

//float (store decimal numder)
//float f1 = 3.14159;
// 3.14159 is double value
// unsafe can't assign value to float value (double 64 bits, float 32 bits)
float f1 = 3.14159f; 
f1 = 0.1f + 0.2f; 
System.out.println(f1);
// problem 0.3f + 0.4f = 0.700005


// we can't assign a bigger range of variable to smaller range of variable (by default)
// Force assignment
byte b40 = (byte) 129L;
System.out.println(b40);// -127 (overflow)

// + 1
int t = 0; 
t++; 
++t;
t = t + 1;
t += 1;
System.out.println(t);

//-1
int w =0; 
w--;
--w;
w = w -1;
w -= 1;
System.out.println(w);

// =/- non 1 value
int o = 3;
o -= 4;
o += 4;
System.out.println(o);

int q = 3;
q = q * 3;
q *= 3;
System.out.println(q);

int v = 27;
v /= 3;
v = v / 3;
System.out.println(v);

// comparison
// >, <, >=, <=, ==, !=
int score = 91;
boolean isGradeA = score >= 90;
System.out.println(isGradeA);

//char gender = 'f';
//boolean isFemale = gender = 'm';
//System.out.println(isFemale);



  }
}

