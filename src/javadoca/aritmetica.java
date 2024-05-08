
package javadoca;

/**
 *
 * @author claramolinosaraiz

 */

public class aritmetica {

    /**
     * 
     *Suma dos números enteros.
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return La suma de los dos números enteros.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * 
     *Resta dos números enteros.
     * @param a El número entero del que se restará el segundo número.
     * @param b El número entero que se restará de a.
     * @return La el resultado de restar los  números enteros.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * 
     *Multiplica dos números enteros.
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return El resultado de la multiplicación de los dos números enteros.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El resultado de la división
     * @throws IllegalArgumentException Si el divisor es cero.
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}
