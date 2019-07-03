package costudy1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class co1991 {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, n = Integer.parseInt(br.readLine());
		
		Tree t = new Tree();
		
	
			for(i=0; i<n; ++i){
				StringTokenizer st = new StringTokenizer (br.readLine(), " ");
			    t.insert((st.nextToken()).charAt(0), (st.nextToken()).charAt(0), (st.nextToken()).charAt(0));
			}
			
			t.preorder(t.root);
			System.out.println();
			t.inorder(t.root);
			System.out.println();
			t.postorder(t.root);
			
		}
			
}

	
	 class Node{
		char data;
		Node left, right;
		public Node(char data) {
			this.data = data;
			
		}
		
	}
	
	 class Tree{
		Node root;
		
		public void insert(char data, char leftdata, char rightdata) {
			if(root == null) {
				if(data != '.') 
					root = new Node(data);
				if(leftdata != '.') 
					root = new Node(leftdata);
				if(rightdata != '.') 
					root = new Node(rightdata);
			}
			else
				search(root, data, leftdata, rightdata);
		}
		
		private void search(Node root, char data, char leftdata, char rightdata) {
			
			if(root == null)
				return;
			
			else if(root.data ==data) {
				if(leftdata!='.')
					root.left = new Node(leftdata);
				if(rightdata!='.')
					root.right = new Node(rightdata);    
			}
			
			else {
				search(root.left, data, leftdata, rightdata);
				search(root.right, data, leftdata, rightdata);
			}
		}
	
		
		public void preorder(Node root) {
			
			System.out.print(root.data);
			if(root.left!= null)
				preorder(root.left);
			if(root.right!= null)
				preorder(root.right);
		}		
		
		public void inorder(Node root) {
			
			if(root.left!= null)
				inorder(root.left);
			System.out.print(root.data);
			if(root.right!= null)
				inorder(root.right);
		}
		
		
		public void postorder(Node root) {
			
			if(root.left!= null)
				postorder(root.left);
			if(root.right!= null)
			    postorder(root.right);
			System.out.print(root.data);
		}
	}
	

			
