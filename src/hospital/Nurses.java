package hospital;

import java.util.Calendar;

public class Nurses extends Member{
    private String nurPosition,majorJob;
    private int nurId;
    /*public void setNurId(int nurId) {
	this.nurId = nurId;
    }

    public int getNurId() {
	return nurId;
    }
*/
   
  /*  public void setNurName(String nurName){
   	this.nurName=nurName;
       }
       public String getNurName(){
   	return nurName;
       }*/
    /*	public int CalcAge(){
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
	     }  */
	
  /*     public void setNurGen(String nurGen){
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
       }*/
       public void setNurPostion(String nurPostion){
   	this.nurPosition=nurPostion;
       }
       public String getNurPosition(){
   	return nurPosition;
       }
       public void setMajorJob(String majorJob){
   	this.majorJob=majorJob;
       }
       public String getMajorTrJob(){
	   return majorJob;
       }
       
       public String toString() {
	        return String.format("간호사ID: %s\n"
	        			+ "담당진료과목: %s\n"
	        			+ "성명: %s\n"
	        			+ "성별: %s\n"
	        			+ "전화번호 : %s\n"
	        			+ "이메일: %n"
	        			+ "직급: %s\n",
	        			+ super.uid, majorJob, super.name,super.CalcGender(), super.phone, super.email, nurPosition);
	    }
}
