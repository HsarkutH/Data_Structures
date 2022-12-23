import java.io.*;

public class BinarySearchTree {
	Node root;
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
	
	BinarySearchTree(){
		root=null;
	}
	BinarySearchTree(int barcodeNumber,int quantity,String productName){
		root = new Node(barcodeNumber, quantity,productName);
	}
	void insert(int barcodeNumber, int quantity, String productName) {
		root=insertRec(root,barcodeNumber,quantity,productName);
	}
	
	void inorderRec(Node root)
	{
		if(root!= null) {
			inorderRec(root.left);
			System.out.println(root.barcodeNumber+" "+ root.quantity+ " "+ root.productName);
			inorderRec(root.right);
		}
	}
	
	void inorder()
	{
		inorderRec(root);
	}
	
	void postorderRec(Node root) {
		if(root==null)
		{
			return;
		}
		
		postorderRec(root.left);
		postorderRec(root.right);
		System.out.println(root.barcodeNumber+" "+root.quantity+" "+root.productName);
	}
	void postorder() {
		postorderRec(root);
	}
	
	void preorderRec(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.barcodeNumber+" "+root.quantity+" "+root.productName);
		preorderRec(root.left);
		preorderRec(root.right);
	}
	void preorder() {
		preorderRec(root);
	}
	
}
