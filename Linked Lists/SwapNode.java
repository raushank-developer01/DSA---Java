public class SwapNode {
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

    public static Node swapNode(Node head, int x, int y){
        if(x == y) return head;

        Node currX = head;
        Node prevX = null;
        while(currX.data != x && currX != null){
            prevX = currX;
            currX = currX.next;
        }

        Node prevY =  null;
        Node currY = head;
        while(currY.data != y && currY != null){
            prevY = currY;
            currY = currY.next;
        }

        if(currX == null && currY == null) return head;
        
        if(prevX != null){
            prevX.next = currY;
        }else{
            head = currY;
        }

        if(prevY != null){
            prevY.next = currX;
        }else{
            head = currX;
        }
       
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node newNode = new Node(2);
        n1.next = newNode;

        newNode = new Node(3);
        n1.next.next = newNode;

        newNode = new Node(4);
        n1.next.next.next = newNode;

        newNode = new Node(5);
        n1.next.next.next.next = newNode;

        newNode = new Node(6);
        n1.next.next.next.next.next = newNode;

        newNode = new Node(7);
        n1.next.next.next.next.next.next = newNode;

        newNode = new Node(8);
        n1.next.next.next.next.next.next = newNode;

        int x = 2;
        int y = 4;

        n1 = swapNode(n1, x, y);
        printLinkedList(n1);
    }
}
