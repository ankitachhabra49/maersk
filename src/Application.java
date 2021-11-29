import java.util.Scanner;
/**
 * This is main application class
 * @author ankita.chhabra
 *
 */
public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter units of A");
		int unitsA=sc.nextInt();
		System.out.println("Enter units of B");
		int unitsB=sc.nextInt();
		System.out.println("Enter units of C");
		int unitsC=sc.nextInt();
		System.out.println("Enter units of D");
		int unitsD=sc.nextInt();
		Calculation calculation= new Calculation();
		int amount = calculation.calculateAmount(unitsA, unitsB, unitsC, unitsD);
		System.out.println(amount);
	}
}
