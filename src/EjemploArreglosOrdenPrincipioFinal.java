public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];
        int count = numeros.length;
        int count1 = a.length;


        for(int i = 0; i < count - i; i++) {
            System.out.print("numeros [" + i + "] = " + numeros[i]);
            System.out.println(" ; numeros [" + (count - 1 - i) + "] = " + numeros[count - 1 - i]);
        }
        int aux = 0;
        for(int i = 0; i < count1 - i; i++){
            a[aux++] = i + 1;
            a[aux++] = count1 - i;
        }
        for(int i = 0; i < count1; i++) {
            System.out.println("a [" + i + "] = " + a[i]);
        }
    }
}
