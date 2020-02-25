/**
 * 
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 Codigo extraido de 
 * Barrientos, D (2020) DoublyLinkedList Unknown version [Source code]https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/attachments/10546/DoubleLinkedList.java?response-content-disposition=inline%3B%20filename%3D%22DoubleLinkedList.java%22%3B%20filename%2A%3DUTF-8%27%27DoubleLinkedList.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20200225%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200225T214811Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=50bab69f5b92dcfa4b0a5fadb87dbc86ce411150b38fb19eb399356df04f309d
 */
 public DoublyLinkedList<E> extends abstractList<E>{
	protected int count;
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;

	public DoublyLinkedList(){
	// post: constructs an empty list
		head = null;
		tail = null;
		count = 0;
	}


	public void addFirst(E value){
	// pre: value is not null
	// post: adds element to head of list
	// construct a new element, making it head
		head = new DoublyLinkedNode<E>(value, head, null);
		// fix tail, if necessary
		if (tail == null) {
			tail = head;
		}
		count++;
	}

	// pre: value is not null
	// post: adds new value to tail of list
	public void addLast(E value){
		// construct new element
		tail = new DoublyLinkedNode<E>(value, null, tail);
		// fix up head
		if (head == null){
			head = tail;
		}
		count++;
	}

	// pre: list is not empty
	// post: removes value from tail of list
	public E removeLast(){
		DoublyLinkedNode<E> temp = tail;
		tail = tail.previous();
		if (tail == null) {
			head = null;
		} 
		else {
			tail.setNext(null);
		}
		count--;
		return temp.value();
	}
}