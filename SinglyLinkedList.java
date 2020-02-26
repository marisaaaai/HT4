
public class SinglyLinkedList<E> extends abstractList<E>{

	protected int count; // list size
	protected Node<E> head; // ref. to first element

	public SinglyLinkedList(){
	// post: generates an empty list
		this.head = null;
		this.count = 0;
	}
  
	public void addFirst(E value){
		// post: value is added to beginning of list
		// note order that things happen:
		// head is parameter, then assigned
		head = new Node<E>(value, head);
		this.count++;
	}
  
	public E remove(){
	// pre: list is not empty
	// post: removes and returns value 
		Node<E> temp = head;
		head = head.next(); // move head down list
		this.count--;
		return temp.value();
	}
	
	public void addLast(E value){
	// post: adds value to end of list
    // location for new value
		Node<E> temp = new Node<E>(value,null);
		if (head != null){
			// pointer to possible tail
			Node<E> finger = head;
			while (finger.next() != null){
                finger = finger.next();
			}
			finger.setNext(temp);
		} 
		else{
			head = temp;
		}
		this.count++;
	  
	}
	
	public E getFirst()
	// pre: list is not empty
	// post: returns first value in list
	{
      return head.value();
	}	
	public int size(){
		// post: returns number of elements in list
		return count;
	}
	
}