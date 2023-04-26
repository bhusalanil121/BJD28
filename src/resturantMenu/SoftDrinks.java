package resturantMenu;
import java.util.Scanner;

public class SoftDrinks {
	static int totalSoftDrinkPrice;

	static int coke(int quantity) {
		return quantity * 5;
	}

	static int sprite(int quantity) {
		return quantity * 5;
	}

	static int fanta(int quantity) {
		return quantity * 5;
	}

	static int lemonade(int quantity) {
		return quantity * 6;
	}

	static void SoftDrinksMenu() {
		System.out.println("*****************************************************");
		System.out.println("*Please Select one option from our Soft Drinks Menu *");
		System.out.println("*                                                   *");
		System.out.println("*               Soft Drinks Menu                    *");
		System.out.println("*             -----------------                     *");
		System.out.println("*              1. Coke              - $5            *");
		System.out.println("*              2. Sprite            - $5            *");
		System.out.println("*              3. Fanta             - $5            *");
		System.out.println("*              4. Lemonade          - $6            *");
		System.out.println("*              5. Back                              *");
		System.out.println("*****************************************************");
		System.out.print("Plese enter your option from the Soft Drinks Menu here: ");

		Scanner sc = new Scanner(System.in);
		int SoftDrinksMenuChoice = sc.nextInt();

		while (true) {
			switch (SoftDrinksMenuChoice) {
			case 1:
				System.out.print("Enter total order of coke you want : ");
				int cokeQuantity = sc.nextInt();
				totalSoftDrinkPrice += coke(cokeQuantity);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Soft Drinks?");
				System.out.println("--------------------------------------------");
				SoftDrinksMenu();
				break;
			case 2:
				System.out.print("Enter total order of Sprite you want : ");
				int spriteQuantity = sc.nextInt();
				totalSoftDrinkPrice += sprite(spriteQuantity);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Soft Drinks?");
				System.out.println("--------------------------------------------");
				SoftDrinksMenu();
				break;
			case 3:
				System.out.print("Enter total order of Fanta you want : ");
				int fantaQuantity = sc.nextInt();
				totalSoftDrinkPrice += fanta(fantaQuantity);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Soft Drinks?");
				System.out.println("--------------------------------------------");
				SoftDrinksMenu();
				break;
			case 4:
				System.out.print("Enter total order of Lemonade you want : ");
				int lemonadeQuantity = sc.nextInt();
				totalSoftDrinkPrice += lemonade(lemonadeQuantity);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Soft Drinks?");
				System.out.println("--------------------------------------------");
				SoftDrinksMenu();
				break;
			case 5:
				Drinks.DrinksMenu();
				sc.close();
				break;
			default:
				System.out.println("--------------------------------------------");
				System.out.println("Please enter valid choice from the folloing menu!!!");
				System.out.println("--------------------------------------------");
				SoftDrinksMenu();

			}

		}
	}
}
