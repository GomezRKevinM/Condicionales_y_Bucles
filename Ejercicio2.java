package ForthClass;

// Objetivo: Escribir un programa que imprima todos los numeros pares del 1 al 50 usando While.
public class Ejercicio2 { // clase

    public static void main(String[] args) { // Metódo main

        int i = 1;
        while (i <=50){
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
