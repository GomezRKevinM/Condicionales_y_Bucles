package ForthClass;

public class bucleWhile {

    public static void main(String[] args) {
        EjecutandoWhile();
    }

    public static void EjecutandoWhile() {
        int numero = 10;
        while (numero!=15){
            System.out.println(numero + " No es igual a 15");
            numero++;
        }
    }
}
