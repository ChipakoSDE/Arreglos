import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AgregarElemento {
    public static void main(String[] args) {

        int[] a = new int [10];
        int[] b = new int [a.length+1];
        int count = a.length;
        int nuevo, posicion, ultimo;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            System.out.print("Ingrese un número entero: ");
            a[i] = s.nextInt();
        }
        System.out.println("El arreglo actual es: ");
        for (int i = 0; i < count; i++) {
            System.out.print("[" + a[i] + "];");
        }

        System.out.print("\n\nIngrese el nuevo número: ");
        nuevo = s.nextInt();
        System.out.print("\nIngrese la posición en la que insertaremos el nuevo número: ");
        posicion = s.nextInt();
        ultimo = a[a.length-1]; // guardo el ultimo elemento del arreglo original
        for (int i = a.length-2; i >= posicion ; i--) {
            a[i+1] = a[i];
        }
        System.arraycopy(a,0, b, 0, a.length); //copio el array

        /*
        for (int i = 0; i < b.length-1; i++) {
            if (i < posicion) {
                b[i] = a[i];
            } else b[i+1] = a[i];
        }
        b[posicion] = nuevo;
        */

        b[posicion] = nuevo;
        b[b.length-1] = ultimo;
        System.out.println("\nEl nuevo arreglo es: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print("[" + b[i] + "];");
        }
    }
}
