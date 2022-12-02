import java.util.Arrays;
import java.util.Scanner;

public class DesplazarPosicionConOrden {
    public static void main(String[] args) {
        int[] a = new int[7];
        int numero;
        int posicion = 0;
        Scanner s = new Scanner(System.in);
        int count = a.length;

        for (int i = 0; i < count-1; i++) {
            System.out.print("Ingrese un número entero: ");
            a[i] = s.nextInt();
        }
        System.out.print("\nIngrese otro número entero entre " + a[0] + " y " + a[count-2] + ": ");
        numero = s.nextInt();
        if (numero > a[count-2]) {
            System.out.println("Por favor ingrese un número dentro del rango solicitado!");
            main(args);
            return;
        }

        // recorro el arreglo buscando la posición en la que deberíamos ingresar el número
        while(posicion < count-1 && numero > a[posicion]){
            posicion++;
        }

        for (int i = count-1; i > posicion ; i--) {
            a[i] = a[i-1];
        }
        a[posicion] = numero;

        for (int i = 0; i < count; i++) System.out.println("a[" + i + "] = " + a[i]);
    }
}
