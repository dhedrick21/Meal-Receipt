import java.util.Scanner;

public class MealReceipt 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Tax and Tip Calculator");
		System.out.print("Press enter to continue...");
		keyboard.nextLine();
		
		System.out.print("\n\n\n + Please enter the name of your apppetizer: ");
		String appName = keyboard.nextLine();
		System.out.print("Please enter the price of your apppetizer: ");
		String appPriceStr = keyboard.nextLine();
		double appPrice = Double.parseDouble(appPriceStr);
		System.out.print("Please enter the name of your entree: ");
		String entreeName = keyboard.nextLine();
		System.out.print("Please enter the price of your entree: ");
		String entreePriceStr = keyboard.nextLine();
		double entreePrice = Double.parseDouble(entreePriceStr);
		System.out.print("Please enter the name of your dessert: ");
		String dessertName = keyboard.nextLine();
		System.out.print("Please enter the price of your dessert: ");
		String dessertPriceStr = keyboard.nextLine();
		double dessertPrice = Double.parseDouble(dessertPriceStr);
		System.out.print("What percentage would you like to tip(as decimal): ");
		String tipStr = keyboard.nextLine();
		double tip = Double.parseDouble(tipStr);
		
		double subtotal = appPrice + entreePrice + dessertPrice;
		double tax = subtotal * 0.6;
		tip = subtotal * tip;
		double total = subtotal + tax + tip;
		
		
		System.out.println("\n\n\nItem			Price");
		System.out.println(appName + "			$" + appPrice);
		System.out.println(entreeName + "			$" + entreePrice);
		System.out.println(dessertName + "			$" + dessertPrice);
		System.out.println("Subtotal 		$" + subtotal);
		System.out.println("Tax			$" + tax);
		System.out.println("Tip			$" + tip);
		System.out.println("Total			$" + total);
		
		
		
		
		
		
		

	}

}
