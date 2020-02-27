/**
 * @author men19195
 * @version 26/02/2020
 */

public class SingletonCalculadora {
    private static Calculadora instance;

    /**
     * Devuelve el objeto Calculadora de todo el proyecto
     * Pre: No había o sí había una calculadora
     * Post: Hay una calculadora
     * @return instance Calculadora del programa
     */
    public static Calculadora getInstance() {
        if(instance == null)
            instance = new Calculadora();

        return instance;
    }
}
