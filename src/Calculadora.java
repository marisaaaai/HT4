/**
 * @author men19195
 * @author mon19169
 * @date 25/02/2020
 */
public class Calculadora {

	/**
	 * Realiza una suma
	 * @param operando1
	 * @param operando2
	 * @return resultado de la suma
	 */
	public int sum(int operando1, int operando2) {
            return operando1 + operando2;
	}

	/**
	 * Realiza una resta
 	 * @param operando1 valor original
	 * @param operando2 Valor que se le restara al operando1
	 * @return resultado de la resta
	 */
	public int subs(int operando1, int operando2) {
            return operando1 - operando2;
	}

	/**
	 * Realiza una multiplicacion
	 * @param operando1
	 * @param operando2
	 * @return resultado de la multiplicacion
	 */
	public int multiply(int operando1, int operando2) {
            return operando1 * operando2;
	}

	/**
	 * Realiza una division
	 * @param operando1 Cociente
	 * @param operando2 Denominador
	 * @return Resultado de la división
	 */
	public int divide(int operando1, int operando2) {
            return operando1 / operando2;
	}
}