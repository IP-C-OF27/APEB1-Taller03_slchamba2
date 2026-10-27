public class Ejercicio04 {
  public static void main(String[] args) {

        // Declaracion de variables
        double numerador = 20;
        double denominador = 1 + 3;
        double resultado;
        int numero = 2;
        int comparacion = 3;
        boolean respuesta;

        // Operaciones
        resultado = numerador / denominador + numero;

        // Comparacion
        respuesta = resultado >= comparacion;

        // Mostrar resultados
        System.out.println("Resultado de la operacion: " + resultado);
        System.out.println("¿El resultado es mayor o igual a 3?: " + respuesta);
    }
}
