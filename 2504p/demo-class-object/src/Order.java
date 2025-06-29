public class Order {
// Alternative
  private Item[] items;

  public Order(Item item) {
    this.items = new Item[1];
    this.items[0] = item;
  }

  // public Order (Item item){
  //this.items = new Item[1];
  //
  //}
  
// !
    public void add(Item newItem){
  Item[] newItems = new Item[this.items.length + 1];
  for (int i = 0; i < this.items.length; i++){
  newItems [i] = items[i];
  }
  newItems[newItems.length - 1] = newItem;
  this.items = newItems; 
    }
    
    // !
    public double checkOutAmount() {
    double total = 0.0;
    for (int i = 0; i < this.items.length; i++){
      total += this.items[i].subtotal();
    }
    return total; 
    }
  public static void main(String[] args) {
    Order order = new Order(); 
    Item itemA = new Item(99 , 2);
    order.add(itemA);

    Item itemB = new Item(14 , 3);
    order.add(itemB);

System.out.println(order.checkOutAmount());


  }
}
