public class Laptop extends Machine {
  // ! concreate class has to implement abstract methods
  private int ram; 

  public Laptop(int ram){
    // super(); // ! implicitly calling parent class constrructor
    this.ram = ram; 
    }
    
    public int getRam(){
      return this.ram;
    }

@Override
public void start(){
  System.out.println("Laptop is starting...");
  super.turnOn();
}

@Override
public void stop(){
  System.out.println("laptop is stoping");
  super.turnOff();
}

@Override
public String getStatus() {
  String status = super.isOn() ? "ON": "OFF";
  return "Laptop status:" + status;
}
  }

