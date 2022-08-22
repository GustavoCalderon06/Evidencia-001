import java.util.Scanner;

public class Operaciones {
    public void init(){
        int[] arreglo = new int[8];
        Llenar_Rut(arreglo);
        mostrar_arr(arreglo);
        inv_arr(arreglo);
        mult_arr(arreglo);
        sumar_arr(arreglo);
    }
    public static int sumar_arr(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        int div = sum / 11;
        int mul = div*11;
        int res = sum - mul;
        int total = 11 - res;
        imprimirDigito(total);
        return sum;
    }
    public static void imprimirDigito(int total){
        if(total > 9 && total <11) {
            System.out.println("su digito verificador es 0");
        }else if(total > 10 && total <12){
            System.out.println("su digito verificador es k");

        }else{
            System.out.println("su digito verificador es: "+ total);
        }

    }


    public static int[] mult_arr(int[] array) {
        int mul = 2;
        for (int i = 0; i < array.length; i++) {
            if(mul==8){
                mul=2;
            } // en el if estamos siguiendo la serie que se nos pide
            array[i] *= mul;
            mul++;
        }
        return array;
    }

    public static int[] inv_arr(int[] array) {
        int aux;
        for (int i = 0; i < array.length / 2; i++) {
            aux = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = aux;
        }

        return array;
    }

    public static void mostrar_arr(int[] array) {

        for(int i=0;i< array.length;i++){
            System.out.print("["+array[i]+"]");
        }
        System.out.println(" ");
    }

    public static int[] Llenar_Rut(int[] array) {
        for(int i=0;i<array.length;i++) {
            System.out.println("ingrese el "+(i+1)+" digito de su rut");
            array[i]=ingresar();
        }
        return array;
    }
    public static int ingresar(){
        return new Scanner(System.in).nextInt();
    }

}
