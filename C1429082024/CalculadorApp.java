package C1429082024;

import java.util.Scanner;

public class CalculadorApp {

    Scanner entrada = new Scanner(System.in);

    public String suma(Integer x, Integer y){
        return x + " + " + y + " = " + (x + y);
    }

    public String resta(Integer x, Integer y){
        return x + " - " + y + " = " + (x - y);
    }

    public String multiplicacion(Integer x, Integer y){
        return x + " * " + y + " = " + (x * y);
    }

    public String division(Float x, Float y){
        return y.equals(0f) ? "Error matemático: No se puede dividir por 0" : String.valueOf(x) + " / " + String.valueOf(y) + " = " + String.valueOf(x/y);
    }

    public String tablaDeMultiplicar(Integer x, Integer cantidad){
        for(int i = 1; i <= cantidad; i++){
            System.out.println(multiplicacion(x,i));
        }
        return "";
    }

    public static void main(String[] args) {

    }

    public void menu() {
        int opcion = -1;
        while(opcion != 0) {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Tabla De Multiplicar");
            System.out.println("0. Salir");
            System.out.println("Ingrese alguna operacion: ");

            opcion = entrada.nextInt();
            System.out.println();
            escogerOpcion(opcion);
            System.out.println();
        }
    }

    public void escogerOpcion(int opcion){
        int num1, num2;

        switch(opcion) {
            case 1:
                System.out.println("Ingrese el primer numero: ");
                num1 = entrada.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                num2 = entrada.nextInt();

                System.out.println();

                System.out.println("--Resultado--");
                System.out.println(suma(num1, num2));
                break;
            case 2:
                System.out.println("Ingrese el primer numero: ");
                num1 = entrada.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                num2 = entrada.nextInt();

                System.out.println();

                System.out.println("--Resultado--");
                System.out.println(resta(num1, num2));
                break;
            case 3:
                System.out.println("Ingrese el primer numero: ");
                num1 = entrada.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                num2 = entrada.nextInt();

                System.out.println();

                System.out.println("--Resultado--");
                System.out.println(multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println("Ingrese el primer numero: ");
                num1 = entrada.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                num2 = entrada.nextInt();

                System.out.println();

                System.out.println("--Resultado--");
                System.out.println(division(Float.valueOf(num1), Float.valueOf(num2)));
                break;
            case 5:
                System.out.println("Ingrese el numero: ");
                num1 = entrada.nextInt();
                System.out.println("Ingrese la cantidad: ");
                num2 = entrada.nextInt();

                System.out.println();
                System.out.println("--Tabla De Multiplicar--");
                tablaDeMultiplicar(num1, num2);
                System.out.println("-------------------------");
                System.out.println();
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
