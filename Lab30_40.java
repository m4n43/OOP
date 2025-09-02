class Node {
    int item;
    Node next;
    public Node(int item) {
        this.item = item;
        this.next = null;
    }
}
class Stack {
    private Node top;
    private int size;
    public Stack() {
        top = null;
        size = 0;
    }
    public void push(int value) {
        Node n = new Node(value);
        n.next = top;
        top = n;
        size++;
    }
    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        int value = top.item;
        top = top.next;
        size--;
        return value;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public int numOfElement() {
        return size;
    }
    public int search(int value) {
        Node current = top;
        int pos = 1;
        while (current != null) {
            if (current.item==value)
                return pos;
            current=current.next;
            pos++;
        }
        return 0;
    }
    public void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        System.out.print("Cac phan tu la: ");
        while(current!=null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Lab30_40 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(15);
        s.push(20);
        s.display();
        System.out.println("Pop: "+s.pop());
        s.display();
        System.out.println("is empty?"+s.isEmpty());
        System.out.println("So phan tu: "+s.numOfElement());
        
        int sv=20;
        int pos = s.search(sv);
        if(pos!=0)
            System.out.println("Tim thay "+sv+"o "+pos);
        else 
            System.out.println("Khong tim thay "+sv);
    }
}