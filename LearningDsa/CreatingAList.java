public class CreatingAList
{
public Node head;
public Node last;
public int size;

public void insertAtHead(int value)
{
Node n= new Node(value);
size++;
if(head==null)
{
head=n;
last=n;
return;
}
n.next=head;
head=n;
} //INSERT AT HEAD CLOSED


public void insertAtLast(int value)
{
Node n= new Node(value);
size++;
if(head==null)
{
head=n;
last=n;
return;
}
last.next= n;
last= n;
size++;
} // INSERT AT LAST CLOSED

public void insertAtMiddle(int value, int position)
{
Node n= new Node(value);
size++;
if(head==null)
{
head=n;
last=n;
return;
}

Node temp= head;
for(int i=0; temp.next != null; i++)
{
if( i==position-1)
{
n.next= temp.next;
temp.next=n;
size++;
return;
}
temp= temp.next;
}
} //INSERT AT MIDDLE METHOD CLOSED

public void traverse()
{
 Node curr= head;
while(curr!=null)
{
System.out.print(curr.data+" ");
curr= curr.next;

}
} //TRAVERSE METHOD CLOSED

} //CLASS CLOSED





