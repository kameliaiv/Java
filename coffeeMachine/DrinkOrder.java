package coffeeMachine;

public class DrinkOrder {

	private Drink drinktype;
	private double money;
	private Sugar sugar;
	

	@Override
	public String toString() {
		return "DrinkOrder : " + drinktype.getMessage() + ", money=" + money + ", sugar=" + sugar.getSugarMessage() + "]";
	}

	public DrinkOrder(Drink drinktype, Sugar sugar) {
		this.drinktype = drinktype;
		this.money = this.drinktype.getPrice();
		this.sugar = sugar;
	}
	
	public Drink OrderType(){
		return drinktype;
	}
	public String getSugarMsg(){
		return this.sugar.getSugarMessage();
	}
	public double getMoney(){
		return money;
	}
}
