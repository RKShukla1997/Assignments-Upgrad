import java.util.*;

class Node{
	int data;
	Node next;
	Node prev;
	Node(int d){
		data=d;
		next=null;
		prev=null;
	}
}

public class DoublyLinkedList{
	Node head;
	Node tail;

	public void insertPos(int data,int pos){
		Node temp1 = new Node(data);
		int  count = 1;
		Node temp = head;
		if(temp == null){
			head = temp1;
		}
		else{
			while(count != pos){
				temp = temp.next;
				count++;
			}
			temp1.next = temp.prev.next;
			temp1.prev = temp.prev;
			temp.prev=temp1;
			temp.prev.next=temp1;
		}
	}

	public void insertEnd(int data){
		Node temp1 = new Node(data);
		Node temp = head;
		if(head == null){
			//System.out.println("List is Empty");
			head = temp1;
		}
		else{
			while(temp.next != null){
				temp=temp.next;
			}
			temp1.next=temp.next;
			temp1.prev=temp;
			temp.next=temp1;
			temp.next.prev=temp1;
		}
	}

	public void deletePos(int pos){
		int count=1;
		Node temp=head;
		if(temp==null){
			System.out.println("List is Empty");
		}
		else{
			while(count!=pos){
				temp=temp.next;
				count++;
			}
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
		}
	}

	public void insertBeg(int data){
		Node temp1 = new Node(data);
		Node temp = head;
		if(head == null){
			head = temp1;
		}
		else{
			temp1.next=temp;
			temp1.prev=temp.prev;
			//temp.prev.next=temp1;
			temp.prev=temp1;
			head = temp1;
		}
	}

	public void display(){
		Node temp = head;
		while(temp!=null){
		System.out.print(temp.data+" ");
		temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args){
		DoublyLinkedList ll = new DoublyLinkedList(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the LinkedList");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int x = sc.nextInt();
			ll.insertEnd(x);
		}
		ll.display();

		ll.insertBeg(55);
		ll.insertBeg(75);
		ll.display();
		ll.insertPos(65,3);
		ll.display();
		ll.deletePos(2);
		ll.display();
	
	}
}