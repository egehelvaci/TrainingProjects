package project4;


import project4.NodeS;

public class SinglyCircularList {
    
    
    private NodeS head = null;
    private NodeS tail = null;
    private NodeS temp = null;
    private int size = 0;

    
    public int getSize() {
        return size;
    }
    
    public void insert(int n) {
        NodeS node = new NodeS(n);
        node.next = tail;
        if (tail == null) {
            tail = node;
        } else {
            head.next = node;
        }
        head = node;
        size++;
         temp = tail ;
    }
   
    public NodeS getTemp(){
		return temp;
	}
    

    public int delete() {
        if (!isEmpty()) {
            NodeS deq = tail;
            tail = deq.next;
            size--;
            if (size == 0) {
                tail = null;
            }
            head.next = tail;
            return deq.num;
        } else {
            System.out.println("List Empty !!");
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    

    public void printList() {
        NodeS temp = tail;
        for (int i = 0; i <= size; i++) {
            if (temp != null) {
                System.out.print(temp.num);
                temp = temp.next;
            }
        }
        System.out.println();
    }
   
}