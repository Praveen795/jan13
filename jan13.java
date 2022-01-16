package jan13;



class Node{
	int data;
	Node left ,right;
	
	public Node(int data) {
		
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	
}

class Tree{

	// print all leave node from the binary tree____________________***
	
	static void print(Node node) {
		if(node.left==null && node.right==null) {
			System.out.println("leave node  :"+node.data);
		}else {
			print(node.left);
			print(node.right);
		}
	}
// addition of all node data in tree_______________________________***
	static int sum(Node node) {
		int summ=0;
		int rsum=0;
		int lsum=0;
		
		if(node==null) {
			return 0;
		}else {
			return node.data+sum(node.left)+sum(node.right);
		}
		
		
	}
	static int count(Node node) {
		int count=1;
		if(node==null) {
			return 0;
		}else {
			return count+count(node.left)+count(node.right);
			
		}
	}
// find hight of a tree __________________________________________***
	
	static int hight(Node node) {
		if(node==null) {
			return -1;
			
		}else {
			
			int lhight=hight(node.left);
			int rhight=hight(node.right);
			
			if(lhight>rhight) {
				return (lhight+1);
				
			}else {
				return (rhight+1);
			}
		}
	}
	
// print kth level values in binary tree________________________***
	
	static void level(Node node,int current,int kth) {
		if(node==null) {
			return;
		}
		if(current==kth) {
			System.out.println(node.data);
		}else {
			level(node.left, current+1, kth);
			level(node.right, current+1, kth);
			
		}
	}
}

public class jan13 {
	
	public static void main(String[] args) {
		
		Node root=new Node(1);
		 root.left=new Node(2);
		 root.right=new Node(3);
		 root.left.left=new Node(4);
		 root.left.right=new Node(5);
		 root.right.left=new Node(6);
		 root.right.right=new Node(7);
		 
		 Tree.print(root);
		 System.out.println("sum of tree elements :"+Tree.sum(root));
		 System.out.println("count of number of nodes  :"+Tree.count(root));
		 System.out.println("hight of a node  :"+Tree.hight(root));
		 
		 System.out.println("kth level print ");
		 Tree.level(root, 0, 1);
		
	}

}
