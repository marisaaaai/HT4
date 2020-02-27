/**
 * 
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 Codigo extraido de 
 * Barrientos, D (2020) Node Unknown version [Source code]https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/attachments/10519/node.java?response-content-disposition=inline%3B%20filename%3D%22node.java%22%3B%20filename%2A%3DUTF-8%27%27node.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20200225%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200225T220525Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=384374ac911d2beddc9c74a3d76dd56ee942b9a8e7e9681f4138c2e3e5a923b9
 */
public class Node<E>{
	protected E data; // value stored in this element
	protected Node<E> nextElement; // ref to next

	/**
	 * post: an element is constructed as the new head of list
	 * @param v v is a value, next is a reference to remainder of list
	 * @param next
	 */
	public Node(E v, Node<E> next){
		data = v;
		nextElement = next;
	}

	/**
	 * post: constructs a new tail of a list with value v
	 * @param v valor de la nueva cola de la lista
	 */
	public Node(E v){
		this(v,null);
	}

	/**
	 *
	 * @return reference to next node in list
	 */
	public Node<E> next(){
		return nextElement;
	}

	/**
	 * post: sets reference to new next value
	 * @param next Nodo que sera colocado al final de la lista
	 */
	public void setNext(Node<E> next){
		nextElement = next;
	}

	/**
	 * @return value associated with this node
	 */
	public E value(){
		return data;
	}

	/**
	 * pre: this node has a value
	 * post: this node has a new value
	 * @param value sets value associated with this element
	 */
	public void setValue(E value){
		data = value;
	}
}