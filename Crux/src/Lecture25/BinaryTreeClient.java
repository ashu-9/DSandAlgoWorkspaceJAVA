package Lecture25;

public class BinaryTreeClient {
	// 50 true 25 true 12 false false true 37 false false true 75 true 62 false false true 87 false false
	public static void main(String[] args) {
//		BinaryTree bt = new BinaryTree();
//		bt.display();
		
//		System.out.println(bt.min());
//		System.out.println(bt.size2());
//		System.out.println(bt.find(5));
//		System.out.println(bt.find(87));
//		System.out.println(bt.max());
//		System.out.println(bt.height());
//		bt.mirror();
//		bt.display();
//		bt.preorder();
//		bt.postorder();
//		bt.inorder();
//		bt.levelorder();
//		bt.preorderitereative();
//		System.out.println(bt.postordersucc(62));
		int[] pre={61,65,50,70};
		int[] in={50,65,61,70};
		BinaryTree bt=new BinaryTree(pre,in);
		bt.display();
//		System.out.println(bt.height());
//		System.out.println(bt.diameter());
//		System.out.println(bt.diameterbtr());
//		System.out.println(bt.isbstbtr());
//		System.out.println(bt.isbstbtr2());
		
		System.out.println(bt.largestBSTinBT());
		
	}

}
