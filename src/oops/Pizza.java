package oops;

public class Pizza {
	private int price;
	private Boolean veg;
	private int extracheese=100;
	private int extratoppins=70;
	private int bag=25;
	private int basepizzaprice;
	private Boolean isextracheese=false;
	private Boolean isextratoopins=false;
	private Boolean isbag=false;
	
	public Pizza(Boolean veg) {
		this.veg=veg;
		if(this.veg) {
			this.price=300;
			
		}
		else {
			this.price=400;
		}
		basepizzaprice=this.price;
	}
	public void addextracheese() {
		isextracheese=true;
		//System.out.println("Extra cheese added");
		this.price+=extracheese;
	}
	public void addextratoppins() {
		isextratoopins=true;
		//System.out.println("Extra Toppings added");
		this.price+=extratoppins;
	}
	public void takeaway() {
		isbag=true;
		//System.out.println("Take Away opted");
		this.price+=bag;
	}
	public void getpizzaBill()
	{
		String Bill=" ";
		
		System.out.println("Pizza: " + basepizzaprice);
		if(isextracheese) {
			Bill+="Extra cheese added: " +extracheese+"\n";
		}
		if(isextratoopins) {
			Bill+="Extra Toppings added: "+extratoppins+"\n";
		}
		if(isbag) {
			Bill+="Take Away: "+bag+"\n";
		}
		Bill+="Bill "+this.price+"\n";
		System.out.println(Bill);
	}

}
