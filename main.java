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
		Scanner scan = new Scanner(System.in);
		String archivo = "datos.txt";
        File fichero = new File(archivo);
        Scanner s = null;
        //Variable en donde se guaradara todo lo que hay en la primera linea del archivo
        String linea="";
        //Se crea un try catch para controlar que si exista un archivo y si no, que no crashee el sistema
        try{
            //El scanner lee el archivo
            s = new Scanner(fichero);
            //Lo que se lee en el archivo se guarda en la variable linea
            linea = s.nextLine();
        }
        //Si el archivo no existe se manda el mensaje de error
        catch(Exception ex){
            System.out.println("Mensaje: " + ex.getMessage());
        }
        //Finalmente se cierra el archivo con el try catch por si no existe el archivo
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
        //Se guarda en un Array los split del string de la linea
        String [] datosArray = linea.split("\\s");
		System.out.println("La operacion Postfix que se desea realizar es la siguiente:");
		System.out.println(linea);
		System.out.println();
		System.out.println("Desea usar \n 1.Stacks \n 2. Listas");
		System.out.println("Ingrese el numero de la opcion que usted desea: ");
		int opcion1 = scan.nextInt();
		if (opcion1==1){
			System.out.println("Los Stacks que puede escoger son: \n1.ArrayList \n2.Vector \n3.Array");
			System.out.println("Ingrese el numero de la opcion que usted desea: ");
			int opcion2 = scan.nextInt();
			stackFactory sFactory = new stackFactory(opcion2);
		}
		else{
			if(opcion1==2){
				System.out.println("Las listas disponibles son: \n1.Simplemente encadenada \n2.Doblemente encadenadas \n3.Listas Circulares");
				System.out.println("Ingrese el numero de la opcion que usted desea: ");
				int opcion2 = scan.nextInt();
				listasFactory lFactory = new lFactory(opcion2);
			}
			else{
				System.out.println("Se ingreso una opción invalida");
			}
		}