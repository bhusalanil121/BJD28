package resturantMenu;
import java.util.*;

public class HotDrinks {
	static int totalhotdrinksPrice;

	static int Cappuccino(int quantity) {
		return quantity * 7;
	}

	static int Latte(int quantity) {
		return quantity * 7;
	}

	static int Tea(int quantity) {
		return quantity * 5;
	}

	static int Coffe(int quantity) {
		return quantity * 5;
	}

	static void HotDrinksMenu() {

		System.out.println("*****************************************************");
		System.out.println("*Please Select one option from our Hot Drinks Menu  *");
		System.out.println("*                                                   *");
		System.out.println("*               Hot Drinks Menu                     *");
		System.out.println("*             -----------------                     *");
		System.out.println("*              1. Cappuccino     - $7               *");
		System.out.println("*              2. Latte          - $7               *");
		System.out.println("*              3. Tea            - $5               *");
		System.out.println("*              4. Coffe          - $5               *");
		System.out.println("*              5. Back                              *");
		System.out.println("*****************************************************");
		System.out.print("Plese enter your option from the Hot Drinks Menu here: ");

		Scanner sc = new Scanner(System.in);
		int choiceHotDrinksMenu = sc.nextInt();

		while (true) {
			switch (choiceHotDrinksMenu) {
			case 1:
				System.out.print("Enter total order of Cappauccino you want: ");
				int totalCappauccino = sc.nextInt();
				totalhotdrinksPrice += Cappuccino(totalCappauccino);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Hot drinks??");
				System.out.println("--------------------------------------------");
				HotDrinksMenu();
				break;
			case 2:
				System.out.print("Enter total order of Cappauccino you want: ");
				int totalLatte = sc.nextInt();
				totalhotdrinksPrice += Latte(totalLatte);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Hot drinks??");
				System.out.println("--------------------------------------------");
				HotDrinksMenu();
				break;
			case 3:
				System.out.print("Enter total order of Cappauccino you want: ");
				int totalTea = sc.nextInt();
				totalhotdrinksPrice += Tea(totalTea);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Hot drinks??");
				System.out.println("--------------------------------------------");
				HotDrinksMenu();
				break;
			case 4:
				System.out.print("Enter total order of Cappauccino you want: ");
				int totalCoffe = sc.nextInt();
				totalhotdrinksPrice += Coffe(totalCoffe);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Hot drinks??");
				System.out.println("--------------------------------------------");
				HotDrinksMenu();
				break;
			case 5:
				Drinks.DrinksMenu();
				break;
			default:
				System.out.println("--------------------------------------------");
				System.out.println("Please enter valid input from the following menu!!!");
				System.out.println("--------------------------------------------");
				HotDrinksMenu();

			}
		}

	}

}
