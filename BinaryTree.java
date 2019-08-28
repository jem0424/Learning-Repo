
public class BinaryTree {
	Node root; //Root of binary tree
	BinaryTree(int key) { //calling constructor
		root = new Node(key);
	}
	BinaryTree() { //No parameters
		root = null;
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(); 
	       tree.root= new Node(1); 
	       tree.root.left= new Node(2); 
	       tree.root.right= new Node(3); 
	       tree.root.left.left= new Node(4); 
	       tree.root.left.right= new Node(5); 
	         
	       System.out.println("Level order traversal of binary tree is "); 
	       tree.printLevelOrder(); 
	    }
	int height(Node root) {
		if (root == null) {
			return 0;
		} else {
			int lheight = height(root.left); //calls left child 
			int rheight = height(root.right);
			if (lheight > rheight) { 
				return (lheight+1);
			} else { 
				return (rheight+1);
			}
		}
	}
	void printLevelOrder() {
		int h = height(root);
		int i;
		for (i=1; i<=h;i++) {
			printGivenLevel(root, i);
		}
	}
	void printGivenLevel (Node root ,int level) { 
        if (root == null) {
        	return;
        }      
        if (level == 1) {
            System.out.print(root.key + " ");
        }
        else if (level > 1) { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
    }
}
class Node {
	int key;
	Node left, right;
	
	public Node(int item) {
		key = item;
		left = right = null;
	}
}
