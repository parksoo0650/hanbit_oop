package hospital;

import java.util.Calendar;

public class Doctors extends Member {
    private String docPosition, majorTreat;
    private int docId;
   /* public void setDocId(int docId) {
	this.docId = docId;
    }

    public int getDocId() {
	return docId;
    }*/

  
    /*
    public void setName(String docName){
	super.name=docName;
    }
    public String getDocName(){
	return name;
    }*/
    /*public int CalcAge(){
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
 
   /* public void setSsn(String docGen){
   	super.ssn=docGen;
    }
    public String getSsn(){
	return ssn;
    }
    public void setDocEmail(String docEmail){
	super.email=docEmail;
    }
    public String getDocEmail(){
	return email;
    }
    public void setDocPhone(String docPhone){
	super.phone=docPhone;
    }
    public String getDocPhone(){
	return phone;
    }*/
    public void setDocPostion(String docPostion){
	this.docPosition=docPostion;
    }
    public String getDocPosition(){
	return docPosition;
    }

    
   @Override
    public String toString() {
        return String.format("의사ID: %s\n"
        			+ "담당진료과목: %s\n"
        			+ "성명: %s\n"
        			+ "성별: %s\n"
        			+ "전화번호 : %s\n"
        			+ "이메일: %s\n"
        			+ "직급: %s\n",
        			+ super.uid, majorTreat, super.name,super.CalcGender(), super.phone, super.email, docPosition);
    }
}
