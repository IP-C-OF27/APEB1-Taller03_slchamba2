public class Ejercicio09 {
       public static void main(String[] args) {
        // Declaración de variables 
        double valor1 = 81.0;
        double valor2 = 25.0;
        double multiplicador = 10.0;
        double limite = 50.0;        
        // Calculamos las raíces cuadradas
        double raiz1 = Math.sqrt(valor1); 
        double raiz2 = Math.sqrt(valor2);
        // Realizamos las operaciones
        double operacionMultiplicacion = raiz2 * multiplicador; 
        double operacionSuma = raiz1 + operacionMultiplicacion;         
        // Evaluamos la condición mayor o igual que 50 
        boolean esMayorOIgual = operacionSuma >= limite; 
        // Presentamos el resultado final
        System.out.println("El resultado de la expresion es: " + esMayorOIgual);
        System.out.println("El valor total de la operacion es: " + operacionSuma);
    }
}
