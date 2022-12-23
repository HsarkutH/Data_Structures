import java.io.*;

public class BinarySearchTree {
	Node root;
	
	BinarySearchTree(){
		root=null;
	}
	BinarySearchTree(int barcodeNumber,int quantity,String productName){
		root = new Node(barcodeNumber, quantity,productName);
	}
	
	//to insert a product
	Node insertRec(Node root, int barcodeNumber, int quantity, String productName) {
		if(root==null) {
			root = new Node(barcodeNumber,quantity,productName);
			return root;
		}
		else if(barcodeNumber< root.barcodeNumber) {
			root.left=insertRec(root.left,barcodeNumber,quantity,productName);
		}
		else if(barcodeNumber>root.barcodeNumber)
		{
			root.right=insertRec(root.right,barcodeNumber,quantity,productName);
		}
		return root;
	}
	//We can't return node directly. So, we have to insert the item in a "void"
	void insert(int barcodeNumber, int quantity, String productName) {
		root=insertRec(root,barcodeNumber,quantity,productName);
	}
	
	//to print in-order
	void inorderRec(Node root)
	{
		if(root!= null) {
			inorderRec(root.left);
			System.out.println("Barcode number: "+root.barcodeNumber+"  -  Quantity: "+root.quantity+"  -  Product Name: "+root.productName);
			inorderRec(root.right);
		}
	}
	
	//to use in-order call
	void inorder()
	{
		inorderRec(root);
	}
	
	//to print post-order
	void postorderRec(Node root) {
		if(root==null)
		{
			return;
		}
		
		postorderRec(root.left);
		postorderRec(root.right);
		System.out.println("Barcode number: "+root.barcodeNumber+"  -  Quantity: "+root.quantity+"  -  Product Name: "+root.productName);
	}
	//to use post-order call
	void postorder() {
		postorderRec(root);
	}
	
	//to print pre-order
	void preorderRec(Node root) {
		if(root==null) {
			return;
		}
		System.out.println("Barcode number: "+root.barcodeNumber+"  -  Quantity: "+root.quantity+"  -  Product Name: "+root.productName);
		preorderRec(root.left);
		preorderRec(root.right);
	}
	//to use pre-order call
	void preorder() {
		preorderRec(root);
	}
	
	//to increase quantity
	int increaseQuantityRec(Node root,int amount, int barcodeNumber) {
		if(root.barcodeNumber==barcodeNumber) {
		root.quantity=root.quantity+amount;
		//System.out.println(root.barcodeNumber+" ekledi");
		return this.root.quantity;
		}
		else if(barcodeNumber<root.barcodeNumber) {
			this.root.quantity = increaseQuantityRec(root.left, amount, barcodeNumber);
		}
		else if(barcodeNumber>root.barcodeNumber) {
			this.root.quantity = increaseQuantityRec(root.right, amount, barcodeNumber);
		}
		return this.root.quantity;
	}
	
	//to use increase call
	void increaseQuantity(int amount,int barcodeNumber) {
		increaseQuantityRec(root,amount,barcodeNumber);
	}
	
	//to decrease quantity
	int decreaseQuantityRec(Node root,int amount,int barcodeNumber) {
		if(root.barcodeNumber == barcodeNumber) {
			root.quantity = root.quantity-amount;
			return this.root.quantity;
		}
		else if(barcodeNumber<root.barcodeNumber) {
			this.root.quantity = decreaseQuantityRec(root.left,amount,barcodeNumber);
		}
		else if(barcodeNumber>root.barcodeNumber) {
			this.root.quantity = decreaseQuantityRec(root.right,amount,barcodeNumber);
		}
		return this.root.quantity;
	}
	
	//to use decrease call
	void decreaseQuantity(int amount, int barcodeNumber) {
		decreaseQuantityRec(root,amount,barcodeNumber);
	}
}
