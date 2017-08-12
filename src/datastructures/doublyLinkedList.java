package datastructures;

/**
 * Created by jpulipati on 7/13/17.
 */
public class doublyLinkedList {
    class dll{
        int data;
        dll left, right;
        dll(int data){
            this.data = data;
            left = right = null;
        }
    }

    dll firstnode;

    doublyLinkedList(){
        firstnode = null;
    }

    public void insert(int n){
        insertrec(firstnode, n);
    }

    public dll insertrec(dll node, int n){
        if(node == null){
            node = new dll(n);
            return node;
        }
        else{
            dll newNode = insertrec(node.right, n);
            node.right = newNode.left;
            newNode.left = node.right;
        }
        return node;
    }

    public void delete(){

    }

    public void traverse(){

    }

    public  static void main(String[] args){
     doublyLinkedList dl = new doublyLinkedList();
        dl.insert(10);
    }
}
