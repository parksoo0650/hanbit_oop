package phone;

public class GalexyNote extends Iphone{
    public final static String BRAND="겔럭시노트";
    private String size;
    
    public void setSize(String size){
	this.size=size;
    }
    public String getSize(){
	return size;
    }
    
    @Override
    public String toString() {
	return String.format("%s 때문에  %s 한 상태에서 %s으로  %s 에서 '%s' 을 검색했다.",BRAND,move,size,receiver,data);
	
	//겔럭시노트 때문에 이용가능한 상태에서 대화면으로 네이버에서 날씨를 입력했다.
    }
    
}
