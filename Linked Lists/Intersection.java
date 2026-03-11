public class Intersection {
    public static int mergePoint(Node n1, Node n2){
        while(n2 != null){
            Node temp = n1;
            while(temp != null){
                if(temp == n2){
                    return n2.data;
                }else{
                    temp = temp.next;
                }
            }
            n2 = n2.next;
        }
        return -1;
    }
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node n1, n2;
        n1 = new Node(1);
        n2 = new Node(6);

        Node newNode = new Node(2);
        n1.next = newNode;
        newNode = new Node(7);
        n2.next = newNode;

        newNode = new Node(3);
        n1.next.next = newNode;
        n2.next.next = newNode;

        newNode = new Node(4);
        n1.next.next.next = newNode;
        n2.next.next.next = newNode;

        newNode = new Node(5);
        n1.next.next.next.next = newNode;
        n2.next.next.next.next = newNode;

        System.out.println(mergePoint(n1, n2));
    }
}
