package shopping;

public class SmartPhone extends Product {
    
    
    private String giga;
    @Override
    public String getName() {
        return "스마트폰";
    }
    public SmartPhone() {
  	super(300);
      }
    public String getGiga() {
        return giga;
    }
    public void setGiga(String giga) {
        this.giga = giga;
    }

    @Override
    public String toString() {
	return "SmartPhone [name=" + getName()  + " ... " + " price=" + super.getPrice() + "]";
    }
    
}
