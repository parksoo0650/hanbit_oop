package phone;

public class Phone{
    public final static String KIND = "삼성전화기";
    protected String receiver, call;
    
    public void setReceiver(String receiver){
	this.receiver=receiver;
    }
    public String getReceiver(){
	return receiver;
    }
    public void setCall(String call){
	this.call=call;
    }
    public String getCall(){
	return call;
    }
    @Override
    public String toString() {
	return KIND+"사용해서 "+ receiver +"에게 " + call + "이라고 말했다.";
    }
}
