package datastructures;

public class BinarySearchTree{

    class node{
        node left;
        node right;
        int key;

        public node(int n){
            key = n;
            left = right = null;
        }
    }

    node root;
    //insert()
    //delete()
    //traverse()

    BinarySearchTree(){
        root = null;
    }


    public void insert(int key){
        //if root go here
            root = insertrec(root, key);
        // if not root go here

    }

    public node insertrec(node root, int key){
        if(root == null) {
            root = new node(key);
            return root;
        }
        if(key<root.key)
            root.left = insertrec(root.left,key);
        if(key>root.key)
            root.right = insertrec(root.right,key);

        return root;
    }

    public void display(String value){
        if(value.equals("inorder")){
            inorder(root);
        }
    }

    public void inorder(node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }
    boolean val1;
    boolean val2;
    public boolean isBSTMain(node root, int min, int max){

        if(root == null)
            return true;

        if(root.key < min || root.key > max)
            return false;

        return isBSTMain(root.left,min,root.key) && isBSTMain(root.right,root.key,max);
    }

    public boolean isBST(node root){

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        return isBSTMain(root,min,max);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(5);
        bst.insert(6);
        bst.insert(19);
        bst.insert(23);
        bst.insert(4);

        //valid BST
        System.out.println(bst.isBST(bst.root));

        bst.display("inorder");


    }
}
