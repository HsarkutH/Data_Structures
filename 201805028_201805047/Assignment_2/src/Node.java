
public class Node {
	int barcodeNumber;
	int quantity;
	String productName;
	Node left,right;
	
	public Node(int barcodeNumber,int quantity, String productName) {
		this.barcodeNumber=barcodeNumber;
		this.quantity=quantity;
		this.productName=productName;
		left=right=null;
	}
	

}
