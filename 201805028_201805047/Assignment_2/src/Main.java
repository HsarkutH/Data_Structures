import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		//decleare the variables
		int choice;
		int itemchoose;
		int increaseAmount;
		String newItem;
		int newQuantity;
		int newBarcodeNumber;
			
			
		
		BinarySearchTree tree = new BinarySearchTree();
		
		//insert the default 5 products
		tree.insert(23, 150, "Ekler");
		tree.insert(38, 200, "Baklava");
		tree.insert(41, 50, "Pasta");
		tree.insert(16, 500, "Bomba");
		tree.insert(8, 800, "Kurabiye");
		
		Scanner scan = new Scanner(System.in);
		
		
		
			
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
			System.out.print("Please choose your operation: ");
			choice = scan.nextInt();
			System.out.println("\n\n-------------------------------------\n\n");
			
			//end of menu
			
			switch(choice){
				
				//insert the new product
				case 1:
					//take the barcode number for new product
					System.out.print("Please enter the barcode number of new product: ");
					newBarcodeNumber = scan.nextInt();
					//take the amount of new product
					System.out.print("Please enter the quantity of new product: ");
					newQuantity = scan.nextInt();
					scan.nextLine();
					//take the name of new product
					System.out.print("Please enter the product name: ");
					newItem = scan.nextLine();
					System.out.println();
					//add to the tree
					tree.insert(newBarcodeNumber, newQuantity, newItem);
					
					break;
					
				//increase the amount of a product	
				case 2:
					//choose the product by barcode number
					System.out.print("Please enter the barcode number of the product: ");
					itemchoose = scan.nextInt();
					//set the amount that user wants to increase
					System.out.print("Amount of increase: ");
					increaseAmount = scan.nextInt();
					
					//decrease the amount of product
					tree.increaseQuantity(increaseAmount,itemchoose);
					break;
					
				//decrease the amount of a product
				case 3:
					//choose the product by barcode number
					System.out.print("Please enter the barcode number of the product: ");
					itemchoose = scan.nextInt();
					//set the amount that user wants to decrease
					System.out.print("Amount of decrease: ");
					increaseAmount = scan.nextInt();
					
					//decrease the amount of product
					tree.decreaseQuantity(increaseAmount, itemchoose);
					break;
					
				//print in-order
				case 4:
					tree.inorder();
					break;
					
				//print post-order
				case 5:
					tree.postorder();
					break;
				//print pre-order
				case 6:
					tree.preorder();
					break;
				
				//Terminate the program
				case 0:
					System.out.println("Terminating the program...");
					System.exit(0);
					
				//default case
				default:
					System.out.println("Error: Invalid input");
					System.exit(0);
			}
		}
	}

}
