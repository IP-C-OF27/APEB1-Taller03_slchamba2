public class Ejercicio10 {
    public static void main(String[] args) {
        // Resolver (√25 * 10 >= 100)
        double baseRaiz = 25.0;
        double raizCuadrada = Math.sqrt(baseRaiz); 
        double factorMultiplicacion = 10.0;
        double producto = raizCuadrada * factorMultiplicacion;
        // Evaluamos si 50 es mayor o igual a 100 
        boolean condicion1 = producto >= 100.0; 
        //Valores booleanos dados directamente en la expresión
        boolean valorTrue = true;
        boolean valorFalse = false;
        //Resolver (10 / 5 >= 2)
        double numerador = 10.0;
        double denominador = 5.0;
        double division = numerador / denominador;
        // 2.0 es mayor o igual a 2 
        boolean condicion2 = division >= 2.0;
        boolean resultadoFinal = (condicion1 && valorTrue) || valorFalse || condicion2;
        // Presentamos el resultado final 
        System.out.println("El resultado de la expresion logica es: " + resultadoFinal);
    }
}
