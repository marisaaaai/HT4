/**
 * 
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 */
 //abstract class that implements the interface list
 public abstract class abstractList<E> implements List<E>{
	//pre:
	//post: returns true if the size of the list is 0
	public boolean isEmpty(){
		return size()==0;
	}
 }