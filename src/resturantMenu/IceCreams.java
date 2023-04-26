package resturantMenu;
import java.util.Scanner;

public class IceCreams {
	static int totalIceCreamsPrice;

	static int GreenTeaIceCream(int quantity) {
		return 6 * quantity;
	}
	static int MangoIceCream(int quantity) {
		return 6 * quantity;
	}
	static int RedBeanIceCream(int quantity) {
		return 6 * quantity;
	}
	static int VanilaCream(int quantity) {
		return 6 * quantity;
	}

	static void IceCreamsMenu() {
		System.out.println("*****************************************************");
		System.out.println("*Please Select one option from our Ice Cream Menu   *");
		System.out.println("*                                                   *");
		System.out.println("*               Ice Cream Menu                      *");
		System.out.println("*             -----------------                     *");
		System.out.println("*              1. Green Tea Ice Crem      - $6      *");
		System.out.println("*              2. Mango Ice Cream         - $6      *");
		System.out.println("*              3. Red Bean Ice Cream      - $6      *");
		System.out.println("*              4. Vanila Ice Cream        - $6      *");
		System.out.println("*              5. Back                              *");
		System.out.println("*****************************************************");
		System.out.print("Plese enter your option from the Ice Cream Menu here: ");

		Scanner sc = new Scanner(System.in);
		int choiceIceCreamsMenu = sc.nextInt();

		while (true) {
			switch (choiceIceCreamsMenu) {
			case 1:
				System.out.print("Enter total order of Green Tea Ice Cream you want : ");
				int greenTeaIceCreamQuantity = sc.nextInt();
				totalIceCreamsPrice += GreenTeaIceCream(greenTeaIceCreamQuantity);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Ice Creams?");
				System.out.println("--------------------------------------------");
				IceCreamsMenu();
				break;
			case 2:
				System.out.print("Enter total order of Mango Ice Cream you want : ");
				int MangoIceCreamQuantity = sc.nextInt();
				totalIceCreamsPrice += MangoIceCream(MangoIceCreamQuantity);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Ice Creams?");
				System.out.println("--------------------------------------------");
				IceCreamsMenu();
				break;
			case 3:
				System.out.print("Enter total order of Red Bean Ice Cream you want : ");
				int RedBeanIceCreamQuantity = sc.nextInt();
				totalIceCreamsPrice += RedBeanIceCream(RedBeanIceCreamQuantity);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Ice Creams?");
				System.out.println("--------------------------------------------");
				IceCreamsMenu();
				break;
			case 4:
				System.out.print("Enter total order of Vanila Ice Cream you want : ");
				int VanilaCreamQuantity = sc.nextInt();
				totalIceCreamsPrice += VanilaCream(VanilaCreamQuantity);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Ice Creams?");
				System.out.println("--------------------------------------------");
				IceCreamsMenu();
				break;
			case 5:
				ResturantMenu.mainMenu();
				sc.close();
				break;
			default:
				System.out.println("--------------------------------------------");
				System.out.println("Please enter valid choice from the folloing menu!!!");
				System.out.println("--------------------------------------------");
				IceCreamsMenu();
				
			}
		}

	}

}
