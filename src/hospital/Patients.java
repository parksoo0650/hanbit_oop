package hospital;

import java.util.Calendar;

import hospital.Member;

public class Patients extends Member{
    private String patJob;
    private int patId;
  
 /*   public void setPatId(int patId) {
	this.patId = patId;
    }

    public int getPatId() {
	return patId;
    }*/
   
  /*  public void setPatName(String patName){
   	this.patName=patName;
       }
       public String getPatName(){
   	return patName;
       }*/
     /*  public int CalcAge(){
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
     	     }    */
     	 
      /* public void setPatGen(String patGen){
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
       }*/
       public void setPatJob(String patJob){
   	this.patJob=patJob;
       }
       public String getPatJob(){
   	 return patJob;
       }
       /*public void setPatAddr(String patAddr){
  	this.patAddr=patAddr;
       }
       public String PatAddr(){
	   return patAddr;
       }*/
       
       public String toString() {
	        return String.format("환자ID: %d\n"
	        			+ "환자성명: %s\n"
	        			+ "환자성별: %s\n"
	        			+ "주민번호(800101-1): %s\n"
	        			+ "주소 : %s\n"
	        			+ "전화번호: %s\n"
	        			+ "이메일: %s\n"
	        			+ "직업: %s\n",
	        			+ super.uid, super.name, super.CalcGender(), super.ssn,super.addr, super.phone, super.email,patJob);
	    }
}
