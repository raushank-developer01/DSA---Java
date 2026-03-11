public class OddEven {
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }  
    }

    public static void printLinkedList(Node head){
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static Node oddEvenLinkedList(Node head){
        Node evenHead = null;
        Node evenTail = null;
        Node oddHead = null;
        Node oddTail = null;

        if(head == null) return null;

        Node curr = head;
        while(curr != null){
            if(curr.data % 2 == 0){
                if(evenHead == null){
                    evenHead = curr;
                    evenTail = curr;
                }else{
                    evenTail.next = curr;
                    evenTail = curr;
                }
            }else{
                if(oddHead == null){
                    oddHead = curr;
                    oddTail = curr;
                }else{
                    oddTail.next = curr;
                    oddTail = curr;
                }
            }
            curr = curr.next;
        }

        if(evenTail != null){
            evenTail.next = oddHead;
        }

        if(oddTail != null){
            oddTail.next = null;
        }

        return evenHead != null ? evenHead : oddHead;
    }
    public static void main(String[] args) {
        Node n1 = new Node(8);
        Node newNode = new Node(12);
        n1.next = newNode;

        newNode = new Node(10);
        n1.next.next = newNode;

        newNode = new Node(5);
        n1.next.next.next = newNode;

        newNode = new Node(4);
        n1.next.next.next.next = newNode;

        newNode = new Node(1);
        n1.next.next.next.next.next = newNode;

        newNode = new Node(6);
        n1.next.next.next.next.next.next = newNode;

        newNode = new Node(3);
        n1.next.next.next.next.next.next = newNode;

        n1 = oddEvenLinkedList(n1);
        printLinkedList(n1);
    }
}
