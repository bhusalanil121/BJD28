package resturantMenu;
import java.util.*;

public class Drinks {
	static void DrinksMenu() {
		System.out.println("*****************************************************");
		System.out.println("*  Please Select one option from our Drinks Menu    *");
		System.out.println("*                                                   *");
		System.out.println("*               Drinks Menu                         *");
		System.out.println("*             -----------------                     *");
		System.out.println("*              1. Soft Drinks                       *");
		System.out.println("*              2. Hot Drinks                        *");
		System.out.println("*              3. Back                              *");
		System.out.println("*****************************************************");
		System.out.print("Plese enter your option from the Drinks Menu here: ");

		Scanner sc = new Scanner(System.in);
		int drinksMenuChoice = sc.nextInt();

		while (true) {
			switch (drinksMenuChoice) {
			case 1:
				System.out.println();
				System.out.println("-------------------------------------------------------");
				System.out.println();
				SoftDrinks.SoftDrinksMenu();
				break;
			case 2:
				System.out.println();
				System.out.println("-------------------------------------------------------");
				System.out.println();
				HotDrinks.HotDrinksMenu();
				break;
			case 3:
				System.out.println();
				System.out.println("-------------------------------------------------------");
				System.out.println();
				ResturantMenu.mainMenu();
				sc.close();
				break;

			default:
				System.out.println("Please enter the valid option from the menu!!!");
				DrinksMenu();

			}
		}

	}

}
