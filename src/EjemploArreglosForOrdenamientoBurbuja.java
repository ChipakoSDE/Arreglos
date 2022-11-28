import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void arregloInverso (String[] arreglo){ // método para invertir el orden de los elementos del array
        int count = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total; i++) {
            // recorro el array solo hasta la mitad e invierto el orden de los productos
            String actual = arreglo[i];
            String inverso = arreglo[count - 1 - i];
            arreglo[i] = inverso;
            arreglo[count - 1 - i] = actual;
            total--; //decremento el total después de cada iteración para llegar al punto de inflexión
        }

    }
    public static void sortBurbuja(Object[] arreglo){
        int count = arreglo.length;
        int contador = 0;
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    // si quiero cambiar entre ascendente y descendente modifico en el if el < 0 por > 0;
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("\nContador = " + contador);
    }
    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive 128Gb", "Samsung Galaxy S21", "Disco SSD Samsung externo", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta Generación", "Bicicleta Oxford"};
        int count = productos.length;

        sortBurbuja(productos);
        System.out.println("\n======== Recorriendo con for el array mutado ========");
        for (int i = 0; i < count; i++) {
            System.out.println("Para índice " + i + ": " + productos[i]);
        }

        /*
        // Arrays.sort(productos);
        int contador = 0;
        int contador2 = 0;
        for (int i = 0; i < count - 1; i++) { // no es necesario entrar la última vez porque en cada iteración va dejando
            // la palabra alfabéticamente superior en el último lugar disponible
            // este código se optimiza haciendo lo de abajo, con este código entraba al for 49 veces
            // for (int j = 0; j < count; j++) {
                if(productos[i].compareTo(productos[j]) < 0 ) {
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
             //
        // con la versión optimizada solo ingresa 18 veces
            for (int j = 0; j < count - 1 - i; j++) { // al restarle 1 e i va dejando los últimos lugares ocupados
            if (productos[j + 1].compareTo(productos[j]) < 0) {
                String auxiliar = productos[j];
                productos[j] = productos[j + 1];
                productos[j + 1] = auxiliar;
            }
            contador++;
            }
            }
         */


        Integer[] numeros = new Integer[4];

        numeros[0] = 107;
        numeros[1] = Integer.valueOf("2579");
        numeros[2] = 388;
        numeros[3] = -65;

        sortBurbuja(numeros);
        System.out.println("\n======== Recorriendo con for el array de números mutado ========");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Para índice " + i + ": " + numeros[i]);
        }

    }

}
