public class Ejercicio06 {
    public static void main(String[] args) {
        // Declaracion de variables
        int numero = 81;
        int suma = 9;
        int denominador = 3;
        int numeroComparar = 9;
        int numeroA = 10;
        int numeroB = 1;
        // Calcular la raiz cuadrada
        double raiz = Math.sqrt(numero);
        // Calcular la operacion
        double resultado = (raiz + suma) / denominador;
        // Realizar las comparaciones
        boolean condicion1 = resultado == numeroComparar;
        boolean condicion2 = numeroA > numeroB;
        // Unir las condiciones con AND
        boolean respuesta = condicion1 && condicion2;
        // Mostrar resultados
        System.out.println("Resultado de la division: " + resultado);
        System.out.println("Primera condicion: " + condicion1);
        System.out.println("Segunda condicion: " + condicion2);
        System.out.println("Resultado final: " + respuesta);
    }
}
