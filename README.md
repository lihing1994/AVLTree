# AVLTree
- AVL tree is self-balance binary search tree. The goal of this project is to implement the AVL tree data structure using Java programing language.
  After each element insert to the AVL Tree, the output information that print out in the command line should show the details of AVL tree.  

## How to Complier and run the code
- Steps

  1.Download the java source file, which named "AVLTreeTeste.java", to your desktop directory.
  
  2.Go to the command line. 
    (For Windows user, please press Win+R keys and type "cmd" then press enter key. 
    For MacOs user, please press command+space keys and type "terminal" and press enter key).
  
  3.Type "cd desktop" in command line.
  
  4.Type "javac AVLTreeTester.java" in command line.
  
  5.Type "java AVLTreeTester" in command line.
  
## Explaination to important function 
- Explaination for rotate_left and rotate_right fucntion
  ![CS146_Homework_4-2](https://user-images.githubusercontent.com/25276186/71612452-56669780-2b55-11ea-9e59-62fa9fcdf063.jpg)
  ![CS146_Homework_4-2](https://user-images.githubusercontent.com/25276186/71612486-90d03480-2b55-11ea-8bc7-38859b345e05.jpg)
  
  There are two prototypes for each function rotate_left and rotate_right. The function only
  takes one parameter is designed to perform single rotate left or rotate right. The function
  takes two parameters that are used to perform rotate left then rotate right operation.
  For example, when we insert elements 1,3 and 5 to the AVL tree, we just need to make the
  tree balance by one rotate operation, which is to rate left. Therefore, we just need to make the
  tree balance by calling the rotate_left function with only one parameter.<br/>
  ![CS146_Homework_4-2](https://user-images.githubusercontent.com/25276186/71612520-d0971c00-2b55-11ea-813c-4c663ec6e967.jpg)
  
  In some situations, when we try to perform the two operations to make the AVL tree balance,
  we need to make one of the children of the Node point to either the left side or right side of
  the Node’s parent. Therefore, the function with two parameters is needed in this situation.
  For example,when we insert elements 10,20,30,40,50 and 25 to the AVL tree, we need to do
  the rotate right then rotate left operation to make the AVL tree balance. In this case, we need
  to make 25 points to the right of the 20.
  ![CS146_Homework_4-2](https://user-images.githubusercontent.com/25276186/71612534-f3c1cb80-2b55-11ea-90ba-22400584b373.jpg)
- Explaination for balance fucntion
  As you can see in the picture below, the function, which named balance, use the post-order traversal to
  travel each node in the AVL tree and balance each node from the bottom of the tree to the top
  of the tree. The balance function use the height of each node to figure out which operations
  need to be performed.
  ![CS146_Homework_4-2](https://user-images.githubusercontent.com/25276186/71612605-6337bb00-2b56-11ea-9a8a-0b846c99d3ef.jpg)


## Test cases
- Insert 1,3,5,7,2,4,6,8,9,11,13 to the AVL tree and remove 13 at the end.
  ![CS146_Homework_4-2](https://user-images.githubusercontent.com/25276186/71612140-30d88e80-2b53-11ea-996b-cd36ef792050.jpg)
  ![CS146_Homework_4-2](https://user-images.githubusercontent.com/25276186/71612149-3d5ce700-2b53-11ea-9fdd-00d3fb0b10ad.jpg)
  ![CS146_Homework_4-2](https://user-images.githubusercontent.com/25276186/71612161-56fe2e80-2b53-11ea-96a7-56faf3031381.jpg)
    
- Insert 1,3,5,7,2,4,6,8,9,11,13 to the AVL tree and remove 7(the root) at the end.
  ![CS146_Homework_4-2](https://user-images.githubusercontent.com/25276186/71612195-8d3bae00-2b53-11ea-81ce-749cff945d84.jpg)

- Insert 1,3,5,7,2,4,6,8,9,11,13 to the AVL tree and remove 9 and 3 at the end.
  ![CS146_Homework_4-2](https://user-images.githubusercontent.com/25276186/71612226-cc69ff00-2b53-11ea-9dd4-9a29dda01891.jpg)

- An empty AVL tree and try to remove 10.
  ![CS146_Homework_4-2](https://user-images.githubusercontent.com/25276186/71612261-0a672300-2b54-11ea-9acf-33fec43394c4.jpg)

- Insert elements 10,20,30,40,50,25 and remove 20 at the end.
  ![CS146_Homework_4-2](https://user-images.githubusercontent.com/25276186/71612277-2c60a580-2b54-11ea-9f06-c66d0f68058d.jpg)

## Credit
- Hing Li
