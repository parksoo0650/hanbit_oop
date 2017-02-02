package bank2;

import java.util.Scanner;
import test.Member;
import javax.swing.*;
public class Controller {
    public void start(){
	Member mem=null;
	Account account=null;
	
	String ssn="";
	while(true){
	  /*  int opt=Integer.parseInt(option);
	    String opt2 = String.valueOf(opt);*/
	    switch(JOptionPane.showInputDialog("0.종료 1.회원등록 2.통장개설 3.입금 4.출금 5.조회 6.해지")){
	    case "0": return;
	    case "1": 
		mem=new Member();
		while(true){	
		ssn=JOptionPane.showInputDialog("주민번호?");
		char ch = ssn.charAt(7);
		if(ch == '0' || ch == '7' || ch == '8' || ch == '9'){
		    JOptionPane.showMessageDialog(null, "다시 입력하세요");
		   }else{
		       break;
		   }
		}
		  mem.setSsn(ssn);
		  mem.setUid(JOptionPane.showInputDialog("아이디"));
		  mem.setName(JOptionPane.showInputDialog("이름"));
		  JOptionPane.showMessageDialog(null,mem.getName()+"님 회원등록 되었습니다.");
	    	    break;
	    	    case "2":
	    		String uid="";
	    		int money=0;
	    		String accountType="저축예금";
	    		account = new WageAccount(uid,accountType, money);
	    		StringBuffer sb = new StringBuffer();
	    		sb.append("["+Account.BANK_NAME+"]\n");
	    		sb.append("계좌번호 :" + account.getAccountNo() + "\n");
	    		sb.append("예금분류 : " + account.getAccountType() +"\t"+ mem.getName() + "님" + "\n");
	    		sb.append("가입일 : " + account.getCreateDate() + "\n");
	    		sb.append("잔액 : " + account.getMoney());
	    		JOptionPane.showMessageDialog(null, sb);
	    		/*[한빛뱅크] 
	    		 * 계죄번호:123456 
	    		 * 저축예금 송상훈님 
	    		 * 가입일:2016년12월14일
	    		 * 잔액:￦0
	    		 */
	    		break;
		    case "3": 
			    JOptionPane.showMessageDialog(null,account.depost
				    (Integer.parseInt(JOptionPane.showInputDialog("입금할 금액을 입력하여 주세요."))));
			break;
		    case "4": 
			   JOptionPane.showMessageDialog(null,account.withdraw
				   (Integer.parseInt(JOptionPane.showInputDialog("출금할 금액을 입력하여 주세요."))));
			break;
		    case "5": break;
		    case "6": break;
	    
	    }
    }
    }
   
}
