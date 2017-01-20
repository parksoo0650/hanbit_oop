package hospital;

import java.util.Calendar;

public class Nurses {
    String nurName, ssn,nurGen, nurPhone, nurEmail, nurPosition,majorJob;
    int nurId;
    
    public void setNurName(String nurName){
   	this.nurName=nurName;
       }
       public String getNurName(){
   	return nurName;
       }
       public int CalcAge(){
		Calendar cal = Calendar.getInstance();
		int year = (Integer.parseInt(ssn.substring(0,2)));
		int result = 0;
		int age = 0;
		   result = cal.get(Calendar.YEAR)-year ;
		if(result>=2000){
		    age = (result - 2000) + 1;
		}else{
		    age = (result - 1900) + 1;  
		}
	 	return age;
	     }    
	    public String CalcGender(){
	   	char ch = ssn.charAt(7);
	   	switch(ch){
	   	case '1' : case '3' :
	   	 nurGen = "남자"; 
	   		break;
	   	case '2' :case '4' :
	   	 nurGen = "여자"; 
	   		break;
	   	case '5' : case '6' :
	   	 nurGen = "외국인"; 
	   		break;
	   	
	   	}
	   	return nurGen;
	       }
       public void setNurGen(String nurGen){
   	this.nurGen=nurGen;
       }
       public String getNurGen(){
   	return nurGen;
       }
       public void setNurEmail(String nurEmail){
   	this.nurEmail=nurEmail;
       }
       public String getNurEmail(){
   	return nurEmail;
       }
       public void setNurPhone(String nurPhone){
   	this.nurPhone=nurPhone;
       }
       public String getNurPhone(){
   	return nurPhone;
       }
       public void setNurPostion(String nurPostion){
   	this.nurPosition=nurPostion;
       }
       public String getNurPosition(){
   	return nurPosition;
       }
       public void setMajorTreat(String majorJob){
   	this.majorJob=majorJob;
       }
       public String getMajorTreat(){
	   return majorJob;
       }
}
