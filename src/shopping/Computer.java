package shopping;

public class Computer extends Product{
  
    private String ram;
    
    public Computer() {
	super(300);
    }

    public String getRam() {
        return ram;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "컴퓨터";
    }
    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
	return "[name=" + getName() + " ... " + "price=" + super.getPrice() + "]";
    }
    
}
