/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author USER
 */
public class LinkedList {
    
    Node head = null;
    static class Node{
    int data;
    Node next;
    public Node(int data  )
    {
        this.data=data;
        next = null;
    }        
    }
    
    public void insertfront(int data)
    {
       Node n = new Node(data);
       n.next=head;
       head= n;
    }
    
    public void insertAtPosition(Node tail,int data)
    {
        Node n= new Node(data);
        Node temp;
        temp=tail.next;
        tail.next=n;
        n.next=temp;
    }
    
    public void insertEnd(int data)
{
    Node n=new Node(data);
    Node temp=head;
    Node tail = null;
    while(temp!=null){
        tail=temp;
        temp=temp.next;
    }
    
    tail.next=n;
    n.next=null;
}

    public void delete(int data)
    {
        Node temp,tail=null;
        temp=head;
        while(temp!= null&&temp.data!=data)
        {
            tail=temp;
            temp = temp.next;
        }
        tail.next=temp.next;
    }
    
    public void printList()
    {
        Node temp=head;
        while(temp!= null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    } 
    
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node first = new Node(1);
        ll.head=first;
        
        Node second = new Node(2);
        first.next=second;
        Node tiga  = new Node(3);
        second.next = tiga;
        Node empat = new Node(4);
        tiga.next= empat;
        ll.insertfront(0);
        ll.insertAtPosition(tiga, 4);
        ll.insertEnd(0);
        ll.delete(2);
        ll.printList();
    }
      
    
}
