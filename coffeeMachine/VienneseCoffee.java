package coffeeMachine;

public class VienneseCoffee extends Drink{

	private static final double VIENNESE_COFFEE_PRICE = 0.7;
	public VienneseCoffee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getMessage() {
		return "Preparing a viennese coffee.";
	}

	@Override
	public double getPrice() {	
		return this.VIENNESE_COFFEE_PRICE;
	}
	

}
