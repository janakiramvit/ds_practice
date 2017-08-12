package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jpulipati on 7/14/17.
 */
//insert
//deletion
    //pre-order
    //top view, different views
    // min, max
    //least common ancestor
    //diameter
public class binaryTree {

    class node{
        node left;
        node right;
        int data;

        public node(int n){
            data = n;
            left = right = null;
        }
    }
    node root;

    binaryTree(){

    }

    public void insert(int n){
        root = insertrec(root,n);
    }

    public node insertrec(node root, int n){
        if(root == null){
            root = new node(n);
        }else {
            if (root.right == null)
                root.right = insertrec(root.right, n);
            else
                root.left = insertrec(root.left, n);
        }

        return root;
    }

    public void inorder(){
        inorderPrint(root);
    }

    public void inorderPrint(node root){
        if(root!=null){
            inorderPrint(root.left);
            System.out.println(root.data);
            inorderPrint(root.right);
        }
    }

    public void preorder(){
        preorderPrint(root);
    }

    public node preorderPrint(node root){
        if(root!= null){
            System.out.println(root.data);
            preorderPrint(root.left);
            preorderPrint(root.right);
        }
        return root;
    }

    public void delete(int n){

    }

    public void minimum(){
        System.out.println(minimum(root));
    }

    public int minimum(node root){
        //int data;

        if(root == null) {
        System.out.println(Integer.MIN_VALUE);
            return Integer.MIN_VALUE;
        }
        System.out.println(root.data);
        int data = root.data;
        int leftmin = minimum(root.left);
        int rightmin = minimum(root.right);
        return Math.max(data,Math.max(leftmin,rightmin));

    }

    Map<String, List<Integer>> map = new HashMap<>();

    public void comparator(binaryTree bt1,binaryTree bt2){
        // roots are equal
        // get left 3 elements from left tree, get left 3 elements from right tree
        // compare
        //Map<String,List<node>> map = new HashMap<>();
        System.out.println("bt1: " );
        compare(bt1.root,bt2.root);

        System.out.println(map.get("t1"));
        System.out.println(map.get("t2"));

        // get right 3 elements from left tree, get right 3 elements from right tree
        // compare

    }

    public node compare(node a,node b){

    return a;
    }

    List<List<Integer>> list = new ArrayList<>();

    //levelOrder()
    public void levelOrder(node root){
        int height;
        int lheight = findHeight(root.left);
        int rheight = findHeight(root.right);
        System.out.println("lheight:" + lheight);
        System.out.println("rheight:" + rheight);
        if(lheight > rheight)
            height = lheight;
        else
            height = rheight;
        System.out.println("height:" + height);
        for(int i = 1; i<=height;i++){
            list.add(new ArrayList<>());
            System.out.println("Elements for level: " + list);
            printElements(root, i,i);
        }
        System.out.println(list);
    }

    public int printElements(node root, int level,int l){
        if(root == null)
            return -1;
        if(level == 1)
            return root.data;
        if(level > 1) {
            list.get(l).add(printElements(root.left, level - 1,l));
            list.get(l).add(printElements(root.right, level - 1,l));
        }
        return -1;
    }

    public int findHeight(node root){
        if(root == null)
            return 0;
        return 1+findHeight(root.left) + findHeight(root.right);
    }

    public static void main(String[] args){
        binaryTree binaryTree1 = new binaryTree();
        binaryTree1.insert(10);
        binaryTree1.insert(11);
        binaryTree1.insert(2);
        binaryTree1.insert(3);
        binaryTree1.insert(5);
        System.out.println("Inorder is: ");
        binaryTree1.inorderPrint(binaryTree1.root);
        System.out.println("Pre-order is: ");
        binaryTree1.preorder();
        //level order traversal
        System.out.println("Level-order is: ");
        binaryTree1.levelOrder(binaryTree1.root);
      /*  binaryTree1.delete(5);

        binaryTree binaryTree2 = new binaryTree();
        binaryTree2.insert(10);
        binaryTree2.insert(11);
        binaryTree2.insert(2);
        binaryTree2.insert(3);
        binaryTree2.insert(5);

        binaryTree binaryTree = new binaryTree();
        binaryTree.comparator(binaryTree1,binaryTree2);*/

    }
}
