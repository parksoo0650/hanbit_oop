package bank2;

import java.util.Calendar;

import util.RandomGenerator;

public class WageAccount extends Account{
 
    public WageAccount(String uid, String accountType, int money){ //6자리 랜덤숫자
   	accountNo=RandomGenerator.getRandomNum(100000, 999999);
   	createDate=  Calendar.getInstance().get(Calendar.YEAR) + "년 "
   		+ Calendar.getInstance().get(Calendar.MONTH)+1 + "월 "
   		+ Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "일";
   	super.uid=uid;
   	super.accountType = accountType;
   	super.money=0;
       }
    @Override
    public String depost(int money) {
	String result="";
        if(checkMoney(money)){
            this.money+=money; 
            result=Account.DEPOSIT_SUCCESS;
        }else{
            result=Account.DEPOSIT_FAIL;
        }
            return result;
    }
    @Override
    public String withdraw(int money) {
	String result="";
	if(checkMoney(this.money-money)){
	    this.money-=money;
	    result=Account.WITHDRAW_SUCCESS;
	}else{
	    result=Account.WITHDRAW_FAIL;
	}
	 return result;
    }
    @Override
    public boolean checkMoney(int money) {
	return money>=0;
	 
    }
 
}
