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
public class main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Calculadora calc = SingletonCalculadora.getInstance();
		Scanner scan = new Scanner(System.in);//instance a scanner that reads what the user writes when we ask them to
		String archive = "datos.txt";
		File fichero = new File(archive);
		Scanner s = null;
		//Variable where we keep all of the String that we can find on the txt
		String linea = "";
		//we create a try that tries to read txt that catches if the txt does not exist
		try {
			//the scanner reads the file
			s = new Scanner(fichero);
			//what the scanner reads it saves it on linea
			linea = s.nextLine();
		}
		//if the txt does not exist it prints the exception message
		catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		}
		//FInally we close the txt
		finally {
			try {
				if (s != null) {
					s.close();
				}
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
		//we create an array where we keep the splitted string
		String[] dataArray = linea.split("\\s");
		//We print the operation that the user has tried to solve using postfix notation
		System.out.println("La operacion Postfix que se desea realizar es la siguiente:");
		System.out.println(linea);
		System.out.println();
		//we ask the user if they want to implement a stack or a list
		System.out.println("Desea usar \n 1.Stacks \n 2. Listas");
		System.out.print("Ingrese el numero de la opcion que usted desea: ");
		int opcion1 = scan.nextInt(); //we save on opcion1 the decision that the user makes
		System.out.println();

		if (opcion1 == 2) {//if the user decided on a list we show him all the posibilities of lists that they can choose from
			System.out.println("Las listas disponibles son: \n1.Simplemente encadenada \n2.Doblemente encadenadas \n3.Listas Circulares");
			System.out.print("Ingrese el numero de la opcion que usted desea: ");
			int opcion2 = scan.nextInt();//we save in opcion2 the decision that they took
			List<Integer> myList = new listaFactory().getList(opcion2);
			boolean error = false;
			int i = 0;
			while (i < dataArray.length && !error) {
				try {
					//If it's a number it's pushed to the end of the list
					myList.addLast(Integer.parseInt(dataArray[i]));
				} catch (Exception e) {
					//If it's an operator we evaluate the expression

					if (myList.size() > 1) {
						if (dataArray[i].equals("+")) {
							myList.addLast(calc.sum(myList.remove(), myList.remove()));

						} else if (dataArray[i].equals("*")) {
							myList.addLast(calc.multiply(myList.remove(), myList.remove()));

						} else if (dataArray[i].equals("-")) {
							myList.addLast(calc.subs(-1 * myList.remove(), -1 * myList.remove()));

						} else if (dataArray[i].equals("/")) {
							int temp = myList.remove();
							myList.addLast(calc.divide(myList.remove(), temp));

						} else if (!dataArray[i].equals("") && !dataArray[i].equals(" ")) {
							//If it's neither a number nor an expression we say it's an error.
							System.out.println("La expresion tiene un operando no valido.");
							error = true;
						}
					} else {
						System.out.println("Ha ocurrido un error en la operacion. Asegurate de haberla escrito bien.");
						error = true;
					}
				}
				i++;
			}

			if(!myList.isEmpty() && !error)
				System.out.println("El resultado es: " + myList.remove());

		} else if (opcion1 == 1) { //if the user decides on a stack we show a menu with all the posibilities that the user can choose
			System.out.println("Los Stacks que puede escoger son: \n1.ArrayList \n2.Vector \n3.Array");
			System.out.print("Ingrese el numero de la opcion que usted desea: ");
			int opcion2 = scan.nextInt();//we save in opcion2 the decision that the user took
			Stack<Integer> myStack = new stackFactory().getStack(opcion2);
			int i = 0;
			boolean error = false;

			while (i < dataArray.length && !error) {
				try {
					//If it's a number it's pushed to the stack
					myStack.push(Integer.parseInt(dataArray[i]));
				} catch (Exception e) {
					//If it's an operator we evaluate the expression

					if (myStack.size() > 1) {
						if (dataArray[i].equals("+")) {
							myStack.push(calc.sum(myStack.pop(), myStack.pop()));

						} else if (dataArray[i].equals("*")) {
							myStack.push(calc.multiply(myStack.pop(), myStack.pop()));

						} else if (dataArray[i].equals("-")) {
							myStack.push(calc.subs(-1 * myStack.pop(), -1 * myStack.pop()));

						} else if (dataArray[i].equals("/")) {
							int temp = myStack.pop();
							myStack.push(calc.divide(myStack.pop(), temp));

						} else if (!dataArray[i].equals("") && !dataArray[i].equals(" "))  {
							//If it's neither a number nor an expression we say it's an error.
							System.out.println("La expresion tiene un operando no valido.");
							error = true;
						}
					} else {
						System.out.println("Ha ocurrido un error en la operacion. Asegurate de haberla escrito bien.");
						error = true;
					}
				}
				i++;
			}

			if(!myStack.empty() && !error)
				System.out.println("El resultado es: " + myStack.pop());
		} else{
				System.out.println("Se ingreso una opción invalida");
		}
	}
}