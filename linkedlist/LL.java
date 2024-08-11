package rohan.linkedlist;

public class LL {
    node head;
    private int size;
    void LL(){
        this.size=0;
    }
    public  class node{
        int data;
        node next;
        public node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(int data){
        node newNode = new node(data);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }
    public void addLast(int data){
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
        }
        node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void display(){
        node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-> ");
            currentNode = currentNode.next;
        }
    }
    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty");
        }
        head = head.next;
        size--;
    }
    public  void deleteLast(){
        if (head == null) {
            System.out.println("List is empty");
        }
        size--;
        if (head.next == null) {
            head = null;
        }
        node secondlast = head;
        node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }
    public int size(){
        return size;
    }
    public static void main(String[] args) {
        LL ll = new LL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.display();
        System.out.println();
        ll.addLast(5);
        ll.addLast(6);
        ll.display();
        System.out.println();
        ll.deleteFirst();
        ll.display();
        System.out.println();
        ll.deleteLast();
        ll.display();
        System.out.println();
        System.out.println(ll.size());
    }
}
