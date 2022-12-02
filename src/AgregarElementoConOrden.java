import java.util.Arrays;
import java.util.Scanner;

public class AgregarElementoConOrden {
    public static void main(String[] args) {
        int[] a = new int[7];
        int numero, ultimo;
        int posicion = 0;
        Scanner s = new Scanner(System.in);
        int count = a.length;

        for (int i = 0; i < count; i++) {
            System.out.print("Ingrese un número entero: ");
            a[i] = s.nextInt();
        }
        ultimo = a[count-1];
        System.out.print("\nIngrese otro número entero: ");
        numero = s.nextInt();

        // recorro el arreglo buscando la posición en la que deberíamos ingresar el número
        while(posicion < count-1 && numero > a[posicion]){
            posicion++;
        }

        for (int i = count-1; i > posicion ; i--) {
            a[i] = a[i-1];
        }
        int[] b = new int[a.length+1];
        System.arraycopy(a,0, b,0, a.length);
        if(numero > ultimo){
            b[b.length-1] = numero;
        } else {
            b[posicion] = numero;
            b[b.length-1] = ultimo;
        }

        for (int i = 0; i < b.length; i++) System.out.println("a[" + i + "] = " + b[i]);
    }
}