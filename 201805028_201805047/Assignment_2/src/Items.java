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
	
	public String toString() {
		
		System.out.println("Product Name: "+getProductName());
		System.out.println("Barcode Number: "+getBarcodeNumber());
		System.out.println("Quantity: "+getQuantity());
		System.out.println();
		
		return"";
	}
	
}