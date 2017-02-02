package phone;

import javax.swing.*;

public class Controller {

    public void start() {
	while(true){
	switch(JOptionPane.showInputDialog("기능선택: 0.종료 1.삼성전화기 2.노키아 3.아이폰 4.겔럭시")){
	case "0":return;
	case "1":
	    Phone phone = new Phone();
	    phone.setReceiver(JOptionPane.showInputDialog("누구세요?"));
	    phone.setCall(JOptionPane.showInputDialog("메시지?"));
	    JOptionPane.showMessageDialog(null, phone.toString());
	break;
	case "2":
	    Nokia nokia = new Nokia();
	    nokia.isPortable(true);
	    nokia.setReceiver(JOptionPane.showInputDialog("누구세요?"));
	    nokia.setCall(JOptionPane.showInputDialog("메시지?"));
	    JOptionPane.showMessageDialog(null, nokia.toString());
	break;
	case "3":
	    Iphone iphone = new Iphone();
	    iphone.isPortable(true);
	    iphone.setReceiver(JOptionPane.showInputDialog("어디서?"));
	    iphone.setData(JOptionPane.showInputDialog("검색?"));
	    JOptionPane.showMessageDialog(null, iphone.toString());
	break;
	case "4":
	    GalexyNote galexyNote = new GalexyNote();
	    galexyNote.isPortable(true);
	    galexyNote.setSize(JOptionPane.showInputDialog("크기?"));
	    galexyNote.setReceiver(JOptionPane.showInputDialog("어디서?"));
	    galexyNote.setData(JOptionPane.showInputDialog("검색?"));
	    JOptionPane.showMessageDialog(null, galexyNote.toString());
	break;
	}
	}
	
    }

}
