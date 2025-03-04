package main;

public class Queue {
   private static class Node{
       private int data;
       private Node next;
       public Node(int data,Node next){
           this.data=data;
           this.next=next;
       }

       public int getData() {
           return data;
       }

       public void setData(int data) {
           this.data = data;
       }

       public Node getNext() {
           return next;
       }

       public void setNext(Node next) {
           this.next = next;
       }
   }
   private int size=0;
   private Node front=null;
    private Node rear=null;

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(42);
        System.out.println(queue);



    }
   public void enqueue(int data){
       Node node =new Node(data,null);
       if(this.front==null&&this.rear==null){
           this.front=this.rear=node;
           this.size++;
       }else {
           this.rear.setNext(node);
           this.rear = node;
           this.size++;
       }
   }
   public int dequeue(){
        int response=-1;
        if(this.front!=null){
            response=this.front.getData();
            this.front=this.front.getNext();
            this.size--;
        }
        return response;
   }
    @Override
    public String toString() {
        StringBuilder result=new StringBuilder();
        result.append("[");
        Node temp=this.front;
        while(temp!=null){
            result.append(temp.getData());
            if(temp.getNext()!=null){
                result.append("--");
            }
            temp=temp.getNext();
        }
        result.append("]");
        return result.toString();
    }
}
