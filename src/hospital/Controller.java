package hospital;

import javax.swing.*;
import java.util.Calendar;
import test.BMI;

public class Controller {

    public void hospital() {
	/*
	 * [의사] 한석규(남) 36세, han@test.com, 010-1234-5678 [간호사] 박신혜(여) 25세,
	 * park@test.com, 010-1234-5678 [환자] 홍길동(남) 15세, hong@test.com,
	 * 010-1234-5678
	 */
	Doctors doctor = null;
	Nurses nurses = null;
	Patients patients = null;
	BMI bmi = new BMI();
	switch (JOptionPane.showInputDialog("당신 역할이 무엇입니까?(의사 :1, 간호사:2, 환자:3)")) {
	case "1":
	    doctor = new Doctors();
	    // bmi.name = s.next();
	    doctor.setDocName(JOptionPane.showInputDialog("이름?"));
	    doctor.setDocGen(JOptionPane.showInputDialog("주민번호(800101-1)?"));
	    doctor.setDocEmail(JOptionPane.showInputDialog("이메일?"));
	    doctor.setDocPhone(JOptionPane.showInputDialog("전화번호?"));
	    JOptionPane.showMessageDialog(null, ("[간호사]" + doctor.getDocName() + "[" + doctor.CalcGender() + "]"
		    + doctor.CalcAge() + doctor.getDocEmail() + doctor.getDocPhone()));
	    break;
	case "2":
	    nurses = new Nurses();
	    nurses.setNurName(JOptionPane.showInputDialog("이름?"));
	    nurses.setNurGen(JOptionPane.showInputDialog("주민번호(800101-1)?"));
	    nurses.setNurEmail(JOptionPane.showInputDialog("이메일?"));
	    nurses.setNurPhone(JOptionPane.showInputDialog("전화번호?"));
	    JOptionPane.showMessageDialog(null, ("[간호사]" + nurses.getNurName() + "[" + nurses.CalcGender() + "]"
		    + nurses.CalcAge() + nurses.getNurEmail() + nurses.getNurPhone()));
	    break;
	case "3":
	    patients = new Patients();
	    patients.setPatName(JOptionPane.showInputDialog("이름?"));
	    patients.setPatGen(JOptionPane.showInputDialog("주민번호(800101-1)?"));
	    patients.setPatEmail(JOptionPane.showInputDialog("이메일?"));
	    patients.setPatPhone(JOptionPane.showInputDialog("전화번호?"));
	    JOptionPane.showMessageDialog(null, ("[간호사]" + patients.getPatName() + "[" + patients.CalcGender() + "]"
		    + patients.CalcAge() + patients.getPatEmail() + patients.getPatPhone()));
	    break;

	}

    }

}
