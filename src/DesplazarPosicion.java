public class DesplazarPosicion {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int count = a.length;
        int aux = a[a.length-1];
        for (int i = a.length-1; i > 0; i--) {
            a[i] = a[i-1];
        }
        a[0] = aux;

        for (int i = 0; i < count; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }


    }
}
