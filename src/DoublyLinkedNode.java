/**
 * 
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 Codigo extraido de 
 * Barrientos, D (2020) DoublyLinkedNode Unknown version [Source code]https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/attachments/10545/DoublyLinkedNode.java?response-content-disposition=inline%3B%20filename%3D%22DoublyLinkedNode.java%22%3B%20filename%2A%3DUTF-8%27%27DoublyLinkedNode.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20200225%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200225T214739Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=efabbc5408563490bda7e1dcdf9a248d31358dcec3ddcb92bfaf3082f4c8268a
 */
public class DoublyLinkedNode<E>{
	protected E data;
	protected DoublyLinkedNode<E> nextElement;
	protected DoublyLinkedNode<E> previousElement;

	public DoublyLinkedNode(E v,DoublyLinkedNode<E> next,DoublyLinkedNode<E> previous){
		data = v;
		nextElement = next;
		if (nextElement != null){
			nextElement.previousElement = this;
			previousElement = previous;
		}
		if (previousElement != null){
			previousElement.nextElement = this;
		}
	}

	public DoublyLinkedNode(E v){
	// post: constructs a single element
		this(v,null,null);
	}

	/**
	 * @return reference to next node in list
	 */
	public DoublyLinkedNode<E> next(){
		return nextElement;
	}

	/**
	 * @return value associated with this element
	 */
	public E value(){
		return data;
	}

	/**
	 * post: sets reference to new next value
	 * @param next Nodo que sera puesto despues en la lista
	 */
	public void setNext(DoublyLinkedNode<E> next){
		nextElement = next;
	}
}