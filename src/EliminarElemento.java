import java.util.Scanner;

public class EliminarElemento {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[a.length-1];
        Scanner s = new Scanner(System.in);
        int count = a.length;
        int eliminar;
        int posicion = 0;


        for (int i = 0; i < count; i++) {
            System.out.print("Ingrese un número entero: ");
            a[i] = s.nextInt();
        }
        System.out.println("El arreglo actual es: ");
        for (int i = 0; i < count; i++) {
            System.out.print("[" + a[i] + "];" );
        }
        System.out.print("\n\nIngrese el número que desea eliminar del arreglo: ");
        eliminar = s.nextInt();
        while(eliminar != a[posicion]) {
            posicion++;
        }
        System.out.println("El número a eliminar esta en la posición: " + posicion);

        for (int i = 0; i < count-1; i++) {
            if (i < posicion) {
                b[i] = a[i];
            } else b[i] = a[i+1];

        }
        System.out.println("\nEl nuevo arreglo es: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print("[" + b[i] + "];");
        }
    }
}
