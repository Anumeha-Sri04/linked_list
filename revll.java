import java.util.LinkedList;
import java.util.*;
public class reversing_ll {
    Node head;
    private int size;
    reversing_ll()
    {
        size=0;
    }
     class Node{
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next= null;
            size++;
        }
    }

    public void addFirst(String data)
    {  Node AnewNode= new Node(data);
        if(head==null)
        {
          head=AnewNode;
          return;
        }

        AnewNode.next=head;
        head=AnewNode;
    }
// add-last
    public void addLast(String data){
        Node newNodelastadd= new Node(data);
        if(head==null)
        {
           head= newNodelastadd;
           return;
        }
        Node currentNode= head;
        while(currentNode.next!=null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next= newNodelastadd;

    }
    //print the linked list
    public  void printlist()
    {   if(head==null)
    {System.out.print("the linked list is empty");
        return;}
        Node currentNode= head;
        while(currentNode!=null)
        {
            System.out.print(currentNode.data + "->");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }
    //delete first
    public  void deletefirst()
    {
        if(head==null)
        {
            System.out.println("there is nothing to delete");
            return;
        }
        size--;
        head=head.next;
    }

    // delete last
    public void deleteLast()
    {
        if( head== null)
        {
            System.out.println("nothing to delete");
            return;
        }
        size--;
        if(head.next==null)
        {
            head= null;
        }
        Node secondLastNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null)
        {
           lastNode=lastNode.next;
           secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }
// size of linked list
    public  int getSize()
    {
       return size;
    }
    public void reverseIteration()
    {   if(head == null || head.next == null)
      {
        return;
      }
        Node prev=head;
        Node curr=head.next;
        while(curr!=null)
        {
            Node Next=curr.next;
            curr.next=prev;

            //updating variables
            prev=curr;
            curr=Next;

        }
        head.next=null;
        head=prev;


    }
    public Node reverseRecursive(Node head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        Node newHead= reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }

    public static void main(String args[])
    {
        reversing_ll obj=new reversing_ll();
      obj.addLast("my");
      obj.addLast("name");
      obj.addLast("is");
      obj.addLast("Anumeha");
      obj.printlist();
      obj.head=obj.reverseRecursive(obj.head);
      obj.printlist();

    }
}
//going to push my first repo.
////using collection framework.
//import java.util.LinkedList;
//import java.util.*;
//public class reversing_ll {
//    public static void main(String args[])
//    {
//        LinkedList<String> dig= new LinkedList<String>();
//        dig.addFirst("Anumeha");
//        dig.addFirst("is");
//        dig.addFirst("name");
//        dig.addFirst("my");
//        System.out.println(dig);
//        int size=dig.size();
//        String curr="";
//        String prev="";
//        String Next="";
//        for(int i=0;i<size;i++)
//        {   prev= dig.get(i);
//            curr= dig.get(i++);
//            Next= dig.get(i+=2);
//
//        }
//
//    }
//}