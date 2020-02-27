/**
 * 
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 * Barrientos, D (2020) List<E> Unknown version [Source code]https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/attachments/10517/list.java?response-content-disposition=inline%3B%20filename%3D%22list.java%22%3B%20filename%2A%3DUTF-8%27%27list.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20200223%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200223T230928Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=351472798d11ed0be7f031e668680d5fa2597974d9230ca8fb60bae3a35f814b
 */
 public interface List<E>{

	/**
	 * Barrientos, D (2020) List<E> Unknown version [Source code]https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/attachments/10517/list.java?response-content-disposition=inline%3B%20filename%3D%22list.java%22%3B%20filename%2A%3DUTF-8%27%27list.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20200223%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200223T230928Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=351472798d11ed0be7f031e668680d5fa2597974d9230ca8fb60bae3a35f814b
	 * post: it returns the size of the list
	 * @return tamano de la lista
	 */
	public int size();

	/**
	 * Barrientos, D (2020) List<E> Unknown version [Source code]https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/attachments/10517/list.java?response-content-disposition=inline%3B%20filename%3D%22list.java%22%3B%20filename%2A%3DUTF-8%27%27list.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20200223%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200223T230928Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=351472798d11ed0be7f031e668680d5fa2597974d9230ca8fb60bae3a35f814b
	 * post: returns true if the list is empty
	 * @return true si la lista está vacía
	 */
	public boolean isEmpty();

	/**
	 * Barrientos, D (2020) List<E> Unknown version [Source code]https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/attachments/10517/list.java?response-content-disposition=inline%3B%20filename%3D%22list.java%22%3B%20filename%2A%3DUTF-8%27%27list.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20200223%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200223T230928Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=351472798d11ed0be7f031e668680d5fa2597974d9230ca8fb60bae3a35f814b
	 * pre: La lista es de tamano n
	 * post: we add on the first position the value that we logged as a parameter y la lista se vuelve tamano n + 1
	 * @param value Valor que se desea agregarse a la lista
	 */
	public void addFirst(E value);

	/**
	 * Barrientos, D (2020) List<E> Unknown version [Source code]https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/attachments/10517/list.java?response-content-disposition=inline%3B%20filename%3D%22list.java%22%3B%20filename%2A%3DUTF-8%27%27list.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20200223%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200223T230928Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=351472798d11ed0be7f031e668680d5fa2597974d9230ca8fb60bae3a35f814b
	 * pre: La lista es de tamano n
	 * post: we add on the last position of the list y la lista se vuelve tamano n + 1
	 * @param value Valor que se desea agregar al inicio de la lista
	 */
	public void addLast(E value);

	/**
	 * Barrientos, D (2020) List<E> Unknown version [Source code]https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/attachments/10517/list.java?response-content-disposition=inline%3B%20filename%3D%22list.java%22%3B%20filename%2A%3DUTF-8%27%27list.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20200223%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200223T230928Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=351472798d11ed0be7f031e668680d5fa2597974d9230ca8fb60bae3a35f814b
	 * post:we remove and return the last element of the list
	 * @return el valor del primer elemento de la lista
	 */
	public E getFirst();

	/**
	 * Barrientos, D (2020) List<E> Unknown version [Source code]https://instructure-uploads.s3.us-east-1.amazonaws.com/account_111400000000000001/attachments/10517/list.java?response-content-disposition=inline%3B%20filename%3D%22list.java%22%3B%20filename%2A%3DUTF-8%27%27list.java&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJDW777BLV26JM2MQ%2F20200223%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20200223T230928Z&X-Amz-Expires=86400&X-Amz-SignedHeaders=host&X-Amz-Signature=351472798d11ed0be7f031e668680d5fa2597974d9230ca8fb60bae3a35f814b
	 * pre: La lista es de tamano n y no esta vacia
	 * post: La lista es de tamano n - 1 y el ultimo elemento deja de existir
	 * @return El valor del último elemento
	 */
	public E remove();
	

 }