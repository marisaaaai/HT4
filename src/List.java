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
	
	//post: we add on the first position the value that we logged as a parameter
	public void addFirst(E value);
	
	//post: we add on the last position of the list
	public void addLast(E value);
	
	//post:we remove and return the last element of the list
	public E getFirst();
	
	public E remove();
	

 }