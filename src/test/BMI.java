package test;

import java.util.Scanner;

public class BMI { //instance variables 반드시 initialize 를 하지 않는다.
    	private String uid;
    	private double kg, cm;
    	
    	public void setUid(String uid){
    	    this.uid = uid;
    	}
    	public String getUid(){
    	    return uid;
    	}
    	//setter를 생략하면 , readOnly 파일, 변경불가
    	public String calcBmi(double cm, double kg){
    	    	double bmi=0;
    	    	String result ="";
    	    	bmi = kg / (cm * cm);
        	if (bmi  > 30.0) {
        	result = "고도비만";
        	} else if (bmi   > 25.0) {
        	    result = "비만";
        	} else if (bmi  > 23.0) {
        	    result = "과체중";
        	} else if (bmi  > 18.5) {
        	    result = "정상";
        	} else {
        	    result = "저체중";
        	}
        	return result;
    	}
    	
    	public void setKg(double kg){
    	    this.kg=kg;
    	}
    	public double getKg(){
    	    return kg;
    	}
    	public void setCm(double cm){
    	    this.cm=cm;
    	}
    	public double getCm(){
    	    return cm;
    	}
    
}