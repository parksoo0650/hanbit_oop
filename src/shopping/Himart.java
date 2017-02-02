package shopping;

import javax.swing.JOptionPane;

public class Himart {
    public static void main(String[] args) {
	CustomerService service = new CustomerServiceImpl(); //다형성, 이 기능으로는 구조를 잡지 않는다
	Customer c  = new Customer();
	while(true){
	    switch(JOptionPane.showInputDialog("뭘 살까? 0.종료 1.TV 2.폰 3.청소기 4.PC")){
	    case "0": 
		JOptionPane.showMessageDialog(null, service.getBill() + "\n");
		return;
	    case "1": 
		Product tv  = new TV();		
		JOptionPane.showMessageDialog(null, service.buy(tv) + "\n");
		System.out.println("잔액은 = " + c.getMoney());
		
		break;
	    case "2": 
		Product phone  = new SmartPhone();
		JOptionPane.showMessageDialog(null, service.buy(phone) + "\n");
		
		break;
	    case "3": 
		Product cleaner  = new Cleaner();
		JOptionPane.showMessageDialog(null,service.buy(cleaner) + "\n");
		
		break;
	    case "4": 
		Product computer  = new Computer();
		JOptionPane.showMessageDialog(null, service.buy(computer));
		break;
		}
	    
	}
	
	
    }
}
