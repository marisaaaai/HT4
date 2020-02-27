/**
 * 
 * @author men19195
 * @author mon19169
 * @date 23/02/2020
 */
 //Se importan los paquetes necesarios 
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList; 
public class main{
	public static void main(String[] args){
		Calculadora calc = new Calculadora();
		Scanner scan = new Scanner(System.in);//instance a scanner that reads what the user writes when we ask them to
		String archive = "datos.txt";
        File fichero = new File(archive);
        Scanner s = null;
        //Variable where we keep all of the String that we can find on the txt
        String linea="";
        //we create a try that tries to read txt that catches if the txt does not exist
        try{
            //the scanner reads the file
            s = new Scanner(fichero);
            //what the scanner reads it saves it on linea
            linea = s.nextLine();
        }
        //if the txt does not exist it prints the exception message
        catch(Exception ex){
            System.out.println("Mensaje: " + ex.getMessage());
        }
        //FInally we close the txt
        finally{
            try{
                if(s!=null){
                    s.close();
                }
            }
            catch(Exception ex2){
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        //we create an array where we keep the splitted string
        String [] dataArray = linea.split("\\s");
		//We print the operation that the user has tried to solve using postfix notation
		System.out.println("La operacion Postfix que se desea realizar es la siguiente:");
		System.out.println(linea);
		System.out.println();
		//we ask the user if they want to implement a stack or a list
		System.out.println("Desea usar \n 1.Stacks \n 2. Listas");
		System.out.println("Ingrese el numero de la opcion que usted desea: ");
		int opcion1 = scan.nextInt(); //we save on opcion1 the decision that the user makes
		if(opcion1==2){//if the user decided on a list we show him all the posibilities of lists that they can choose from
			System.out.println("Las listas disponibles son: \n1.Simplemente encadenada \n2.Doblemente encadenadas \n3.Listas Circulares");
			System.out.println("Ingrese el numero de la opcion que usted desea: ");
			int opcion2 = scan.nextInt();//we save in opcion2 the decision that they took
			List<Integer> myList = listaFactory.getList(opcion2);
			//List<Integer> myList = new SinglyLinkedList<Integer>();
			boolean wasNumber=false;
			boolean error=false;
			int counter=0;
			while(counter < dataArray.length && !error) {
				try {
					myList.addFirst(Integer.parseInt(dataArray[counter]));
					wasNumber = true;
            	} 
				catch(Exception ex) {
            		wasNumber = false;
            	}
				//If its not a number we evaluete the operation 
				System.out.println(myList.size());
				if(!wasNumber){
					if(myList.size()!=2){
						error=true;
						System.out.println("There has been an error in the operation, please check how you wrote it");
					}
					else{
						if(dataArray[counter].equals("+")){
							myList.addFirst(calc.sum(myList.remove(),myList.remove()));
						}
						else{
							if(dataArray[counter].equals("-")){
								myList.addFirst(calc.subs(-1*myList.remove(),myList.remove()));
							}
							else{
								if(dataArray[counter].equals("*")){
									myList.addFirst(calc.multiply(myList.remove(),myList.remove()));
								}
								else{
									if(dataArray[counter].equals("/")){
										try{
											int operand2=myList.remove();
											int operand1=myList.remove();
											myList.addFirst(calc.divide(operand1,operand2));
										}
										catch(Exception e){
											error=true;
											System.out.println("You have tried to divide something into 0");
										}
									}
									else{
										error=true;
										System.out.println("You have entered a value that we do not recognize, please revalue the expression. The sign was: "+dataArray[counter]);
									}
								}
							}
						}
					}
				}
				counter++;
			}
			if(myList.size() == 1 && !error){
				System.out.println("The result is: "+ myList.getFirst());
			}
			else{
				System.out.println("Something happened and the operation could not be executed");
			}
		}
		else{
			/*
			if (opcion1==1){ //if the user decides on a stack we show a menu with all the posibilities that the user can choose
				System.out.println("Los Stacks que puede escoger son: \n1.ArrayList \n2.Vector \n3.Array");
				System.out.println("Ingrese el numero de la opcion que usted desea: ");
				int opcion2 = scan.nextInt();//we save in opcion2 the decision that the user took
				stackFactory<Integer> sFactory = new stackFactory(); //we intance the stack factory with the parameter of the stack that the user took
				Stack<E> myStack = sFactory.getStack(opcion2);
			}			
			else{*/
				System.out.println("Se ingreso una opción invalida");
			//}
		}
	}
}