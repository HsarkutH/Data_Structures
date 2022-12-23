import java.util.Scanner;
import java.util.LinkedList;



public class Main {

	public static void main(String[] args) {
		
		int choice;
		int i = 0;
		//int arrSize=5;
		int itemchoose;
		int increaseAmount;
		String newItem;
		int newQuantity;
		int newBarcodeNumber;
			
			
		/*LinkedList<String> productNames = new LinkedList<>();
		LinkedList<Integer> quantity = new LinkedList<>();
		LinkedList<Integer> barcodeNumber = new LinkedList<>();*/
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(23, 150, "Ekler");
		tree.insert(38, 200, "Baklava");
		tree.insert(41, 50, "Pasta");
		tree.insert(16, 500, "Bomba");
		tree.insert(8, 800, "Kurabiye");
		
		Scanner scan = new Scanner(System.in);
		
		/*productNames.addFirst("Ekler");
		productNames.add("Baklava");
		productNames.add("Pasta");
		productNames.add("Bomba");
		productNames.add("Kurabiye");
		quantity.add(20);
		quantity.add(10);
		quantity.add(5);
		quantity.add(30);
		quantity.add(50);
		barcodeNumber.add(42);
		barcodeNumber.add(86);
		barcodeNumber.add(95);
		barcodeNumber.add(13);
		barcodeNumber.add(79);*/
		/*item[0] = new Items(50,20,"Ekler");
		item[1] = new Items(100,15,"Baklava");
		item[2] = new Items(20,3,"Pasta");
		item[3] = new Items(150,18,"Bomba");
		item[4] = new Items(200,42,"Kurabiye");*/
		
			
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
				
				
				case 1:
					System.out.print("Please enter the barcode number of new item: ");
					newBarcodeNumber = scan.nextInt();
					System.out.print("Please enter the quantityy of new item: ");
					newQuantity = scan.nextInt();
					scan.nextLine();
					System.out.print("Please enter the product name: ");
					newItem = scan.nextLine();
					System.out.println();
					
					/*productNames.add(newItem);
					quantity.add(newQuantity);
					barcodeNumber.add(newBarcodeNumber);*/
					
					/*while(i<productNames.size())
					{
						System.out.println("Product Name: "+ productNames.get(i));
						System.out.println("Quantity: "+ quantity.get(i));
						System.out.println("Barcode Number: "+barcodeNumber.get(i));
						System.out.println();
						i++;
					}
					
					System.out.println(barcodeNumber.size());
					i=0;*/
					break;
				case 2:
					/*while(i<productNames.size())
					{
						System.out.println(i+1 +": "+productNames.get(i));
						i++;
					}
					System.out.print("Please choose the item: ");
					itemchoose = scan.nextInt()-1;
					System.out.print("Amount of increase: ");
					increaseAmount = scan.nextInt();
					
					quantity.set(itemchoose, quantity.get(itemchoose)+increaseAmount);
					//System.out.println(quantity.get(itemchoose));*/
					i=0;
					break;
				case 3:
					/*while(i<productNames.size())
					{
						System.out.println(i+1 +": "+productNames.get(i));
						i++;
					}
					System.out.print("Please choose the item: ");
					itemchoose = scan.nextInt()-1;
					System.out.print("Amount of decrease: ");
					increaseAmount = scan.nextInt();
					
					quantity.set(itemchoose, quantity.get(itemchoose)-increaseAmount);*/
					i=0;
					break;
				case 4:
					tree.inorder();
					break;
				case 5:
					tree.postorder();
					break;
				case 6:
					tree.preorder();
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
