/**
 * 
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 */
 class stackFactory{
	//Esta clase decide que implementacion de Stacks usar
	public Stack<E> getStack(int decision){
		if(decision==1){
			return new StackArrayList<E>();//Regresa ArrayList
		}
		else{
			if(decision==2){
				return new StackVector<E>();//Regresa Vector
			}
			else{
				return new StackArray<E>();//Regresa Array
			}
		}
	}
 }