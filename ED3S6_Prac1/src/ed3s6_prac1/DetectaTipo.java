package ed3s6_prac1;

import java.util.Scanner;

public class DetectaTipo<T, U> {

    T num1;
    U num2;

    public DetectaTipo(T num1, U num2) {
        this.num1 = num1;
        this.num2 = num2;
        Detecta();
    }

    private void Detecta() {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            int inum1 = Integer.parseInt(num1.toString());
            int inum2 = Integer.parseInt(num2.toString());
            Scanner teclado = new Scanner(System.in);
            menu();
            int opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma es " + (inum1 + inum2));
                    break;
                case 2:
                    System.out.println("La resta es " + (inum1 - inum2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es " + (inum1 * inum2));
                    break;
                default:
                    throw new AssertionError();
            }
        } else if (num1 instanceof Double && num2 instanceof Double) {
            double inum1 = Double.parseDouble(num1.toString());
            double inum2 = Double.parseDouble(num2.toString());
            Scanner teclado = new Scanner(System.in);
            menu();
            int opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma es " + (inum1 + inum2));
                    break;
                case 2:
                    System.out.println("La resta es " + (inum1 - inum2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es " + (inum1 * inum2));
                    break;
                default:
                    throw new AssertionError();
            }
        } else if (num1 instanceof Float && num2 instanceof Float) {

        } else if (num1 instanceof String && num2 instanceof String) {
            System.out.println("la union de las cadenas es: " + num1 + " " + num2);

        } else if (num1 instanceof Character && num2 instanceof Character) {

        }
    }

    private void menu() {
        System.out.println("Menu de opciones");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("Que opcion deseas: ");
    }
}