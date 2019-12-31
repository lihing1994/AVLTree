import java.util.*; 
import java.lang.Math; 
public class AVLTreeTester
{
	public static void main(String[] args)
	{
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		AVLTreeTree<Integer> avl = new AVLTreeTree<Integer>();
		Integer [] arr = new Integer[]{1,3,5,7,2,4,6,8,9,11,13};//1,3,5,7,2,4,6,8,9,11,13 // 10,20,30,40,50,25,
		System.out.print("AVL Tree aftering inserting following elements: ");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		avl.insert(arr);
		System.out.println();
		avl.level_order_travel_tree();
		System.out.print("Pre order tree traversal: ");
		avl.pre_order_travel_tree();
		System.out.println();
		System.out.print("In order tree traversal: ");
		avl.in_order_travel_tree();
		System.out.println();
		System.out.print("Post order tree traversal: "+avl.get_string_post_order());
		System.out.println();
		System.out.println("The height of the tree: "+avl.height());
		System.out.println("The size of the tree: "+avl.size());
		System.out.println("Is the tree balance: "+avl.isBlance());
		System.out.println("The number of the Leaves: "+avl.leaves());
		avl.remove(13);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		AVLTreeTree<Integer> avl1 = new AVLTreeTree<Integer>();
		Integer [] arr1 = new Integer[]{1,3,5,7,2,4,6,8,9,11,13};//1,3,5,7,2,4,6,8,9,11,13 // 10,20,30,40,50,25,
		System.out.print("AVL Tree aftering inserting following elements: ");
		for(int i =0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		avl1.insert(arr1);
		System.out.println();
		avl1.level_order_travel_tree();
		System.out.print("Pre order tree traversal: ");
		avl1.pre_order_travel_tree();
		System.out.println();
		System.out.print("In order tree traversal: ");
		avl1.in_order_travel_tree();
		System.out.println();
		System.out.print("Post order tree traversal: "+avl1.get_string_post_order());
		System.out.println();
		System.out.println("The height of the tree: "+avl1.height());
		System.out.println("The size of the tree: "+avl1.size());
		System.out.println("Is the tree balance: "+avl1.isBlance());
		System.out.println("The number of the Leaves: "+avl1.leaves());
		avl.remove(7);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		AVLTreeTree<Integer> avl2 = new AVLTreeTree<Integer>();
		Integer [] arr2 = new Integer[]{1,3,5,7,2,4,6,8,9,11,13};//1,3,5,7,2,4,6,8,9,11,13 // 10,20,30,40,50,25,
		System.out.print("AVL Tree aftering inserting following elements: ");
		for(int i =0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		avl2.insert(arr2);
		System.out.println();
		avl2.level_order_travel_tree();
		System.out.print("Pre order tree traversal: ");
		avl2.pre_order_travel_tree();
		System.out.println();
		System.out.print("In order tree traversal: ");
		avl2.in_order_travel_tree();
		System.out.println();
		System.out.print("Post order tree traversal: "+avl2.get_string_post_order());
		System.out.println();
		System.out.println("The height of the tree: "+avl2.height());
		System.out.println("The size of the tree: "+avl2.size());
		System.out.println("Is the tree balance: "+avl2.isBlance());
		System.out.println("The number of the Leaves: "+avl2.leaves());
		avl2.remove(9);
		avl2.remove(3);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		AVLTreeTree<Integer> avl3 = new AVLTreeTree<Integer>();
		Integer [] arr3 = new Integer[]{};
		System.out.print("AVL Tree aftering inserting following elements: ");
		for(int i =0;i<arr3.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		avl3.insert(arr3);
		System.out.println();
		avl3.level_order_travel_tree();
		System.out.print("Pre order tree traversal: ");
		avl3.pre_order_travel_tree();
		System.out.println();
		System.out.print("In order tree traversal: ");
		avl3.in_order_travel_tree();
		System.out.println();
		System.out.print("Post order tree traversal: "+avl3.get_string_post_order());
		System.out.println();
		System.out.println("The height of the tree: "+avl3.height());
		System.out.println("The size of the tree: "+avl3.size());
		System.out.println("Is the tree balance: "+avl3.isBlance());
		System.out.println("The number of the Leaves: "+avl3.leaves());
		avl3.remove(10);
		avl3.remove(3);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		AVLTreeTree<Integer> avl4 = new AVLTreeTree<Integer>();
		Integer [] arr4 = new Integer[]{10,20,30,40,50,25};//1,3,5,7,2,4,6,8,9,11,13 // 10,20,30,40,50,25,
		System.out.print("AVL Tree aftering inserting following elements: ");
		for(int i =0;i<arr4.length;i++)
		{
			System.out.print(arr4[i]+" ");
		}
		System.out.println();
		avl4.insert(arr4);
		System.out.println();
		avl4.level_order_travel_tree();
		System.out.print("Pre order tree traversal: ");
		avl4.pre_order_travel_tree();
		System.out.println();
		System.out.print("In order tree traversal: ");
		avl4.in_order_travel_tree();
		System.out.println();
		System.out.print("Post order tree traversal: "+avl4.get_string_post_order());
		System.out.println();
		System.out.println("The height of the tree: "+avl4.height());
		System.out.println("The size of the tree: "+avl4.size());
		System.out.println("Is the tree balance: "+avl4.isBlance());
		System.out.println("The number of the Leaves: "+avl4.leaves());
		avl4.remove(20);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

	}
}
class AVLTreeTree<Type extends Comparable<? super Type>>
{
	private AVLNode<Type> root;
	private ArrayList<AVLNode<Type>> levelList;
	public AVLTreeTree()
	{
		root = null;
	}
	public AVLTreeTree(Type element)
	{
		root = new AVLNode<Type>(element);
	}
	public void setRoot(AVLNode<Type> root)
	{
		this.root = root;
	}
	public AVLNode<Type> getRoot()
	{
		return root;
	}
	public void insert(Type element)
	{
		if(root == null)
		{
			root = new AVLNode<Type>(element);
		}
		else
		{
			AVLNode<Type> temp = root;
			AVLNode<Type> toAdd = new AVLNode<Type>(element);
			while(temp!=null)
			{
				if(temp.getElement().compareTo(element)<0&&temp.getRight()!=null)
				{
					temp = temp.getRight();
				}
				else if(temp.getElement().compareTo(element)<0&&temp.getRight()==null)
				{
					temp.setRight(toAdd);
					balance();
					return;
				}
				else if(temp.getElement().compareTo(element)>=0&&temp.getLeft()!=null)
				{
					temp = temp.getLeft();
				}
				else
				{
					temp.setLeft(toAdd);
					balance();
					return;
				}
			}
		}
	}
	public void insert(Type[] elements)
	{
		for(int i=0;i<elements.length;i++)
		{
			this.insert(elements[i]);
		}

	}
	public int height()
	{
		int height = -1;
		if(root == null)
		{
			return height;
		}
		else
		{
			return height += height(root);
		}
	}
	private int height(AVLNode<Type> root)
	{
		if(root == null)
		{
			return 0;
		}
		else
		{
			int height =1 ;
			int left_node_height = height(root.getLeft());
			int right_node_height = height(root.getRight());
			if(left_node_height>right_node_height)
			{
				return height += left_node_height;
			}
			else
			{
				return height += right_node_height;
			}
		}

	}
	public void remove(Type elements)
	{

		if(root == null)
		{
			return;
		}
		else
		{
			System.out.println();
			System.out.println("Try to remove the elements :"+ elements);
			root = remove(root,elements);
			balance();
		}

	}
	private AVLNode<Type> remove(AVLNode<Type> root,Type elements)
	{
		if(root ==null)
		{
			return null;
		}
		else
		{
			
			if(root.getElement().compareTo(elements)==0&&root.getLeft()==null&&root.getRight()==null)
			{
				return null;
			}
			else if(root.getElement().compareTo(elements)==0)
			{
				AVLNode<Type> temp = root.getLeft();
				AVLNode<Type> tempRight = temp.getRight();
				while(tempRight!=null)
				{
					if(tempRight.getRight()!=null)
					{
						temp = temp.getRight();
						tempRight = tempRight.getRight();
					}
					else
					{
						tempRight.setLeft(root.getLeft());
						tempRight.setRight(root.getRight());
						//temp = tempRight;
						temp.setRight(null);
						return tempRight;
					}
				}
				if(tempRight ==null)
				{
					temp.setRight(root.getRight());
					return temp;
				}

			}
			root.setLeft(remove(root.getLeft(),elements));
			root.setRight(remove(root.getRight(),elements));
			return root;
		}
	}
	private AVLNode<Type> rotate_left(AVLNode<Type> temp)
	{
		AVLNode<Type> temproot = temp;
		temp = temp.getRight();
		temp.setLeft(temproot);
		temproot.setRight(null);
		return temp;
	}
	private AVLNode<Type> rotate_left(AVLNode<Type> temp,AVLNode<Type> childLeft)
	{
		AVLNode<Type> temproot = temp;
		temp = temp.getRight();
		temp.setLeft(temproot);
		temproot.setRight(childLeft);
		return temp;
	}
	private AVLNode<Type> rotate_right(AVLNode<Type> temp)
	{
		AVLNode<Type> temproot = temp;
		temp = temp.getLeft();
		temp.setRight(temproot);
		temproot.setLeft(null);
		return temp;
	}
	private AVLNode<Type> rotate_right(AVLNode<Type> temp,AVLNode<Type> childRight)
	{
		AVLNode<Type> temproot = temp;
		temp = temp.getLeft();
		temp.setRight(temproot);
		temproot.setLeft(childRight);
		return temp;
	}
	private void balance()
	{
		if(root==null)
		{
			return;
		}
		else
		{
			root = balance(root);
			level_order_travel_tree();
		}
	}
	private AVLNode<Type> balance(AVLNode<Type> temp)
	{
		if(temp==null)
		{
			return null;
		}
		else
		{
			temp.setLeft(balance(temp.getLeft()));
			temp.setRight(balance(temp.getRight()));
			int leftheight = height(temp.getLeft());
			int rightheight = height(temp.getRight());
			if(rightheight-leftheight>1)
			{
				if(height(temp.getRight().getRight()) > height(temp.getRight().getLeft()))//rotate left.
				{
					temp = rotate_left(temp,temp.getRight().getLeft());
				}
				else if(height(temp.getRight().getRight()) < height(temp.getRight().getLeft()))//rotate right and left.
				{
					temp.setRight(rotate_right(temp.getRight()));
					temp = rotate_left(temp,temp.getRight().getLeft());
				}
			}
			else if(rightheight-leftheight<-1)
			{
				if(height(temp.getLeft().getLeft()) > height(temp.getLeft().getRight()))//right rotation
				{
					temp = rotate_right(temp,temp.getLeft().getRight());
				}
				else if(height(temp.getLeft().getLeft()) < height(temp.getLeft().getRight()))//left rotation and right rotation
				{
					//rotate left
					temp.setLeft(rotate_left(temp.getLeft()));
					temp = rotate_right(temp,temp.getLeft().getRight());

				}
			}
			return temp;
		}
	}
	private boolean passTest(AVLNode<Type> root)
	{
		int left = height(root.getLeft());
		int right = height(root.getRight());
		if(Math.abs(left-right)>=2)
		{
			return false;
		}
		return true;
	}
	private boolean allPassed(AVLNode<Type> root)
	{
		if(root == null)
		{
			return true;
		}
		else
		{
			boolean left = allPassed(root.getLeft());
			if(!passTest(root))
			{
				return false;
			}
			boolean right = allPassed(root.getRight());
			if(!passTest(root))
			{
				return false;
			}
			return left&&right;
		}
	}
	public boolean isBlance()
	{
		if(allPassed(root))
		{
			return true;
		}
		return false;
	}
	public void pre_order_travel_tree()
	{
		if(root == null )
		{
			return;
		}
		else
		{
			pre_order_travel_tree(root);
		}
	}
	private void pre_order_travel_tree(AVLNode<Type> root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			System.out.print(root.getElement()+" ");
			pre_order_travel_tree(root.getLeft());
			pre_order_travel_tree(root.getRight());
		}
	}
	
	public void in_order_travel_tree()
	{
		if(root == null)
		{
			return;
		}
		else
		{
			in_order_travel_tree(root);
		}
	}
	private void in_order_travel_tree(AVLNode<Type> root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			in_order_travel_tree(root.getLeft());
			System.out.print(root.getElement()+" ");
			in_order_travel_tree(root.getRight());
		}
	}
	
	public void post_order_travel_tree()
	{
		if(root == null)
		{
			return;
		}
		else
		{
			post_order_travel_tree(root);
		}
	}
	private void post_order_travel_tree(AVLNode<Type> root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			post_order_travel_tree(root.getLeft());
			post_order_travel_tree(root.getRight());
			System.out.println(root.getElement());
		}
	}
	public String get_string_post_order()
	{
		if(root == null)
		{
			return "";
		}
		else
		{
			return get_string_post_order(root);
		}
	}
	private String get_string_post_order(AVLNode<Type> root)
	{
		if(root == null)
		{
			return "";
		}
		else
		{
			String to_return = "";
			to_return += get_string_post_order(root.getLeft());
			to_return += get_string_post_order(root.getRight());
			to_return += root.getElement().toString()+" ";
			return to_return;
		}
	}
	public int leaves()
	{
		if(root ==null)
		{
			return 0;
		}
		else
		{
			return leaves(root);
		}
	}
	private int leaves(AVLNode<Type> temp)
	{
		if(temp == null)
		{
			return 0;
		}
		else
		{
			int leaves = 0;
			leaves += leaves(temp.getLeft());
			leaves += leaves(temp.getRight());
			if(temp.getLeft() == null && temp.getRight() == null)
			{
				return leaves+=1;
			}
			else
			{
				return leaves;
			}
		}
	}
	public int size()
	{
		if(root == null)
		{
			return 0;
		}
		else
		{
			return size(root);
		}
	}
	private int size(AVLNode<Type> temp)
	{
		if(temp == null)
		{
			return 0;
		}
		else
		{
			int tempRoot = 1;
			int left = size(temp.getLeft());
			int right = size(temp.getRight());
			return tempRoot+left+right;
		}
	}
	public void level_order_travel_tree()
	{
		if(root == null)
		{
			return;
		}
		else
		{
			System.out.println("                          Level order traversa:                          ");
			for(int i=0;i<=height();i++)
			{
				System.out.print("Level "+(i+1)+": ");
				level_order_travel_tree(root,i);
				System.out.println();
			}
		}
	}
	private void level_order_travel_tree(AVLNode<Type> root,int height)
	{
		if(root == null)
		{
			return;
		}
		else if(height == 0)
		{
			System.out.print(root.getElement()+" ");
		}
		else
		{
			level_order_travel_tree(root.getLeft(),height-1);
			level_order_travel_tree(root.getRight(),height-1);
		}
	}
}
class AVLNode<Type>
{
	private Type element;
	private AVLNode<Type> left;
	private AVLNode<Type> right;
	public AVLNode(Type element)
	{
		this.element = element;
		left = null;
		right = null;
	}
	public AVLNode(Type element, AVLNode<Type> left, AVLNode<Type> right)
	{
		this.element = element;
		this.left = left;
		this.right = right;
	}
	public void setElement(Type element)
	{
		this.element = element;
	}
	public Type getElement()
	{
		return element;
	}
	public void setLeft(AVLNode<Type> left)
	{

		this.left = left;

	}
	public AVLNode<Type> getLeft()
	{
		return left;
	}
	public void setRight(AVLNode<Type> right)
	{
		this.right = right;
	}
	public AVLNode<Type> getRight()
	{
		return right;
	}
	public String toString()
	{
		return String.valueOf(element);
	}
}