
// Attributes
public class Account{
  private String userID;
  private double balance;

  // Constuctor 
  // public Account(){// (empty constructor)(no parameter)
    // empty constructor implictly exists

  // all arguments constructor (all parameter)
  public Account (){
  this.balance = 10.0;
  }

public Account(String userID, double balance){
  this.userId = userId;
  this.balance = balance;

}
// Technically ok 
// public Account(String userId){
// this.userId = userid
//}

public String getUserId(){
  return this.userId;
}

public void setUserId(){
  this.userId = userId;
}

public void setBalance(double balance){
  this.balance = balance; 
}


// method (getter/setter)
// public int sum (int x, int y)
// 1. public / private
// 2. return type: eg int
// 3. method name: sum 
// 4. entry point: (int x, int y)
// -> return this getter 
public double getBalance(){
  return this.balance;
}

  public static void main(String[] args) {
    
  
    // Object reference eg: a1 a2
    // "new" create an object of account
    // "." means goes to 


Account[] accounts = new Account[3]; // create account array object
Account a1 = new Account();
Account a2 = new Account();
a2.setBalance(800.0);
Account a3 = new Account();
accounts[0] = a1;
accounts[1] = a2;
accounts[2] = a3;
System.out.println(accounts[1].getBalance());

String[] names = new String[3];
String s1 = "john";
String s2 = "Peter";
String s3 = "sally";
names[0]= s1;
names[1] = s2;
names[2] = s3;


 System.out.println(names[0].length()); // 4
    // System.out.println(names[1].length()); // error







  }
}
