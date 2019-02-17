import java.util.*;

class Node{
	int data;
	Node next;

	Node(int d){
		this.data=d;
		next=null;
	}
}

	public class LinkedList{
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
			while(count != pos-1){
				temp = temp.next;
				count++;
			}
			temp1.next = temp.next;
			temp.next=temp1;
		}
	}

	public void deletePos(int pos){
		int count=1;
		Node temp=head;
		if(temp==null){
			System.out.println("List is Empty");
		}
		else{
			while(count!=pos-1){
				temp=temp.next;
				count++;
			}
			temp.next=temp.next.next;
			
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
			temp.next=temp1;
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
		LinkedList ll = new LinkedList(); 
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
	}
}