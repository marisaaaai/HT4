/**
 * 
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 */
 class stackFactory<E>{
	//This class decides which stack to implement
	//the decision is based on a option that the user decided in the main class
	public Stack<E> getStack(int d){
		if(d==1){
			return new StackArrayList<E>();//it returns an arraylist
		} else if (d == 2) {
			return new StackVector<E>();//it returns a vector

		} else {
				return new StackArray<E>();//it returns an array
		}
	}
 }