/**
 * 
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 */
 class listaFactory{
	//Esta clase decide que implementacion de Stacks usar
	public List<E> getList(int decision){
		if(decision==1){
			return new SinglyLinkedList<E>();//Regresa Lista Simplemente encadenada
		}
		else{
			if(decision==2){
				return new DoublyLinkedList<E>();//Regresa Lista Doblemente encadenada
			}
			else{
				return new CircularList<E>();//Regresa Lista Circular
			}
		}
	}
 }