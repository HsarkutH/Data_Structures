import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		int choice;
		int i = 0;
			
			
			
		Scanner scan = new Scanner(System.in);
		Items[] item = new Items[10];
		item[0] = new Items(10,20,"Ekler");
		item[1] = new Items(100,15,"Baklava");
		item[2] = new Items(100,15,"Baklava");
		item[3] = new Items(100,15,"Baklava");
		item[4] = new Items(100,15,"Baklava");
		item[5] = new Items(100,15,"Erik");
			
			//menu
		while(true) {	
			System.out.println("----- MAIN MENU -----\n\n");
			System.out.println("1 - Add a product");
			System.out.println("2 - Increase the quantity");
			System.out.println("3 - Decrease the quantity");
			System.out.println("4 - Print in-order");
			System.out.println("5 - Print post-order");
			System.out.println("6 - Print pre-order\n");
			System.out.println("0 - Exit\n");
			System.out.println("Please choose your operation: ");
			choice = scan.nextInt();
			System.out.println("\n\n-------------------------------------\n\n");
			
			//end of menu
			
			switch(choice){
				
				
				case 1:
					while(item[i].getProductName().equals("")==false)
					{
						item[i].toString();
						i++;
					}
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 0:
					System.out.println("Terminating the program...");
					System.exit(0);
				default:
					System.out.println("Error: Invalid input");
					System.exit(0);
			}
		}
	}

}
