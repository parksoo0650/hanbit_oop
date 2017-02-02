package test;

import javax.swing.*;

import hospital.BMI;

public class Controller {
    
    public void test() {
	String ssn = "", gender = "", tempUid = "";
	int i = 0;
	Member member = null;
	while (true) {
	    switch (JOptionPane.showInputDialog("어떤 작업을 하시겠습니까?(1.회원등록 2.BMI 3.성별  4.성적표 0.종료)")) {
	    case "0":
		return;
	    case "1":
		member = new Member();
		// Input ID
		while (true) {
		    // Input SSn
		    // for(i=0; i<3;i++){//validation 유효성 체크 assn[i] = new
		    // Member();
		    ssn = JOptionPane.showInputDialog("주민번호?");
		    char ch = ssn.charAt(7);
		    if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			JOptionPane.showMessageDialog(null, "다시 입력하세요");
		    } else {
			break;
		    }
		}
		member.setSsn(ssn);
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setName(JOptionPane.showInputDialog("이름"));
		gender = member.calcGender(ssn);// calcGender를 standalone method
		JOptionPane.showMessageDialog(null, member.getName() + "(" + gender + ")");

		break;
	    case "2":
		
	    case "3":
		break;
	    case "4":
		ReportCard card = new ReportCard();
		int total = 0;
		for (i = 0; i < 6; i++) {
		    total += Integer.parseInt(JOptionPane.showInputDialog("Score : "));
		}
		card.setTotal(total);
		card.setAverage(total / 6);
		JOptionPane.showMessageDialog(null, "Name : " + member.getName() + "\n" + "Total   : " + card.getTotal()
			+ "\n" + "Average : " + card.getAverage() + "\n" + "grade   : " + card.getGrade());
		// int score,total,average;String name, grade;
		break;
	    case "5":
		break;

	    }

	}

    }
}
