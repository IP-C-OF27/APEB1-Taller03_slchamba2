public class Ejercicio07 {
     public static void main(String[] args) {
        // Declaracion de variables
        int numero = 81;
        int suma = 9;
        int denominador = 3;
        int numeroA = 10;
        int numeroB = 1;
        int dividendo = 100;
        int divisor = 25;
        int numeroRaiz = 100;
        // Calcular raices cuadradas
        double raiz1 = Math.sqrt(numero);
        double raiz2 = Math.sqrt(numeroRaiz);
        // Resolver las operaciones
        double resultado1 = (raiz1 + suma) / denominador;
        double resultado2 = (double) dividendo / divisor;
        // Evaluar las condiciones
        boolean condicion1 = resultado1 == 9;
        boolean condicion2 = numeroA > numeroB;
        boolean condicion3 = resultado2 >= raiz2;
        // Evaluar la expresion logica
        boolean respuesta = condicion1 || (condicion2 && condicion3);
        // Mostrar resultados
        System.out.println("Primera condicion: " + condicion1);
        System.out.println("Segunda condicion: " + condicion2);
        System.out.println("Tercera condicion: " + condicion3);
        System.out.println("Resultado final: " + respuesta);
    }
}
