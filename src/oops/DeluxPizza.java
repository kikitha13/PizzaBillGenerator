package oops;

public class DeluxPizza extends Pizza{

	public DeluxPizza(Boolean veg) {
		super(veg);
		// TODO Auto-generated constructor stub
		super.addextracheese();
		super.addextratoppins();
	}
	@Override
	public void addextracheese() {
		super.addextracheese();
	}
	@Override
	public void addextratoppins() {
		super.addextratoppins();
	}
	

}
