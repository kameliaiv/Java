package coffeeMachine;

public class AmericanCoffee extends Drink {
	
	private static final double AMERICAN_COFFEE_PRICE=0.6;
	public AmericanCoffee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		return "Preparing an american coffee.";
	}

	@Override
	public double getPrice() {
		return this.AMERICAN_COFFEE_PRICE;
	}
	
	
}
