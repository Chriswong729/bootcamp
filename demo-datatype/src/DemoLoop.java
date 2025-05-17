public class DemoLoop {
  public static void main(String[] args) {
    // ! for Loop
    // ! for (int i =0; i < X; i++){}
    // for (initializationcontinue; condition; modifier )
    // step 1 i = 0
    // step 2 check if i < 3
    // step 3 if yes print hello
    // step 4 i + 1
    // step 5 check if i < 3
    // step 6 yes, print hello
    // step 7 i + 1
    // step 8 check if i < 3
    // step 9 yes, print hello
    // step 10 i + 1
    // step 11 check if i = 3
    // step 12 No exit loop
    for (int i = 0; i < 3; i++) {
System.out.println("hello");
    }

    // 2^10
int y = 2;
for (int i = 0; i < 9; i++ ){
y = y * 2;
}
System.out.println(y);

// ! for + if
// print even number between 0-10
// even number -> x % 2 = 0

for (int i = 0; i < 11; i++) {
    if (i % 2 == 0 ) {
System.out.println(i);
    }
}

// print the char index of "m", if found print the index, if not found print -1
String s2 = "bootcamp";
int index = -1;
for (int i = 0; i < s2.length() ; i++) {
  if (s2.charAt(i) == 'm') {
    index = i; 
  }
}
System.out.println(index);

// ! break + loop
// Find the first character of 'a' in a given String
String str = "charactor"; 
for (int i = 0; i < str.length(); i++){
  if (str.charAt(i) == 'a'){
    System.out.println(i);
    break;
  }
}

// find the first 3 charactor of "a" in given string
String ss = "adcdeadcdeadcdeadcdeadcdeadcde"; 
int counter = 0;
for (int i = 0; i < ss.length(); i++){
  if (ss.charAt(i) == 'a'){
    if (counter >= 3){
      break;
    }
    System.out.println(i);
    counter++; 
  }
}

// ! continue + loop
// print all index of charactor 'a' in given string
String ss2 = "abcabcabc";

// 1
for (int i = 0; i < ss2.length(); i++){
  if (ss2.charAt(i) == 'a'){
    System.out.println(i);
  }
}

// 2
for (int i = 0; i < ss2.length(); i++){
if (ss2.charAt(i) != 'a'){
  continue; // skip the rest of code lins, and then goes to next iteration
}
System.out.println(i);
}













  }
}
