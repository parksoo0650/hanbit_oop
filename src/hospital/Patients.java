package hospital;

import java.util.Calendar;

public class Patients {
    String patName, patGen, ssn, patJumin,patPhone, patEmail, patAddr,patJob;
    int patId;
    
    public void setPatName(String patName){
   	this.patName=patName;
       }
       public String getPatName(){
   	return patName;
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
     	   	patGen = "남자"; 
     	   		break;
     	   	case '2' :case '4' :
     	   	patGen = "여자"; 
     	   		break;
     	   	case '5' : case '6' :
     	   	patGen = "외국인"; 
     	   		break;
     	   	
     	   	}
     	   	return patGen;
     	       }
       public void setPatGen(String patGen){
   	this.patGen=patGen;
       }
       public String getPatGen(){
   	return patGen;
       }
       public void setPatEmail(String patEmail){
   	this.patEmail=patEmail;
       }
       public String getPatEmail(){
   	return patEmail;
       }
       public void setPatPhone(String patPhone){
   	this.patPhone=patPhone;
       }
       public String getPatPhone(){
   	return patPhone;
       }
       public void setPatPostion(String patJob){
   	this.patJob=patJob;
       }
       public String getPatJob(){
   	return patJob;
       }
       public void setPatAddr(String patAddr){
   	this.patAddr=patAddr;
       }
       public String PatAddr(){
	   return patAddr;
       }
}
