package com.madhushika.search;

 class BinaryTree {
	

		/* Class containing left 
		and right child of current node 
		* and key value*/
		class Node 
		{ 
			int key; 
			Node left, right; 

			public Node(int item) 
			{ 
				key = item; 
				left = right = null; 
			} 
		} 

		// Root of BST 
		Node root; 

		// Constructor 
		BinaryTree() 
		{ 
			root = null; 
		} 

		void insert(int key) 
		{ 
			root = insertRec(root, key); 
		} 

		/* A recursive function to 
		insert a new key in BST */
		Node insertRec(Node root, int key) 
		{ 

			/* If the tree is empty, 
			return a new node */
			if (root == null) 
			{ 
				root = new Node(key); 
				return root; 
			} 

			/* Otherwise, recur down the tree */
			if (key < root.key) 
				root.left = insertRec(root.left, key); 
			else if (key > root.key) 
				root.right = insertRec(root.right, key); 

		
			return root; 
		} 

	
		void inorder() 
		{ 
			inorderRec(root); 
		} 

		// A utility function to 
		// do inorder traversal of BST 
		void inorderRec(Node root) 
		{ 
			if (root != null) { 
				inorderRec(root.left); 
				System.out.println(root.key); 
				inorderRec(root.right); 
			} 
		} 

	
		public static void main(String[] args) 
		{ 
			BinaryTree tree = new BinaryTree(); 

	
			tree.insert(50); 
			tree.insert(30); 
			tree.insert(20); 
			tree.insert(40); 
			tree.insert(70); 
			tree.insert(60); 
			tree.insert(80); 

			// print inorder traversal of the BST 
			tree.inorder(); 
		
		} 
	} 
	


