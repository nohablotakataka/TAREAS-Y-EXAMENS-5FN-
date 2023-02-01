import java.util.Scanner;

public class EJ02PC01 {

    public static int[] A;
    public static int tam1;
    public static int numero;

    // Validación de datos
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
                System.out.print("Ingrese el número valido: ");
                flag = true;
            }
        } while (flag);
        return entero;

    }

    // Imprimir el Arreglo
    public static void poblarArreglo(){
        A = new int[tam1];
        for (int i = 0; i < tam1; i++) {
            int num=i*numero;
            A[i] = num;
            System.out.println("["+num+"]");
        }

    }

    // Buscar un elementode
    public static int buscarElemento(int elemento){
        int posicion=0;
        for (int i=0;i<A.length;i++)
        {
            if (elemento==A[i])
            {
                posicion=i+1;
            }
        }

        return posicion;
    }

    public static int[] getPares(int tam, int[] list){
        int [] A= new int [tam]; // Almacen temporal
        int j=0; // Contador
        for (int i = 0; i < list.length; i++) {
            if(list[i]!=0)
            {
                if (list[i]%2==0){
                    A[j]=list[i];
                    j++;
                }
            }
            if(j==tam)break;// Valida y termina
        }
        return A;// Retorna resultado
    }


    public static void mostrarElementos( int[] list){
        escan.escribir("Los elementos del Arreglo son = { ");
        for (int i = 0; i < list.length; i++) {
            if ( i == list.length-1 )
                escan.escribir(list[i] + "");//Si no hay mas elementos imprimer espacio
            else
                escan.escribir(list[i] + ", ");// Si hay mas elemetnos imprimer con coma
        }
        escan.escribirLn(" }");
    }
    public static void main(String[] args) {

        escan.escribir("Ingrese el tamaño del Arreglo: ");
        tam1 = validarNumero();//new scanner (system.in)

        escan.escribir("Ingrese un número, para sacar su múltiplo: ");
        numero = validarNumero();
        poblarArreglo();


        mostrarElementos(A);
        escan.escribir("Ingrese un elemento del Arreglo que decea buscar: ");
        int elemento = validarNumero();
        int posicion = buscarElemento(elemento);
        escan.escribirLn("El elemento: "+elemento);
        escan.escribirLn("Se encuentra en la posición: " + posicion);
        escan.escribirLn("Del indice: " + (posicion-1));
        int tam2=0;
        for (int i = 0; i < tam1; i++) {
            if(A[i]!=0)
            {
                if (A[i]%2==0){
                    tam2++;
                }
            }
        }
        int[]B=getPares(tam2,A);

        escan.escribirLn("ELEMENTOS PARES");
        mostrarElementos(B);

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

