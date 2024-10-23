package ForthClass;

public class Swicht {
    static int numero = 5;

    public static void main(String[] args) {
        probando();
    }

    public static void probando(){

        switch(numero){
            case 1: // sí numero equivale a 1
                // sentencia a ejecutar
            break;

            case 7: // sí numero equivale a 7
                System.out.println("El numero tiene un valor de 7");
            break;

            default: // si ninguna de las afirmaciones anteriores es correcta
                System.out.println("El numero no contiene un valor ni de 1 ni de 7, por ende numero es diferente a 1 y a 7");
            break;
        }

    }
}
