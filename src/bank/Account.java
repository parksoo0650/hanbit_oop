package bank;

import java.util.Calendar;
import util.RandomGenerator;

public abstract class Account{
    public final static String BANK_NAME="한빛은행";
    public final static String WITHDRAW_SUCCESS="출금성공";
    public final static String ACCOUNT_TPYE="통장 베어스";
    public final static String WITHDRAW_FAIL="잔액부족";
    public final static String DEPOSIT_SUCCESS="입금성공";
    public final static String DEPOSIT_FAIL="입금실패";
    protected int money, accountNo;
    protected String uid;
    protected String accountType;
    protected String createDate;
    public Account(){}
    protected Account(String uid, String accountType, int money){ //6자리 랜덤숫자
	this.accountNo=RandomGenerator.getRandomNum(100000, 999999);
	this.createDate=  Calendar.getInstance().get(Calendar.YEAR) + "년 "
		+ Calendar.getInstance().get(Calendar.MONTH)+1 + "월 "
		+ Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "일";
	this.uid=uid;
	this.accountType = ACCOUNT_TPYE;
	this.money=0;
    }
    /*public void setMoney(int money){
   	this.money+=money;
    }*/
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
 /*   public void depost(int money){ //입금
	this.money+=money;
    }
    public int withDraw(int money){ //출금
	return (this.money<money)?this.money:this.money-money;
    }*/
    public abstract boolean checkMoney(int money);
    public abstract String depost(int money);
    public abstract String withdraw(int money);
   
    
}
