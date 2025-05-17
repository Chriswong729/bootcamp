public class DemoIf {
  public static void main(String[] args) {
      int x = 3;
      if (x < 4) {
        System.out.println("hello");
      }

      // if + else
 if (x <10) {
System.out.println("goodbye");
} else {
  System.out.println("welcome");
}
// Rules
// step 1 try "if" condition, if it is ture, execute the action, and then exit
// step 2 if step 1 result is false, then "else if" concdition, if it is true
// step 3 


//if + else if + else
int y = 99;

if (y < 90) {
  System.out.println("y is smaller than 90.");
} else if (y >= 90 && y < 100){
  System.out.println("y is 90 < y 99");
} else {
  System.out.println("y is >= 100");
}

// double w 
// if w < 100, print abc
// if W between 103 and 110, print def
// else, print XYZ

double w = 103;
if (w < 100) {
  System.out.println("ABC");
} else if (w >= 103 && w < 110) {
System.out.println("DEF");
} else {
  System.out.println("XYZ");
}

// AND &&
// OR ||

int a = 1;
int b = 20;
if (a > 3 || b < 15) {
  System.out.println("a > 3 or b < 15");
} else {
  System.out.println("Error");
}

int q = 4;
int u = 80;
if (q > 2){
   u = u + 2;
} else if(q < 5){
   u = u + 10;
}
System.out.println(u);

q = 10;
u = 100;
if (q > 5 && u < 90) {
System.out.println("hello");
} else if (q <= 5) {
System.out.println("bye");
} else {
  System.out.println("bootcamp");
}

// string
String s1 = "hello";
System.out.println(s1.length());
if (s1.length()> 3){
  System.out.println("java");
} else{
  System.out.println("python");
}

// equals() + if

String s2 = "Javascript";
int score = 0;
if (s2.equals("Java")){
  score += 1;
} else {
  score += 2;
}
System.out.println(score);


String s3 = "chain";
// first character is "c"
// or the last character is "d"
if (s3.charAt(0) == 'c'|| s3.charAt(s3.length()-1) == 'd'){
  System.out.println("Yes");
} else {
  System.out.println("No");
}

// switch
char grade = 'B';
if (grade == 'A'){
  System.out.println("Grade is A");
} else if (grade == 'B'){
  System.out.println("Grade is B");
} else if (grade == 'C'){
  System.out.println("Grade is C");
} else {
  System.out.println("Fail");
}
// Alternative
// ! You should use "break" for all cases in switch statement
// ! Switch CANNOT check the range of the value
switch (grade){
  case 'A':
  System.out.println("Grade is A");
  break;
case 'B':
System.out.println("Grade is B");
break;
case 'C':
System.out.println("Grade is C");
break; 
default:
System.out.println("Fail");
}

score = 85;
if (score >= 90){
  System.out.println('A');
} else if (score >= 80 && score < 90){
  System.out.println('B');
} else if (score >= 70 && score < 80){
  System.out.println('C');
} else{
  System.out.println('F');
  
}















  }
}
