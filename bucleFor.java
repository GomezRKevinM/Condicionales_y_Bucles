package ForthClass;

public class bucleFor {

    public static void main(String[] args) {
        usandoFor();
    }

    public static void usandoFor() {
    int[] numeros = new int[10];

        for(int i = 0; i < numeros.length;i++){
            numeros[i] = i+1;
            System.out.println(numeros[i]);
        }

    }
}
