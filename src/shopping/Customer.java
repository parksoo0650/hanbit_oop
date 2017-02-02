package shopping;

public class Customer {
    Product[] cart;
    private int money;
  
     public Customer() {
	money=1000;
	cart = new Product[3];
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

 
     
}
