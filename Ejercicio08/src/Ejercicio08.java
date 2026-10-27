public class Ejercicio08 {
    public static void main(String[] args) {
        // Declaracion de variables
        int numero1 = 10;
        int numero2 = 9;
        int suma = 20;
        int dividendo = 500;
        int divisor = 2;
        int base = 3;
        int exponente = 2;
        int limite = 200;
        int numero3 = 50;
        int numero4 = 50;
        int numero5 = 51;
        // Realizar las operaciones
        int multiplicacion = numero1 * numero2;
        int division = dividendo / divisor;
        int potencia = (int) Math.pow(base, exponente);
        int resultado1 = multiplicacion + suma - division + potencia;
        int resultado2 = numero3 - numero4 + numero5;
        // Evaluar las condiciones
        boolean condicion1 = resultado1 >= limite;
        boolean condicion2 = numero3 >= resultado2;
        // Resultado final con OR
        boolean respuesta = condicion1 || condicion2;
        // Mostrar resultados
        System.out.println("Primer resultado: " + resultado1);
        System.out.println("Segunda operacion: " + resultado2);
        System.out.println("Primera condicion: " + condicion1);
        System.out.println("Segunda condicion: " + condicion2);
        System.out.println("Resultado final: " + respuesta);
    }
}
