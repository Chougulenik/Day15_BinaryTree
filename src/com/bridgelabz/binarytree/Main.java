package com.bridgelabz.binarytree;

public class Main {

	public static void main(String[] args) {
		
		BinaryTree<Integer> tree = new BinaryTree<>();
		tree.add(56);
		tree.add(30);
		tree.add(70);
		
		int size = tree.getSize();
		System.out.println(size);
		tree.print();
		tree.search(30);
		tree.print();
		
	}

}
