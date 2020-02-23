/**
 * 
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 * Barrientos, D (2020) List<E> Unknown version [Source code]https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/attachments/10517/list.java?response-content-disposition=inline%3B%20filename%3D%22list.java%22%3B%20filename%2A%3DUTF-8%27%27list.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20200223%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200223T230928Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=351472798d11ed0be7f031e668680d5fa2597974d9230ca8fb60bae3a35f814b
 */
 public interface List<E>{
	 
	//post: it returns the size of the list
	public int size();
	
	//post: returns true if the list is empty
	public boolean isEmpty();
	
	//post: clears the list
	public void clear();
	
	//post: we add on the first position the value that we logged as a parameter
	public void addFirst(E value);
	
	//post: we add on the last position of the list
	public void addLast(E value);
	
	//pre: the list has to not be empty
	//pro: we return the first element of the list
	public E getFirst();
	
	//pre: the list has to not be empty
	//post: it returns the last element of the list
	public E getLast();
	
	//pre: the list doesnt have to be empty
	//post: it remove the first element of the list
	public E removeFirst();
	
	//pre: the list isnt empty
	//post: removes last value of the list
	public E removeLast();
	
	//pre:list isnt empty
	//post removes the element of the "value" position
	public E remove(E value);
	
	//pre:
	//post: add element at the last or tail position
	public void add(E value);
	
	//pre: the list must not be empty
	//post: removes last value
	public E remove();
	
	//pre: list has at least one element
	//post: returns the last element
	public E get();
	
	//pre: value logged as paremeter must not be null
	//pro: returns true if the list contains an element equal to value
	public boolean contains(E value);
	
	//pre: parameter must not be null
	//post: returns 0-origin index of value or -1 if value not found
	public int indexOf(E value);
	
	//pre: parameter not null
	//post: returns ondex of value or -1 if value not found
	public int lastIndexOf(E value);
	
	//pre: i must be bigger than 0 but smaller than size
	//post returns the element on the i position
	public E get(int i);
	
	//pre:i must be bigger than 0 but smaller than size
	//post: sets the value of the list in the i position to o
	public E set(int i, E o);
	
	//pre: i must be bigger than 0 but smaller than size
	//post: it add the i elemnt of the list to o
	public void add(int i, E o);
	
	//pre: i must be bigger than 0 but smaller than size
	//post: removes and returns object found on the i position
	public E remove(int i);
	
	//post: returns an iterator that allowing ordered traversal of elements in list
	public Iterator<E> iterator();
	
 }