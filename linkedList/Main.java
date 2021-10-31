class Main {

    Node head ;
    static class Node {
        int data ;
        Node next ;
        Node (int d )
        {
            data = d ; 
            next = null ;
        }
    }

    public void printList()
    {
        Node n = head ;
        while(n!= null)
        {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public void reverseList(Node node)
    {   
        Node prev = null;
        Node curr = node;
        Node next = null;
    
        while( curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
        }

        head = prev;
    }

    public static void main(String args[])
    {
        Main llist = new Main();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        llist.head.next = second;
        second.next=third;
        llist.printList();

        llist.reverseList(llist.head);

        llist.printList();

    }


}