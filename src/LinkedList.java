public class LinkedList {
    Node head;
    Node tail;
    int length;
    LinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length++;
    }

    public LinkedList() {

    }

    public void append(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public Node getTail() {
        return tail;
    }
    public void reverse(){
        Node temp=head;
        head=tail;
        tail=temp;
        Node before=null;
        Node after=temp.next;
        for (int i = 0; i < length; i++) {
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }

    public Node getHead() {
        return head;
    }
}
