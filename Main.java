package ForthClass;

public class Main {
    /* Tema: Condicionales y bucles */

    //Bucles: for, while, do-while
    //Condicionales: if, else if, else, swicht, operador ternario ( condicion ? true : false;)
    public static void main(String[] args) {

        boolean boleanOne = 1<0;
        boolean boleanTwo = 2<0;

        if(boleanOne || boleanTwo)
            System.out.println("Ejecutamos if");

        else if(boleanOne) {
            System.out.println("Ejecutamos else if");
            System.out.println("El boleanOnea es false, por ende su negación es true");
        }

        else
            System.out.println("Ejecutamos else");


    }
}
