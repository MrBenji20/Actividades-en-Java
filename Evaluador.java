package C1427082024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Lista
        List<String> materias = new ArrayList<>();
        materias.add("Matematica");
        materias.add("Lenguaje");
        materias.add("Historia");

        //Variables
        Float nota;
        Float suma = 0f;
        Float promedio;

        //Ingreso de notas por cada materia
        for (int i = 0; i < materias.size(); i++) {
            System.out.println("Ingresar el valor de la nota de " + materias.get(i) + ":");
            nota = sc.nextFloat();

            //validacion de la nota
            while (nota > 10 || nota < 0) {
                System.out.println("Error!!! Nota no aceptada");
                System.out.println("Ingresar el valor de la nota " + materias.get(i) + ":");
                nota = sc.nextFloat();
            }
            suma += nota; //se suma la variable nota por lo que se ingrese
        }

        System.out.println();

        //calculo el promedio
        promedio = suma / materias.size();
        System.out.println("Su promedio de notas es de " + promedio);

        //evaluacion segun el promedio
        if (promedio.equals(10)) {
            System.out.println("¡Excelente!");
        } else if (promedio > 5 && promedio <= 8) {
            System.out.println("Aceptable");
        } else if (promedio > 3 && promedio <= 5) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("No aprobado");
        }
    }
}
