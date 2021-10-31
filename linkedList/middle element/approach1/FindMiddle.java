class FindMiddle{

    Node head ;

    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    void push(int data )
    {
        if(head == null)
        {
            head = new Node(data);
            return;
        }
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node ;

    }

    void printList()
    {
        Node curr = head; 
        while(curr.next != null)
        {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

    int findmiddleApproach1(){
        Node slowPtr = head;
        Node fastPtr = head;

        while(fastPtr.next.next != null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr.data;

    }

    void reverseList()
    {

        Node curr = head;
        Node prev = null;
        Node next = null ;
        while(curr != null)
        {
           next = curr.next;
           curr.next = prev ;
           prev = curr; 
           curr = next;
        }
        head = prev;
    }
    public static void main( String args[])
    {
        FindMiddle llist = new FindMiddle();

        for(int i = 0 ; i < 10 ; i++)
        {
            llist.push(i);
            
        }

        llist.printList();

        System.out.println("mid = " + llist.findmiddleApproach1());
        // revers llis
        llist.reverseList();
        llist.printList();

    }
}