package EstRepetitivas;

public class EjerciciosRepetitivos {
    public static void ejer41while() {
        int contador=1;
        int suma=0;
        while (contador<=20) {
            if (contador%2==0) {
                suma=suma+contador;
            }
            contador++;
        }
        System.out.println("La respuesta es:"+suma);

    }
    public static void main(String[] args) {
        ejer41while();
    }
}