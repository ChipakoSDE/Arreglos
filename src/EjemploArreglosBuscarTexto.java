import java.util.Scanner;

public class EjemploArreglosBuscarTexto {
    public static void main(String[] args) {
        String[] a = new String[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un texto: ");
            a[i] = s.next();
        }
        System.out.print("\nIngrese el texto a buscar: ");
        String buscar = s.next();

        int i = 0;
        /* en este ejemplo lo voy a hacer con un for
        while (i < a.length && a[i] != buscar) {
            i++;
        }
        */
        for (; i < a.length && !a[i].equalsIgnoreCase(buscar); i++) {}
        if (i == a.length){
            System.out.println("Texto no encontrado en el arreglo");
        } else if (a[i].equalsIgnoreCase(buscar)) {
            System.out.println("El texto " + buscar + " se encontró en la posición " + i);
        }
    }
}
