package coffeeMachine;

public class Sugar extends Ingredients{

	private int sugarQuantity;
	
	public Sugar(int sugarQuantity){
		this.sugarQuantity=sugarQuantity;
	}
	@Override
	public String getSugarMessage() {
		if(sugarQuantity==0){
			return "With no sugar.";
		}
		return "With the wanted quantity sugar added ->" + sugarQuantity+ " . ";
	}

}
