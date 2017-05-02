package coffeeMachine;

public class CoffeeMaker {
public static void main(String[] args) {
	DrinkOrder coffeeAmerican = new DrinkOrder(new AmericanCoffee(),  new Sugar(2));
	System.out.println(coffeeAmerican);	
	System.out.println(coffeeAmerican.getSugarMsg());		
}
	
	public static String makeCoffee(DrinkOrder myOrder){
		boolean isValid=validateDrinkPrice(myOrder.OrderType().getPrice(), myOrder.getMoney());
		if(isValid){
			return myOrder.OrderType().getMessage() + myOrder.getSugarMsg();
		}
		return "Insufficient money = " + ( myOrder.OrderType().getPrice() - myOrder.getMoney()) ;
	}
	public static boolean validateDrinkPrice(double drinkPrice, double money){
		if(money==drinkPrice){
			return true;
		}
		return false;
	}
	public static String printMessage(String testString){
		return testString;
		
	}
}
