package bank;

import java.util.Calendar;
import util.RandomGenerator;


public class Account{
    public final static String BANK_NAME="한빛은행";
    private int money, accountNo;
    private String uid,accountType,createDate;
    public Account(String uid, String accountType, int money){ //6자리 랜덤숫자
	this.accountNo=RandomGenerator.getRandomNum(100000, 999999);
	this.createDate=  Calendar.getInstance().get(Calendar.YEAR) + "년 "
		+ Calendar.getInstance().get(Calendar.MONTH)+1 + "월 "
		+ Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "일";
	this.uid=uid;
	this.accountType = accountType;
	this.money=0;
    }
    public void setMoney(int money){
   	this.money+=money;
    }
    public int getMoney(){
	return money;
    }
    public String getUid(){
	return uid;
    }
    public String getAccountType(){
  	return accountType;
      }
    public int getAccountNo(){
	return accountNo;
    }
    public String getCreateDate(){
 	return createDate;
    }
    public void depost(int money){
	if(this.money>money){
	    
	}
    }
    public void withDraw(int money){
	if(this.money<=money){
	    
	}
    }
    public void balance(){
	
    }
}
