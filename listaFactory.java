/**
 * 
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 */
 class listaFactory{
	//This class decides which kind of list to implement
	//the decision is based on a option that the user decided in the main class
	public List<E> getList(int decision){
		if(decision==1){
			return new SinglyLinkedList<E>();//it returns a singly linked list
		}
		else{
			if(decision==2){
				return new DoublyLinkedList<E>();//it returns a doubly linked list
			}
			else{
				return new CircularList<E>();//it return a circular list
			}
		}
	}
 }