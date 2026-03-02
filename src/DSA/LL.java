package DSA;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;

        }
    }
    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=node;
        }
        size=size+1;
    }

     public void insertAtLast(int value){
         if(tail == null){
             insertAtFirst(value);
             return;
         }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size=size+1;
     }
     public void insertAtIndex(int val , int idx){
        if(idx == 0){
            insertAtFirst(val);
            return;
        }
        if(idx == size){
            insertAtLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < idx;i++){
            temp =temp.next;
        }
        Node node = new Node(val , temp.next);
        temp.next=node;
     }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("End");
    }


}
