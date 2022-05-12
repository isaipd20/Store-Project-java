import java.util.Scanner;

import functions.Functions;

public class Menu {
	public static void menu(int select) {
		Functions func = new Functions();

		switch(select) {
		case 1:
			Scanner input = new Scanner(System.in);
			System.out.println("Write an item to add to cart");
			String item = input.nextLine();
			func.addItems(item);
			break;
		case 2:
			System.out.println("Printing items");
			func.printItems();
			break;
		case 0:
			System.exit(0);
			Main.temp = false;
			break;
		}
	}
}
