/**
 * 
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 */
 class listaFactory<E>{
	//This class decides which kind of list to implement
	//the decision is based on a option that the user decided in the main class

	/**
	 * Decide que tipo de Lista se devuelve dependiendo de el parametro d
	 * @param d Tipo de lista que se quiere hacer
	 * @return SinglyLinkedList cuando d = 1, DoublyLinkedList d = 2 y CircularList para cualquier otro caso
	 */
	public List<E> getList(int d){
		if(d==1){
			return new SinglyLinkedList<E>();//it returns a singly linked list

		} else if (d == 2) {
			return new DoublyLinkedList<E>();//it returns a doubly linked list

		} else{
				return new CircularList<E>();//it return a circular list
		}
	}
 }