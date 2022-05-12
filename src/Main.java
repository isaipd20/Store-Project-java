import java.util.Scanner;

public class Main {
	static boolean temp = true;

	public static void main(String[] args) {
		int select;
		Scanner input = new Scanner(System.in);
		
		while(temp == true) {
			System.out.println("Welcome to the store project!!");
			System.out.println("This is the current menu: \n 1: add items || 2: print items || 0: quit");
			select = input.nextInt();
			Menu.menu(select);
			//input.close();
		}
	}
}
