package shopping;


public class CustomerServiceImpl implements CustomerService { //연관관계를 잡는다. 
    Customer customer; //association관계,customer,
    Product[] cart;
    int i;
    public CustomerServiceImpl() {
	// TODO Auto-generated constructor stub
	customer = new Customer();
	cart=new Product[4];
	i=0;
    }
 
 /**
  * 물건을 구입시 현재 금액과 차이를 보고
  * 구매가능한지를 따진다.
  * 만약 가진 돈이 작으면 잔액이 부족합니다.
  */

    @Override
    public String buy(Product p) {
	
	String result="잔액부족";
	if(customer.getMoney() > p.getPrice()){
	    customer.setMoney(customer.getMoney()-p.getPrice());
	    add(p);
	    result="카트에 추가됨";
	}
	return result;
    }
    
    /**
    *카트에 추가시키는 로직
    * */
    
    @Override
    public void add(Product p) {
	// 
	cart[i] = p;
	i++;    
    }

    
/**
*  쇼핑을 마치고 영수증을 출력한다.
* TV ... 300]
* 지금 상황에선 3개만 구입한 내용이 나온다
* */
 @Override
    public String getBill() {

      	String bill = ""; 
      	for(int k=0; k<i;k++){
      	    bill+=cart[k].toString()+"\n";
      	}
	    return bill;
    }
  

}
