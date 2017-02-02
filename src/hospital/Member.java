package hospital;

public class Member { // getter setter abstract 걸 필요 없음 doctor,
			       // patients, nurses 상속 받는 구조
    protected String name, ssn, phone, email, addr, majorTreat;
    protected int uid;
  
    
    public String CalcGender(){
   	char ch = ssn.charAt(7);
   	String docGen="";
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
    
    public void setUid(int uid) {
	this.uid = uid;
    }

    public int getUid() {
	return uid;
    }
            public void setName(String name) {
        	this.name = name;
            }
        
            public String getName() {
        	return name;
            }
        
            public void setSsn(String ssn) {
        	this.ssn = ssn;
            }
        
            public String getSsn() {
        	return ssn;
            }
        
            public void setPhone(String phone) {
        	this.phone = phone;
            }
        
            public String getPhone() {
        	return phone;
            }
        
            public void setEmail(String email) {
        	this.email = email;
            }
        
            public String getEmail() {
        	return email;
            }
        
            public void setAddr(String addr) {
        	this.addr = addr;
            }
        
            public String getAddr() {
        	return addr;
            }
            public void setMajorTreat(String majorTreat){
        	this.majorTreat=majorTreat;
            }
            public String getMajorTreat(){
        	return majorTreat;
            }

}
