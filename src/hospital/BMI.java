package hospital;

import java.util.Scanner;

public class BMI extends Treatment { //instance variables 반드시 initialize 를 하지 않는다.
     double cm, kg;
     String result;
    
    public void setCm(double cm) {
	this.cm=cm;
    }
    public double getCm(){
	return cm;
    }
    public void setKg(double kg) {
	this.kg=kg;
    }
    public double getKg(){
	return kg;
    }
    public String calcBmi(double cm, double kg) {
   	double bmi = 0;
   	String result = "";
   	bmi = kg / (cm * cm);
   	if (bmi > 30.0) {
   	    result = "고도비만";
   	} else if (bmi > 25.0) {
   	    result = "비만";
   	} else if (bmi > 23.0) {
   	    result = "과체중";
   	} else if (bmi > 18.5) {
   	    result = "정상";
   	} else {
   	    result = "저체중";
   	}
   	return result;
       }

    @Override
    public String treat() {
	return String.format("%s", result);
    }
}