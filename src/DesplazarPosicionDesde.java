import java.util.Scanner;

public class DesplazarPosicionDesde {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);
        int count = a.length;

        System.out.println("Ingrese 9 números enteros:");
        for (int i = 0; i < count-1; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Ingrese la posición en la que quiere insertar el nuevo número (de 0 a 9)");
        int posicion = s.nextInt();
        if (posicion < 0 || posicion > 9){
            System.out.println("Por favor ingrese un número entero entre 0 y 9");
            main(args);
            return;
        }
        System.out.println("Ingrese el número a insertar");
        int nuevo = s.nextInt();

        for (int i = count-1; i > posicion; i--) {
            a[i] = a[i-1];
        }
        a[posicion] = nuevo;

        for (int i = 0; i < count; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }


    }
}
