public class Staff {
  private long id;

  public Staff(long id){
    this.id = id;
  }
  public long getID(){
    return this.id;
  }

  public boolean equals(Staff staff) {
    if (this.id == staff.getID()){
      return true;
    }
    return false;
  }

// equals() -> String, ihtrger, double


  public static void main(String[] args) {
    Staff s1 = new Staff(1L);
    

if(s1.getID() == 1L){

}

System.out.println(s1.equals(new Staff(1L)));

String str = "hello!";
if (str.equals("hello")){

}

  // after rewriiting the equals method, new staff(1) equals new staff(1)
}
}