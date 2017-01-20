package hospital;

import java.util.Calendar;

public class Doctors {
    String docName, ssn, docGen, docEmail, docPhone, docPosition, majorTreat;
    int docId;
    
    public void setDocName(String docName){
	this.docName=docName;
    }
    public String getDocName(){
	return docName;
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
   	    docGen = "남자"; 
   		break;
   	case '2' :case '4' :
   	    docGen = "여자"; 
   		break;
   	case '5' : case '6' :
   	    docGen = "외국인"; 
   		break;
   	}
   	return docGen;
       }
    public void setDocGen(String docGen){
   	this.docGen=docGen;
    }
    public String getDocGen(){
	return docGen;
    }
    public void setDocEmail(String docEmail){
	this.docEmail=docEmail;
    }
    public String getDocEmail(){
	return docEmail;
    }
    public void setDocPhone(String docPhone){
	this.docPhone=docPhone;
    }
    public String getDocPhone(){
	return docPhone;
    }
    public void setDocPostion(String docPostion){
	this.docPosition=docPostion;
    }
    public String getDocPosition(){
	return docPosition;
    }
    public void setMajorTreat(String majorTreat){
	this.majorTreat=majorTreat;
    }
    public String getMajorTreat(){
	return majorTreat;
    }
    
   
    
    
}
