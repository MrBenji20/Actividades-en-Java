import java.util.Scanner;

public class CorrecionQueTela {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in); // no es necesario hacer 3 variables scanner

        //Ronda de preguntas x materia
        //lenguaje
        System.out.println("--LENGUAJE");
        System.out.println("Ingresa tu nota");
        int notas = miScanner.nextInt(); //agrega el valor

        //validacion para el rango
        //si la nota ingresada no esta en el rango de 1-10 se hace el ciclo
        //para poder validar el valor
        while (notas > 10 || notas < 1) {
            System.out.println("La nota es invalida!!");
            System.out.println("Ingresa tu nota");
            notas = miScanner.nextInt(); //agrega el valor (sin el int porauqe la varianle se creo)
        } //si la nota es mayor a 10 o menor 1 se cierra el while

        //guardar valor
        int lenguaje = notas;

        //matematica
        //Ronda de preguntas x materia
        System.out.println("--Matematica");
        System.out.println("Ingresa tu nota");
        notas = miScanner.nextInt(); //agrega el valor

        //validacion para el rango
        //si la nota ingresada no esta en el rango de 1-10 se hace el ciclo
        //para poder validar el valor
        while (notas > 10 || notas < 1) {
            System.out.println("La nota es invalida!!");
            System.out.println("Ingresa tu nota");
            notas = miScanner.nextInt(); //agrega el valor (sin el int porauqe la varianle se creo)
        } //si la nota es mayor a 10 o menor 1 se cierra el while

        //guardar valor
        int matematica = notas;

        //biologia
        //Ronda de preguntas x materia
        System.out.println("--Biologia");
        System.out.println("Ingresa tu nota");
        notas = miScanner.nextInt(); //agrega el valor

        //validacion para el rango
        //si la nota ingresada no esta en el rango de 1-10 se hace el ciclo
        //para poder validar el valor
        while (notas > 10 || notas < 1) {
            System.out.println("La nota es invalida!!");
            System.out.println("Ingresa tu nota");
            notas = miScanner.nextInt(); //agrega el valor
        } //si la nota es mayor a 10 o menor 1 se cierra el while

        //guardar valor
        int biologia = notas;

        /** Mostrar resultados **/

        System.out.println("----- Informe ------");
            //QUIMICA//
        System.out.println("-- LENGUAJE:");
        if (lenguaje == 10) {
            System.out.println("Felicidades, aprobaste la materia");
        } else if (lenguaje > 5 && lenguaje <= 8) {
            System.out.println("Tienes una califición aceptable");
        } else if (lenguaje > 3 && lenguaje <= 5) {
            System.out.println("por poco, esta calificación es insuficiente");
        } else {
            System.out.println("No Aprobado");
        }

        System.out.println(); //un espacio para que se vea mas bonito :)

            //INGLEES//
        System.out.println("-- BIOLOGIA:");
        if (biologia == 10) {
            System.out.println("Felicidades, aprobaste la materia");
        } else if (biologia > 5 && biologia <= 8) {
            System.out.println("Tienes una calificación aceptable");
        } else if (biologia > 3 && biologia <= 5) {
            System.out.println("por poco, esta calificación es insuficiente");
        } else {
            System.out.println("No Aprobado");
        }

        System.out.println(); //un espacio para que se vea mas bonito :)
                //MATEMATICA/

        System.out.println("-- MATEMATICA:");
        if (matematica == 10) {
            System.out.println("Felicidades, aprobaste la materia");
        } else if (matematica > 5 && matematica <= 8) {
            System.out.println("Tienes una calificación aceptable");
        } else if (matematica > 3 && matematica <= 5) {
            System.out.println("por poco, esta calificación es insuficiente");
        } else {
            System.out.println("No Aprobado");
        }
    }
}
