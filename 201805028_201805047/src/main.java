import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String productName;
		int quantity;
		int barcodeNumber;
		int choice;
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		//menu
		
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
		
		Switch(choice){
			
			
			case 1:
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
			
			default:
				System.out.println("Error: Invalid input");
				System.exit(0);
		}

	}

}
