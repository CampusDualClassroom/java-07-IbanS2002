package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(10);
        //sumFirstNaturalNumbers(20);
        //showFirstNaturalNumbers(20);
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        // Crear la lista de números del 10 al 1
        List<Integer> numeros = new ArrayList<>();
        for (int i = 10; i >= 1; i--) {
            numeros.add(i);
        }

        // Buscar el elemento en la lista
        int posicion = numeros.indexOf(num);

        // Comprobar si se encontró o no
        if (posicion != -1) {
            // El elemento fue encontrado
            System.out.println("El elemento " + num + " se encuentra en la posición: " + (posicion + 1));
        } else {
            // El elemento no fue encontrado
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }

    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {

        int suma = num * (num + 1) / 2;
        System.out.println("Suma de los "+ num +" primeros numeros:"+suma);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {

        for (int i = 1; i <= num; i++) {
            // Mostrar el valor actual de 'i'
            System.out.println(i);
        }
    }

}
