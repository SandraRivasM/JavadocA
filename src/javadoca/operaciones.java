
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones matemáticas avanzadas.
 */
public class operaciones {
    /* funcion para dividir dos numeros
     * @param a primero numero a dividir
     * @param b segundo numero a dividir
     * @return el cociente de la division entre a y b
     * @throws IllegalArgumentException si el divisor es 0
     */
    
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return a % b;
    }

 /* funcion para calcular el cuadrado de un numero
  * @param a el numero a calcular
  @return el resultado de multiplicar el numero por si mismo
  */
    public int calcularCuadrado(int a) {
        return a * a;
    }
/* funcion para calcular la raiz cuadrada de un numero
 * @param a numero a calcular
 * @throw IllegalArgumentException si el numero es negativo
 * return la raiz cuadrada del numero
 */
    public double calcularRaizCuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }
}

