package datastructures;

/**
 * Created by jpulipati on 7/19/17.
 */
public class linkedlist {

    class node{
        int data;
        node next;
        public node(int n){
            data = n;
            next = null;
        }
    }

    node first;

    public void insert(int n){
        first = insertRec(first,n);
    }

    public node insertRec(node first, int n){
        if(first == null)
            first = new node(n);
        else
            first.next = insertRec(first.next,n);
        return first;
    }

    public int sum(linkedlist l1, linkedlist l2){
        System.out.println("number1" );
        String number1 = getNumber(l1.first);
        System.out.println("number1-" + number1);
        System.out.println("number2-" );
        String number2 = getNumber(l2.first);
        System.out.println(number2);
        int sum = Integer.parseInt(number1) + Integer.parseInt(number2);
        return sum;
    }

    public String getNumber(node l){
        if(l==null)
            return "";
        else
            return l.data + getNumber(l.next);
    }

    node temp;
    public node reverse(node node){
        node next;
        node prev = null;
        node current = node;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public void print(node current){
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void swapPairs(node n){
        node temp = n;
       /* node prev;
        node curr = n;
        first = n.next;
        while(curr != null && curr.next.next != null){
            System.out.println(curr.next.next );
            prev = curr.next;
            curr.next = curr.next.next;
            prev.next = curr;
            curr = curr.next.next;
        }
        curr.next = null;
        curr.next.next = curr;
        return first;*/
        while (temp != null && temp.next != null) {

            /* Swap the data */
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }

    public static void main(String[] args){
        linkedlist linkedlist1 = new linkedlist();
        linkedlist1.insert(2);
        linkedlist1.insert(5);
        linkedlist1.insert(4);
        linkedlist1.insert(1);
        /*linkedlist linkedlist2 = new linkedlist();
        linkedlist2.insert(5);
        linkedlist2.insert(1);*/
       /* linkedlist linkedlist3 = new linkedlist();
        linkedlist1.print(linkedlist1.first);*/
        //int total = linkedlist3.sum(linkedlist1, linkedlist2);
        //node head = linkedlist1.reverse(linkedlist1.first);
        //linkedlist1.print(linkedlist1.first);
        //swap with pairs
        linkedlist1.swapPairs(linkedlist1.first);
        linkedlist1.print(linkedlist1.first);
    }
}
