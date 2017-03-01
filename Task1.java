import java.util.Scanner;

//Write a program that reads the result of a coin toss from the console. 
//The possible inputs are “Heads” or “Tails”. The inputs are infinite. 
//The program must stop reading only if there are 5 consecutive “Heads” coin tosses.
public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String coinToss="";
		int countHeads=0;
		while(true){
			do{
				System.out.println("Enter Heads or Tails: ");
				coinToss=sc.nextLine();
				if(!coinToss.equals("Heads") && !coinToss.equals("Tails")){
					System.out.println("Wrong input!");
					countHeads=0;
					continue;
				}
				if(coinToss.equals("Heads")){
					countHeads++;
					continue;
				} else{
					countHeads=0;
				}
			}while( !coinToss.equals("Heads") && !coinToss.equals("Tails"));
			if(countHeads==5){
				break;
			}
		}
		System.out.println(countHeads + " consecutive “Heads”");
		
	}
}
