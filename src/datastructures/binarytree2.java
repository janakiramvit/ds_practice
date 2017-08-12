package datastructures;

/**
 * Created by jpulipati on 7/18/17.
 */
public class binarytree2 {

    class node{
        node left, right;
        int data;
        public node(int n){
            data = n;
            left=right=null;
        }
    }

    node root;

    public void insert(int n){
       root = insertRec(root, n);
    }

    public node insertRec(node root, int n){
        if(root == null){
            root = new node(n);
            return root;
        }
        if(root.left == null){
            root.left = insertRec(root.left,n);
        }
        else
            root.right = insertRec(root.right,n);

        return root;

    }
    node prev;

    /*public int findroot(int n1, node root){

        if(root != null) {
            if (n1 == root.data){
                System.out.println("match " + n1 +" "+ root.right);
                return root.data;
            }
            prev = root;
            if (n1 == (findroot(n1, root.left))) {
                return prev.data;
            }else {
                prev = root;
                if (n1 == (findroot(n1, root.right))) {
                    return prev.data;
                }
            }
        }

        return prev.data;
    }*/
    public int depth(int n, node root){
        return getDepth(n,root,1);
    }

    public int getDepth(int n, node root, int depth){
        if(root == null)
            return 0;

        if(n == root.data)
            return depth;

        int level = getDepth(n, root.left, 1+ depth);
        if(level!=0)
            return level;

        level = getDepth(n,root.right,1+depth);
        return level;
    }



    public static void main(String[] args){
        binarytree2 binarytree2 = new binarytree2();
        binarytree2.insert(12);
        binarytree2.insert(11);
        binarytree2.insert(7);
        binarytree2.insert(71);
        binarytree2.insert(8);
        binarytree2.insert(9);
        binarytree2.insert(10);

        //int root1 = binarytree2.findroot(11,binarytree2.root);
        //int root2 = binarytree2.findroot(8,binarytree2.root);
        //System.out.println(root1 +" " + root2);
        System.out.println("depth is "+ binarytree2.depth(71, binarytree2.root));
        //System.out.println("parent is " + binarytree2.findroot());
        /*if(root1 == root2)
            System.out.println("LCA is " + root1);
        else{

        } //find depth of r1,r2; for element with greater depth,find root, check if equal or recurse
*/

    /*    if(root1 != root2)
            binarytree2.findroot()
*/
        //node lca = binarytree2.lca(10,11,binarytree2.root);
        //

    }
}
