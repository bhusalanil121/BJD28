package resturantMenu;
import java.util.Scanner;

public class ResturantMenu {

	static int total() {
		int myTotal = Biryani.totalBiryaniPrice + HotDrinks.totalhotdrinksPrice + SoftDrinks.totalSoftDrinkPrice
				+ IceCreams.totalIceCreamsPrice;
		return myTotal;
	}

	static void mainMenu() {
		System.out.println();
		System.out.println();
		System.out.println("*****************************************************");
		System.out.println("*  Please Select one option from our Menu           *");
		System.out.println("*                                                   *");
		System.out.println("*               Resturant Menu                      *");
		System.out.println("*             -----------------                     *");
		System.out.println("*              1. Biryani                           *");
		System.out.println("*              2. Drinks                            *");
		System.out.println("*              3. Ice Creams                        *");
		System.out.println("*              4. Bill                              *");
		System.out.println("*              5. Exit                              *");
		System.out.println("*****************************************************");
		System.out.print("Plese enter your option from the menu here: ");

		Scanner sc = new Scanner(System.in);
		int resturantMenuChoice = sc.nextInt();

		while (true) {
			switch (resturantMenuChoice) {
			case 1:
				System.out.println();
				System.out.println("-------------------------------------------------------");
				System.out.println();
				Biryani.BiryaniMenu();
				break;
			case 2:
				System.out.println();
				System.out.println("-------------------------------------------------------");
				System.out.println();
				Drinks.DrinksMenu();
				break;
			case 3:
				System.out.println();
				System.out.println("-------------------------------------------------------");
				System.out.println();
				IceCreams.IceCreamsMenu();
			case 4:
				System.out.println("-------------------------------------------------------");
				System.out.println("*********************************");
				System.out.println("*          Your Bill            *");
				System.out.println("*         -----------           *");
				System.out.println("*                               *");
				System.out.println("*     Your total is $" + total() + "        *");
				System.out.println("*                               *");
				System.out.println("*  Thank you for visiting us!!! *");
				System.out.println("*                               *");
				System.out.println("*                               *");
				System.out.println("*********************************");
				sc.close();
				System.exit(0);
			case 5:
				if (total() > 0) {
					System.out.println("*********************************");
					System.out.println("*                               *");
					System.out.println("*     Your due is $" + total() + "        *");
					System.out.println("*  Thank you for visiting us!!! *");
					System.out.println("*                               *");
					System.out.println("*********************************");
				} else {
					System.out.println("-------------------------------------------------------");
					System.out.println("*********************************");
					System.out.println("*                               *");
					System.out.println("*  Thank you for visiting us!!! *");
					System.out.println("*                               *");
					System.out.println("*********************************");
				}
				sc.close();
				System.exit(0);
			default:
				System.out.println("Please enter the valid option from the menu!!!");
				mainMenu();

			}
		}

	}

}
