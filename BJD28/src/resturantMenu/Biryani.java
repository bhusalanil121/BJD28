package resturantMenu;
import java.util.*;

public class Biryani {

	static int totalBiryaniPrice;

	static int lambBiryani(int quantity) {
		return quantity * 21;
	}

	static int goatBiryani(int quantity) {
		return quantity * 21;
	}

	static int chickenBiryani(int quantity) {
		return quantity * 19;
	}

	static int vegBiryani(int quantity) {
		return quantity * 17;
	}

	static void BiryaniMenu() {
		System.out.println("*****************************************************");
		System.out.println("*  Please Select one option from our Biryani Menu   *");
		System.out.println("*                                                   *");
		System.out.println("*               Biryani Menu                        *");
		System.out.println("*             -----------------                     *");
		System.out.println("*              1. Lamb Biryani      - $21           *");
		System.out.println("*              2. Goat Biryani      - $21           *");
		System.out.println("*              3. Chicken Biryani   - $19           *");
		System.out.println("*              4. Veg Biryani       - $17           *");
		System.out.println("*              5. Back                              *");
		System.out.println("*****************************************************");
		System.out.print("Plese enter your option from the Biryani Menu here: ");

		Scanner sc = new Scanner(System.in);
		int biryaniChoice = sc.nextInt();

		while (true) {
			switch (biryaniChoice) {
			case 1:
				System.out.print("Enter total order of Lamb biryani you want : ");
				int lambBiryaniQuantity = sc.nextInt();
				totalBiryaniPrice += lambBiryani(lambBiryaniQuantity);
				System.out.println(totalBiryaniPrice);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Biryani??");
				System.out.println("--------------------------------------------");
				BiryaniMenu();
				break;
			case 2:
				System.out.print("Enter total order of Goat biryani you want : ");
				int goatBiryaniQuantity = sc.nextInt();
				totalBiryaniPrice += goatBiryani(goatBiryaniQuantity);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Biryani??");
				System.out.println("--------------------------------------------");
				BiryaniMenu();
				break;
			case 3:
				System.out.print("Enter total order of Chicken biryani you want : ");
				int chickenBiryaniQuantity = sc.nextInt();
				totalBiryaniPrice += chickenBiryani(chickenBiryaniQuantity);
				System.out.println("--------------------------------------------");
				System.out.println("Do you want more Biryani??");
				System.out.println("--------------------------------------------");
				BiryaniMenu();
				break;
			case 4:
				System.out.print("Enter total order of Veg biryani you want : ");
				int vegBiryaniQuantity = sc.nextInt();
				totalBiryaniPrice += vegBiryani(vegBiryaniQuantity);
				System.out.println("--------------------------------------------");
				System.out.println("Please enter valid choice from the folloing menu!!!");
				System.out.println("--------------------------------------------");
				BiryaniMenu();
				break;
			case 5:
				ResturantMenu.mainMenu();
				sc.close();
				break;
			default:
				System.out.println("--------------------------------------------");
				System.out.println("Please choose correct menu option");
				System.out.println("--------------------------------------------");
				BiryaniMenu();
			}
		}

	}

}
