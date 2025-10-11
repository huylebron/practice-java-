package LeetCode.Medium;


 class Node {
    int val;
    Node next;

    public  Node(int val ) {
        this.val = val;
        this.next = null;
    }
}

public class MyLinkedList {
     private Node head ;  // node clone
     private int size ; //length

    public MyLinkedList() {
        //khoi tao node gia
        head = new Node(0);
        size = 0 ;
    }
     // lấy giá trị , dữ liệu của nó (0) khong quan trong

    public int get ( int index ) {
        if ( index < 0 || index >=size  ){
            return -1 ;
        }

        Node curren = head.next;
        for( int i = 0 ; i < index ; i++ ) {
            curren = curren.next ;
        }
        return curren.val;
    }

    //them mot node voiw gia tri val vaof dau gianh sachs

    public void addAtHead( int val ) {
        addAtIndex(0, val);
    }

    public void addAtTail ( int val ) {
        addAtIndex(size , val);
    }


    private void addAtIndex(int index, int val) {
        // index hop le la [0 , size]
        if ( index < 0 || index > size ) {
            return;
        }

        Node prev = head ;
        for( int i = 0 ; i < index ; i++ ) {
            prev = prev.next  ;
        }

        Node newNode = new Node(val);
        newNode.next = prev.next ;
        prev.next = newNode ;
        size++ ;

    }

    public void deleteAtIndex ( int index )  {
        if ( index < 0 || index >= size) {
            return;
        }

        Node prev = head ;
        for ( int i = 0 ; i < index ; i++  ) {
            prev = prev.next ;
        }

        if ( prev.next != null) {
            prev.next = prev.next.next;
            size--;
        }
    }


}