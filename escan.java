import java.util.Scanner;

public class escan {
    public escan() {
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
