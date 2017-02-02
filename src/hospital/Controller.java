package hospital;

import javax.swing.*;

import hospital.Doctors;
import hospital.Nurses;

import java.util.Calendar;

public class Controller {
    public final static String EXE_OPTION = "0. EXIT\n" + "1.REG-DOCTOR\n" + "2.REG-NURSE\n" + "3.REG-PATIENT\n"
	    + "4.CHECK BMI";
    public final static String DOC_SPEC = "INPUT AS 의사ID,담당진료과목,성명,SSN,전화번호,이메일,직급";
    public final static String NUR_SPEC = "INPUT AS 간호사ID,담당진료과목,성명,SSN,전화번호,이메일,직급";
    public final static String PAT_SPEC = "INPUT AS 환자ID,성명,SSN,전화번호,이메일,주소,직업";

    public void hospital() {
	/*
	 * [의사] 한석규(남) 36세, han@test.com, 010-1234-5678 [간호사] 박신혜(여) 25세,
	 * park@test.com, 010-1234-5678 [환자] 홍길동(남) 15세, hong@test.com,
	 * 010-1234-5678
	 */
	while (true) {
	    switch (JOptionPane.showInputDialog(EXE_OPTION)) {
	    case "0" : return;
	    case "1": 
		Doctors doctor = new Doctors();
		String docInfo = JOptionPane.showInputDialog(DOC_SPEC);
		String[] docInfoArr = docInfo.split(",");
		// bmi.name = s.next();
		doctor.setUid(Integer.parseInt(docInfoArr[0]));
		doctor.setMajorTreat(docInfoArr[1]);
		doctor.setName(docInfoArr[2]);
		doctor.setSsn(docInfoArr[3]);
		doctor.setPhone(docInfoArr[4]);
		doctor.setEmail(docInfoArr[5]);
		doctor.setDocPostion(docInfoArr[6]);
		JOptionPane.showMessageDialog(null, doctor.toString());
		break;
	    case "2":
		Nurses nurses = new Nurses();
		String nurInfo = JOptionPane.showInputDialog(NUR_SPEC);
		String[] nurInfoArr = nurInfo.split(",");
		// bmi.name = s.next();
		nurses.setUid(Integer.parseInt(nurInfoArr[0]));
		nurses.setMajorJob(nurInfoArr[1]);
		nurses.setName(nurInfoArr[2]);
		nurses.setSsn(nurInfoArr[3]);
		nurses.setPhone(nurInfoArr[4]);
		nurses.setEmail(nurInfoArr[5]);
		nurses.setNurPostion(nurInfoArr[6]);
		JOptionPane.showMessageDialog(null, nurses.toString());
		/*
		 * Nurses nurses = new Nurses();
		 * nurses.setNurName(JOptionPane.showInputDialog("이름?"));
		 * nurses.setNurGen(JOptionPane.showInputDialog(
		 * "주민번호(800101-1)?"));
		 * nurses.setNurEmail(JOptionPane.showInputDialog("이메일?"));
		 * nurses.setNurPhone(JOptionPane.showInputDialog("전화번호?"));
		 * JOptionPane.showMessageDialog(null, ("[간호사]" +
		 * nurses.getNurName() + "[" + nurses.CalcGender() + "]" +
		 * nurses.CalcAge() + nurses.getNurEmail() +
		 * nurses.getNurPhone()));
		 */
		break;
	    case "3":
		Patients patients = new Patients();
		String patInfo = JOptionPane.showInputDialog(PAT_SPEC);
		String[] patInfoArr = patInfo.split(",");
		// bmi.name = s.next();
		patients.setUid(Integer.parseInt(patInfoArr[0]));
		patients.setPatJob(patInfoArr[1]);
		patients.setName(patInfoArr[2]);
		patients.setSsn(patInfoArr[3]);
		patients.setAddr(patInfoArr[4]);
		patients.setPhone(patInfoArr[5]);
		patients.setEmail(patInfoArr[6]);
		JOptionPane.showMessageDialog(null, patients.toString());
		/*
		 * Patients patients = new Patients();
		 * patients.setPatName(JOptionPane.showInputDialog("이름?"));
		 * patients.setPatGen(JOptionPane.showInputDialog(
		 * "주민번호(800101-1)?"));
		 * patients.setPatEmail(JOptionPane.showInputDialog("이메일?"));
		 * patients.setPatPhone(JOptionPane.showInputDialog("전화번호?"));
		 * JOptionPane.showMessageDialog(null, ("[간호사]" +
		 * patients.getPatName() + "[" + patients.CalcGender() + "]" +
		 * patients.CalcAge() + patients.getPatEmail() +
		 * patients.getPatPhone()));
		 */
		break;
	    case "4":
		 BMI treat = new BMI(); 
		 while (true) { // 한석규(남) 과체중 //
		 double cm = Integer.parseInt(JOptionPane.showInputDialog("키?")); 
		 double kg = Integer.parseInt(JOptionPane.showInputDialog("몸무게?"));
		 String bmi1 = treat.calcBmi(cm/100, kg);
		 JOptionPane.showMessageDialog(null, bmi1);
		break;
	    }
	}
    }
    }
}
