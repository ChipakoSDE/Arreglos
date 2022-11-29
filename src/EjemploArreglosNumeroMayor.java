import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 5 números:");
        int max = 0;
        for (int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }
        for (int i = 1; i < a.length; i++){
            max = (a[max] > a[i]) ? max : i;
        }
        System.out.println("El máximo valor ingresado es: " + a[max]);
    }
}