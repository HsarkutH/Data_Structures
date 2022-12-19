import java.util.Scanner;

public class Items{
	private int quantity;
	private int barcodeNumber;
	private String productName;
	Items(int quantity, int barcodeNumber,String productName){
		this.quantity = quantity;
		this.barcodeNumber = barcodeNumber;
		this.productName = productName;
		if(quantity<0)
		{
			System.out.println("This is not possible. Quantity can't be negative.");
			System.exit(0);
		}
		if(barcodeNumber<0)
		{
			System.out.println("This is not possible. Barcode can't be negative.");
			System.exit(0);
		}
	}
	public int getQuantity() {
		return quantity;
	}
	public int getBarcodeNumber() {
		return barcodeNumber;
	}
	public String getProductName() {
		return productName;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public void setBarcodeNumber(int barcodeNumber) {
		this.barcodeNumber = barcodeNumber;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}

public class Main {

	public static void main(String[] args) {
		
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
