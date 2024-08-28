package Actividad27082024;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibretaDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Utiliza un HashMap para almacenar las calificaciones de los estudiantes, donde la llave es el nombre del estudiante y el valor es un ArrayList de notas.
        Map<String, ArrayList<Float>> calificaciones = new HashMap<>();

        // Solicita al usuario que ingrese la cantidad de alumnos y la cantidad de notas por alumno.
        System.out.println("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = sc.nextInt();
        // Validación para negativo
        while (cantidadAlumnos <= 0) {
            System.out.println("Error!!! Parametro no aceptado");
            System.out.println("Ingrese la cantidad de alumnos: ");
            cantidadAlumnos = sc.nextInt();
        }

        System.out.println("Ingrese la cantidad de notas: ");
        int cantidadNotas = sc.nextInt();
        // Validación para negativo
        while (cantidadNotas <= 0) {
            System.out.println("Error!!! Parametro no aceptado");
            System.out.println("Ingrese la cantidad de notas: ");
            cantidadNotas = sc.nextInt();
        }
        System.out.println();


        // Solicita el nombre de cada alumno y las notas correspondientes, almacenándolas en el HashMap.
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese nombre del alumno " + (i + 1) + ":");
            String nombreAlumno = sc.next();
            ArrayList<Float> notas = new ArrayList<>();

            // Ingresa las notas
            for (int j = 0; j < cantidadNotas; j++) {
                System.out.println("Ingrese la nota " + (j + 1) + " de " + nombreAlumno + ":");
                System.out.println("Notas del 1-10 (Incluye decimales)");
                Float notaAlumno = sc.nextFloat();

                // Validación de la nota
                while (notaAlumno > 10 || notaAlumno < 0) {
                    System.out.println("Error!!! Nota no aceptada");
                    System.out.println("Ingrese la nota " + (j + 1) + " de " + nombreAlumno + ":");
                    System.out.println("Notas del 1-10 (Incluye decimales)");
                    notaAlumno = sc.nextFloat();
                }
                notas.add(notaAlumno);
            }
            calificaciones.put(nombreAlumno, notas);
            System.out.println();
        }

        System.out.println("---- Informe de Notas ----");

        /** Recorrer el HashMap y Evaluar Calificaciones **/
        for (String nombre : calificaciones.keySet()) {
            ArrayList<Float> notas = calificaciones.get(nombre);

            float sumaNotas = 0f;
            float promedio = 0f;
            float maxNotas = 0f;
            float minNotas = 10f;

            // Calcular la suma de notas, nota máxima y mínima
            for (Float nota : notas) {
                sumaNotas += nota;
                // Nota Máxima
                if (nota > maxNotas) {
                    maxNotas = nota;
                }
                // Nota Mínima
                if (nota < minNotas) {
                    minNotas = nota;
                }
            }

            // Calcular el promedio
            promedio = sumaNotas / notas.size();

            // Mostrar resultados
            System.out.println("-- " + nombre.toUpperCase());
            System.out.println("Notas: " + notas);
            System.out.println("Promedio: " + promedio);
            System.out.println("Nota Máxima: " + maxNotas);
            System.out.println("Nota Mínima: " + minNotas);
            System.out.println("-------------");
            System.out.println();
        }
        /** Menú de Opciones **/
        int op;
        do {
            System.out.println("---- Menu de opciones ----");
            System.out.println("1. Mostrar el Promedio de Notas por Estudiante.");
            System.out.println("2. Mostrar si la Nota es Aprobatoria o Reprobatoria por Estudiante.");
            System.out.println("3. Mostrar si la Nota está por Sobre o por Debajo del Promedio del Curso por Estudiante.");
            System.out.println("0. Salir del menu");
            System.out.println("Ingrese una opcion:");
            op = sc.nextInt(); //opcion a escoger
            System.out.println();

            //Mostrar devido a la opcion que se escogio
            switch (op) {
                case 1: // Muestra el promedio de notas por cada estudiante calculado previamente.
                    for (String nombre : calificaciones.keySet()) {
                        float sumaNotas = 0f;
                        float promedio = 0f;
                        ArrayList<Float> notas = calificaciones.get(nombre);
                        for (Float nota : notas) {
                            sumaNotas += nota;
                        }
                        promedio = sumaNotas / notas.size();

                        System.out.println("Promedio de " + nombre + ": "+ promedio);
                    }
                    break;

                case 2: // Mostrar si la Nota es Aprobatoria o Reprobatoria por Estudiante.
                    for (String nombre : calificaciones.keySet()) {
                        float aprobado = 4f;
                        int contador = 0;
                        ArrayList<Float> notas = calificaciones.get(nombre);
                        System.out.println("-- Ils nforme de " + nombre);

                        for (float nota : notas) {
                            contador++;
                            if (nota >= aprobado) {
                                System.out.println("Nota " + contador + ": Aprobado");
                            } else {
                                System.out.println("Nota " + contador + ": Reprobado");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3: // Mostrar si la Nota está por Sobre o por Debajo del Promedio del Curso por Estudiante.
                    float sumaTotal = 0f;
                    int notasTotal = cantidadAlumnos * cantidadNotas;

                    // Calcular la suma total de todas las notas del curso
                    for (String nombre : calificaciones.keySet()) {
                        ArrayList<Float> notas = calificaciones.get(nombre);
                        for (float nota : notas) {
                            sumaTotal += nota;
                        }
                    }

                    float promedioFinal = sumaTotal / notasTotal;

                    // Definir si la nota está por sobre el promedio
                    for (String nombre : calificaciones.keySet()) {
                        ArrayList<Float> notas = calificaciones.get(nombre);
                        int contador = 0;

                        System.out.println("-- Informe de " + nombre);
                        for (float nota : notas) {
                            contador++;
                            if (nota > promedioFinal) {
                                System.out.println("Nota " + contador + ": Sobre");
                            } else if (nota < promedioFinal) {
                                System.out.println("Nota " + contador + ": Debajo");
                            } else {
                                System.out.println("Nota " + contador + ": Es igual");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 0: // Salir del menú
                    System.out.println("Saliendo del menú...");
                    break;

                default:
                    System.out.println("Error!!\nIngrese un dato que se encuentre en el menú.");
                    break;
            }
            System.out.println();
        } while (op != 0);
        System.out.println("Hasta luego que tenga buen día!");
    }
}
