import java.util.Arrays;
import java.util.Scanner;

public class EJ02PC02 {

    public static int validarNumero()
    {
        int entero=0;
        boolean flag = true;

        do {
            try {
                Scanner readint= new Scanner(System.in);
                entero = readint.nextInt();
                flag = false;
            }catch (Exception e){
                e.getMessage();
                System.out.println("Error: Ese no es un entero válido.");
                System.out.print("Ingrese un número valido: ");
                flag = true;
            }
        } while (flag);

        return entero;
    }

    public static int[] poblarPares( int tam){
        escan.escribirLn("Los números pares son: ");
        int[] A = new int[tam];
        for (int i = 1; i < tam+1; i++) {
            int numero=i*2;
            A[i-1] = numero;
            escan.escribirLn("["+numero+"]");
        }
        return A;
    }
    public static int[] poblarInpares( int tam){
        escan.escribirLn("Los números impares son: ");
        int[] B = new int[tam];
        int numero=1;
        for (int i = 0; i < tam; i++) {

            B[i] = numero;
            escan.escribirLn("["+numero+"]");
            numero+=2;
        }
        return B;
    }
    public static void mostrarArreglo( int[] list){
        escan.escribir("Orden Ascendente = { ");
        for (int i = 0; i < list.length; i++) {
            if ( i == list.length-1 )
                escan.escribir(list[i]+"");
            else
                escan.escribir(list[i] + ", ");
        }
        escan.escribirLn(" }");
    }


    public static void main(String[] args) {

        escan.escribir("Ingrese el tamaño del 1er Arreglo: ");
        int tam1 = validarNumero();
        int []A = poblarPares(tam1);

        escan.escribir("Ingrese el tamaño del 2do Arreglo: ");
        int tam2 = validarNumero();//6
        int []B = poblarInpares(tam2);

        // Bucles para sumar los dos arreglos 1 y 2
        int []C=new int[tam2+tam1];
        for(int i=0;i<(tam1);i++){
            C[i]=A[i];
        }
        int j=0;
        for(int i=tam1;i<(tam1+tam2);i++){
            C[i]=B[j];
            j++;
        }
        escan.escribirLn("**** SUMA DEL 1ER Y 2DO ARREGLO ****");
        Arrays.sort(C);//metodo para ordenar
        mostrarArreglo(C);

    }
}
/* SCAN
import java.util.Scanner;

public class scan {
    public scan() {
    }

    public static void escribir(String texto) {
        System.out.print(texto);
    }

    public static void escribirLn(String texto) {
        System.out.println(texto);
    }

    public static int leerEntero(String mensaje) {
        int entero = 0;
        Boolean flag = true;

        do {
            escribir("\t" + mensaje + ": ");
            Scanner teclado = new Scanner(System.in);

            try {
                entero = teclado.nextInt();
                flag = false;
            } catch (Exception var5) {
                escribirLn("Error: Ese no es un entero válido.");
                escribirLn("Intentalo nuevamente el proximo año.");
            }
        } while(flag);

        return entero;
    }

    public static double leerDecimal(String mensaje) {
        double decimal = 0.0;
        Boolean flag = true;

        do {
            escribir("\t" + mensaje + ": ");
            Scanner teclado = new Scanner(System.in);

            try {
                decimal = teclado.nextDouble();
                flag = false;
            } catch (Exception var6) {
                escribirLn("Error: Ese no es un entero válido.");
                escribirLn("Intentalo nuevamente el proximo año.");
            }
        } while(flag);

        return decimal;
    }

    public static String leertexto(String mensaje) {
        String texto = "";
        escribir("\t" + mensaje + ": ");
        Scanner teclado = new Scanner(System.in);
        texto = teclado.nextLine();
        return texto;
    }
}
*/

