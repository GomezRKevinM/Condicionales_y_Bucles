package ForthClass;

public class operadorTernario {

    public static void main(String[] args) {
        operando();
    }

    public static void operando() {
        boolean condicion = 100 == 10;

        String operador = condicion ? "100 no es igual a 10!" : "100 es igual a 10!";

        if(operador.equals("100 no es igual a 10!"))
            System.out.println("Ejecutando condicional con resultado de el operador");

        else
            System.out.println("El operador nos indica que 100 si es igual a 10 :c repara eso por favor");
    }
}
