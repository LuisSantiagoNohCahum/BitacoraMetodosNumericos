
package bitacorametodosnumericos;

import java.util.Scanner;

/*
Integrantes:
Luis Santiago Noh Cahum - 19070049
Maricel Del Rosario Puc Oy - 19070051
Jesus Israel Gamboa Ake - 19070041
 */
public class BitacoraMetodosNumericos {

    public static double evalua_raiz;
    public static double x1, x2;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, salida_menu;
        do {

            System.out.println("========= MENU ========= ");
            System.out.println("1.- Euler              ");
            System.out.println("2.- Ecuacion Cuadratica ");
            System.out.println("3.- Salir ");
            System.out.print("Seleccione su opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    int exponente,
                     cantidad_sumas;
                    double resultadoEx = 0;
                    System.out.print("Ingrese el valor del exponente: ");
                    exponente = teclado.nextInt();
                    System.out.print("Ingrese el numero de sumas a realizar para aproximar: ");
                    cantidad_sumas = teclado.nextInt();
                    for (int i = 0; i <= cantidad_sumas; i++) {
                        resultadoEx += (exponente(exponente, i)) / (factorial(i));
                    }
                    System.out.println("Resultado de e a la " + exponente + " = " + resultadoEx);
                    System.out.println("Resultado de e a la -" + exponente + " = " + 1 / resultadoEx);
                    salida_menu = 1;
                    break;

                case 2:
                    System.out.print("Ingrese el valor de A: ");
                    int a = teclado.nextInt();
                    System.out.print("Ingrese el valor de B: ");
                    int b = teclado.nextInt();
                    System.out.print("Ingrese el valor de C: ");
                    int c = teclado.nextInt();

                    FormGeneral(a, b, c);
                    FormAlter1(a, b, c);
                    salida_menu = 1;
                    break;
                case 3:
                    System.out.println("Gracias por usar el programa");
                    System.out.println("\n***************************\n");
                    salida_menu = 0;
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    salida_menu = 1;
                    break;

            }

        } while (salida_menu == 1);

    }

    static int factorial(int n) {
        if (n < 0) {
            return 0;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }

        }
    }

    static double exponente(int e, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return e * exponente(e, exp - 1);
        }

    }

    public static void FormGeneral(double valorA, double valorB, double valorC) {

        evalua_raiz = (Math.pow(valorB, 2) - (4 * (valorA * valorC)));
        if (evalua_raiz >= 0) {
            x1 = (-valorB + Math.sqrt(evalua_raiz)) / (2 * valorA);
            x2 = (-valorB - Math.sqrt(evalua_raiz)) / (2 * valorA);
            System.out.println("\nFormula General 1.1");
            System.out.println("El resultado de X1 es: " + x1 + "\nEl resultado de X2 es: " + x2);
            System.out.println();
        } else {
            System.out.println("\nFormula General 1.1");
            System.out.println("\nNo tiene soluciones por que no existen raices negativas");
        }

    }

    public static void FormAlter1(double valorA, double valorB, double valorC) {

        if (evalua_raiz >= 0) {

            x1 = (-2 * valorC) / (valorB + Math.sqrt(evalua_raiz));
            x2 = (-2 * valorC) / (valorB - Math.sqrt(evalua_raiz));
            System.out.println("\nFormula Alternativa 1.2");
            System.out.println("El resultado de X1 es: " + x1 + "\nEl resultado de X2 es: " + x2);
            System.out.println();
        } else {
            System.out.println("\nFormula Alternativa 1.2");
            System.out.println("\nNo tiene soluciones por que no existen raices negativas");
        }

    }
}
