//import java.util.*;
//public class linked_dsa_list {
//    Node head;
//    private int size;
//    linked_dsa_list()
//    {
//        size=0;
//    }
//    class Node{
//        String data;
//        Node next;
//
//        Node(String data)
//        {
//            this.data=data;
//            this.next= null;
//            size++;
//        }
//    }
////first operation to be performed= add-first/last;
//    //add first= adding an element in the first position of linked list;
//    //add last= adding an element in the last position of the linked list;
//    //generally add last operation is more complex;
//    //add-first
//    public void addFirst(String data)
//    {  Node AnewNode= new Node(data);
//        if(head==null)
//        {
//          head=AnewNode;
//          return;
//        }
//
//        AnewNode.next=head;
//        head=AnewNode;
//    }
//// add-last
//    public void addLast(String data){
//        Node newNodelastadd= new Node(data);
//        if(head==null)
//        {
//           head= newNodelastadd;
//           return;
//        }
//        Node currentNode= head;
//        while(currentNode.next!=null)
//        {
//            currentNode=currentNode.next;
//        }
//        currentNode.next= newNodelastadd;
//
//    }
//    //print the linked list
//    public  void printlist()
//    {   if(head==null)
//    {System.out.print("the linked list is empty");
//        return;}
//        Node currentNode= head;
//        while(currentNode!=null)
//        {
//            System.out.print(currentNode.data + "->");
//            currentNode=currentNode.next;
//        }
//        System.out.println("NULL");
//    }
//    //delete first
//    public  void deletefirst()
//    {
//        if(head==null)
//        {
//            System.out.println("there is nothing to delete");
//            return;
//        }
//        size--;
//        head=head.next;
//    }
//
//    // delete last
//    public void deleteLast()
//    {
//        if( head== null)
//        {
//            System.out.println("nothing to delete");
//            return;
//        }
//        size--;
//        if(head.next==null)
//        {
//            head= null;
//        }
//        Node secondLastNode=head;
//        Node lastNode=head.next;
//        while(lastNode.next!=null)
//        {
//           lastNode=lastNode.next;
//           secondLastNode=secondLastNode.next;
//        }
//        secondLastNode.next=null;
//    }
//// size of linked list
//    public  int getSize()
//    {
//       return size;
//    }
//    public static void main(String args[])
//    {
//        linked_dsa_list obj=new linked_dsa_list();
//        obj.addFirst("a");
//        obj.addFirst("is");
//        obj.printlist();
//        obj.addLast("list");
//        obj.printlist();
//        obj.addFirst("this");
//        obj.printlist();
//        int size1= obj.getSize();
//        System.out.println("Size of linked list is=" + size1);
//        obj.deleteLast();
//        obj.printlist();
//        int size2= obj.getSize();
//        System.out.println("Size of updated list is=" + size2);
//
//    }
//}
//hello world
//using linked list in the form of collection frameworks
//using collection frameworks we don't have to write all the code from scratch.
import java.util.*;
public class linked_dsa_list {
    public static void main(String args[])
    {
        LinkedList<String> list1=new LinkedList<String>();
        list1.addFirst("a");
        list1.addFirst("is");
        list1.addLast("list");
        list1.addFirst("this");
        System.out.println(list1);
        list1.removeLast();
        System.out.println(list1);
        int size=list1.size();
        System.out.println(size);
        list1.addLast("lovestory");
        int s2=list1.size();
        System.out.println(list1);
        System.out.println(s2);

        for (int i=0;i<s2;i++)
        {
            System.out.print(list1.get(i) + "->");
        }
        System.out.println("null");
   }
}