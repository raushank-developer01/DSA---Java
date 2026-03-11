public class DeleteNAfterM {
    public static void printLinkedList(Node n1){
        while(n1 != null){
            System.out.print(n1.data + " -> ");
            n1 = n1.next;
        }
        System.out.println("null");
    }
    public static void deleteN(int M, int N, Node n1){
        if(M == 0){
            printLinkedList(null);
            return;
        }

        Node curr = n1;

        while(curr != null){
            for(int i = 1; i < M && curr != null; i++){
                curr = curr.next;
            }
            if(curr == null) break;
            
            Node temp = curr.next;
            for(int j = 1; j <= N && temp != null; j++){
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
        }
        printLinkedList(n1);
    }
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
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

        int M = 3;
        int N = 2;

        deleteN(M, N, n1);
    }
}
