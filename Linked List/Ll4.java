// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Ll4{
    Node head;
    private int size;
    
    Ll()  {
        this.size =0;
    }
    public class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data =data;
            this.next=null;
           
           
           size++;
           
        }
    }
    
    
    public void addFirst(int data)  {
        Node newNode = new Node(data);
        
        if(head==null)  {
            head=newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
        
    }
    
    public void addLast(int data) {   
        Node newNode=new Node(data);
        
        if (head==null) { 
            head=newNode;
            return;
        }
        Node currNode =head;
        while (currNode.next !=null) {			//this is a traverse part
            currNode = currNode.next;
        }
        currNode.next =newNode; void  
    }
    
    //Print
    
    public void printList()  {
        if (head==null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode !=null) {
            System.out.print(currNode.data +"->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    
    
    public int search(int data)  {
      
      if(head ==null) {
          
          return -1;
      }
        int index =0;
        Node  currNode=head;
        
        while (currNode !=null) { 
            
            if(currNode.data == data) {
                return index;
            }
            index++;
            currNode =currNode.next;
        }
        return -1 ;
        
    }
    
    
    
    
    public static void main(String args [])  {
        Ll list = new Ll();
        
        list.addFirst(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        
        list.printList();
        
        int element= 7;
        
      int  ans =list.search(7);
      
      if (ans==7) {
          System.out.println("notfound");
      }
      else {
          System.out.println("found "+ans);
      }
        
        
    }
    
}