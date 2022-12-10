class OnlyList
{

NodeNew head;
int size;

class NodeNew{
int data;
NodeNew next;

NodeNew(int data)
{
this.data= data;
this.next= null;
size++;
}
}

void headInsertion(int value)
{
NodeNew n= new NodeNew(value);
if(head==null)
{
head=n;
return;
}

n.next= head;
head=n;
}

void insertionAtMiddle(int value, int position)
{
NodeNew n= new NodeNew(value);
NodeNew temp= head;
if(head==null)
{
head=n;
return;
}

while(temp.next!=null)
{
int i=1;
if(i==position-1)
{
n.next=temp.next;
temp.next=n;
return;
}
temp=temp.next;
}
}

void searchInList(int value)
{
int position=1;
NodeNew curr= head;
while(curr!=null)
{
if(curr.data==value)
{
System.out.println("\ndata found at "+position+" postion");
//data=curr.data;
return;
}
curr= curr.next;
position++;
}

System.out.println("data not found");
}

void deleteFromHead()
{
if(head==null)
{
System.out.print("list is empty");
}
head=head.next;
size--;
}

void deleteFromMiddle(int position)
{
NodeNew curr= head;
NodeNew temp= head.next;
for(int i=1; i<size; i++)
{
if(i==position-1)
{
curr.next= temp.next;
size--;
return;
}
curr= curr.next;
temp= temp.next;
}
}

void deleteFromLast()
{
if(head==null)
{
System.out.print("\n list is already empty");
}

NodeNew last= head.next;
NodeNew secLast= head;

while(last.next!=null)
{
last= last.next;
secLast= secLast.next;
}
secLast.next= null;
size--;
}



void traverseList()
{
NodeNew temp= head;

while(temp != null)
{
System.out.print(temp.data+" ");
temp= temp.next;
}
System.out.print("\nSize="+size);
}

public static void main(String []args)
{
OnlyList ol= new OnlyList();
ol.headInsertion(3);
ol.headInsertion(4);
ol.headInsertion(5);
ol.headInsertion(6);
ol.headInsertion(7);
ol.headInsertion(8);
ol.headInsertion(9);
ol.headInsertion(14);
ol.traverseList();


/*ol.deleteFromHead();
System.out.println("\nafter deletion from head");
ol.traverseList();
System.out.println("\nafter deletion from middle");
ol.deleteFromMiddle(4);
ol.traverseList();
ol.deleteFromLast();
System.out.println("\nafter deletion from last");
ol.traverseList();
ol.searchInList(17);*/


System.out.println("\nafter calling middle function");
ol.insertionAtMiddle(13,2);
ol.insertionAtMiddle(12,3);
ol.insertionAtMiddle(11,4);
ol.insertionAtMiddle(10,5);
ol.traverseList();
ol.searchInList(3);
ol.searchInList(20);
ol.insertionAtMiddle(21,5);
ol.traverseList();
}
}

