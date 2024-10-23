package ForthClass;

// Objetivo: Crear un programa que sume todos los numeros del 1 al 10 usando un while
public class Ejercicio3 {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        int resultadoTrue = 1+2+3+4+5+6+7+8+9+10;
        while (i <10){
            i++; // aqui en el primer ciclo ya i == 2, segundo ciclo i == 3
            j += i;
        }
        String resultado = resultadoTrue == j ? "La suma es correcta! Ejercicio completado" : "Error, revisa tu código";
        System.out.println(resultado);
    }
}
