package phone;

public class Nokia extends Phone {
    public final static String BRAND="NOKIA";
    protected String move;
    protected boolean portable; //이동성
    
    protected void setMove(String move) {
	this.move=move;
    }
    public String getMove(){
	return move;
    }
    public void isPortable(boolean portable){
	if(portable){
	    setMove("이동 가능");
	}else{
	    setMove("이동 불가능");
	}
	this.portable=portable;
    }
    public boolean isPortable(){
	return portable;
    }
    @Override
    public String toString() {
        return String.format("%s 때문에  %s 한 상태에서  %s 에게 '%s' 이라고 말했다.",BRAND,move,super.receiver,super.call);
    }
}
