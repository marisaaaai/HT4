/**
 * 
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 Codigo extraido de 
 * Barrientos, D (2020) circular List Unknown version [Source code]https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/attachments/10558/circular.java?response-content-disposition=inline%3B%20filename%3D%22circular.java%22%3B%20filename%2A%3DUTF-8%27%27circular.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20200225%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200225T212802Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=03e95e4ba98bb356e1e8c49f1bc2eb6c40150094477ccf5097409a6f105b4a9e
 */
 public class CircularList<E> extends abstractList<E>{

	protected Node<E> tail; 
	protected int count;

	public CircularList(){
	// pre: constructs a new circular list
	
		tail = null;
		count = 0;
	}

	public E getFirst(){
		Node<E> temp = tail.next();
		return temp.value();
	}
	
	public void addFirst(E value){
	// pre: value non-null
	// post: adds element to head of list
		Node<E> temp = new Node<E>(value);
		if (tail == null) { // first value added
			tail = temp;
			tail.setNext(tail);
		} 
		else { // element exists in list
			temp.setNext(tail.next());
			tail.setNext(temp);
		}
		this.count++;
	}


	public void addLast(E value){
	// pre: value non-null
	// post: adds element to tail of list
    // new entry:
		addFirst(value);
		tail = tail.next();
	}


	public E remove(){
	// pre: !isEmpty()
	// post: returns and removes value
		Node<E> finger = tail;
		while (finger.next() != tail) {
			finger = finger.next();
		}
		// finger now points to second-to-last value
		Node<E> temp = tail;
		if (finger == tail){
			tail = null;
		} 
		else {
			finger.setNext(tail.next());
			tail = finger;
		}
		this.count--;
		return temp.value();
	}
	public int size(){
		// post: returns number of elements in list
		return count;
	}	
 }