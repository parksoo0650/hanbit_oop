package test;

import java.util.Scanner;

public class Member {
    String ssn, name, userid;
    
    public void setUid(String userid){
 	this.userid=userid;
     }
     public String getUid(){
 	return userid;
     }
    public void setName(String name){
	this.name=name;
    }
    public String getName(){
	return name;
    }
    public void setSsn(String ssn){
	this.ssn=ssn;
    }
    public String getSsn(){
	return ssn;
    }
    public String calcGender(String ssn){
	char ch = ssn.charAt(7);
	String gender="";
	switch(ch){
	case '1' : case '3' :
		gender = "남자"; 
		break;
	case '2' :case '4' :
		gender = "여자"; 
		break;
	case '5' : case '6' :
		gender = "외국인"; 
		break;
	default :
	}
	return gender;
    }
 

}
