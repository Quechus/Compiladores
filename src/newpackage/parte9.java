/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author service1
 */
public class parte9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;
        boolean valor = true;
        int index = 0;
        char caracter;

        int inicio = 0;
        int fin = 0;

        System.out.println("Ingrese una cadena");
        cadena = entrada.nextLine();
        entrada.close();

        while (index < cadena.length()) {
            valor = true;//CLAVEEEEEEEEEEEE
            caracter = cadena.charAt(index);
            switch (caracter) {
                case 'i'://CASI IF/INT
                    inicio = index;
                    index++;
                    if (index >= cadena.length()) {
                        break;
                    }//si el siguiente valor de index supera el limite lo corta
                    caracter = cadena.charAt(index);
                    switch (caracter) {
                        case 'f':
                            fin = index;
                            System.out.println("Palabra reservada desde " + inicio + " a " + fin);
                            break;
                        case 'n':
                            //inicio=index;
                            index++;
                            if (index >= cadena.length()) {
                                break;
                            }//si el siguiente valor de index supera el limite lo corta
                            caracter = cadena.charAt(index);
                            switch (caracter) {
                                case 't':
                                    fin = index;
                                    System.out.println("Palabra reservada desde " + inicio + " a " + fin);
                                    break;
                            }
                            break;
                    }
                    break;
                case 's'://CASO SWITCH
                    inicio = index;
                    index++;
                    if (index >= cadena.length()) {
                        break;
                    }//si el siguiente valor de index supera el limite lo corta
                    caracter = cadena.charAt(index);
                    switch (caracter) {
                        case 'w':
                            //inicio=index;
                            index++;
                            if (index >= cadena.length()) {
                                break;
                            }//si el siguiente valor de index supera el limite lo corta
                            caracter = cadena.charAt(index);
                            switch (caracter) {
                                case 'i':
                                    //inicio=index;
                                    index++;
                                    if (index >= cadena.length()) {
                                        break;
                                    }//si el siguiente valor de index supera el limite lo corta
                                    caracter = cadena.charAt(index);
                                    switch (caracter) {
                                        case 't':
                                            //inicio=index;
                                            index++;
                                            if (index >= cadena.length()) {
                                                break;
                                            }//si el siguiente valor de index supera el limite lo corta
                                            caracter = cadena.charAt(index);
                                            switch (caracter) {
                                                case 'c':
                                                    //inicio=index;
                                                    index++;
                                                    if (index >= cadena.length()) {
                                                        break;
                                                    }//si el siguiente valor de index supera el limite lo corta
                                                    caracter = cadena.charAt(index);
                                                    switch (caracter) {
                                                        case 'h':
                                                            fin = index;
                                                            System.out.println("Palabra reservada desde " + inicio + " a " + fin);
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case 'c'://CASO CASE/CHAR
                    inicio = index;
                    index++;
                    if (index >= cadena.length()) {
                        break;
                    }//si el siguiente valor de index supera el limite lo corta
                    caracter = cadena.charAt(index);
                    switch (caracter) {
                        case 'a':
                            //inicio=index;
                            index++;
                            if (index >= cadena.length()) {
                                break;
                            }//si el siguiente valor de index supera el limite lo corta
                            caracter = cadena.charAt(index);
                            switch (caracter) {
                                case 's':
                                    //inicio=index;
                                    index++;
                                    if (index >= cadena.length()) {
                                        break;
                                    }//si el siguiente valor de index supera el limite lo corta
                                    caracter = cadena.charAt(index);
                                    switch (caracter) {
                                        case 'e':
                                            //inicio=index;
                                            fin = index;
                                            System.out.println("Palabra reservada desde " + inicio + " a " + fin);
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case 'h':
                            //inicio=index;
                            index++;
                            if (index >= cadena.length()) {
                                break;
                            }//si el siguiente valor de index supera el limite lo corta
                            caracter = cadena.charAt(index);
                            switch (caracter) {
                                case 'a':
                                    //inicio=index;
                                    index++;
                                    if (index >= cadena.length()) {
                                        break;
                                    }//si el siguiente valor de index supera el limite lo corta
                                    caracter = cadena.charAt(index);
                                    switch (caracter) {
                                        case 'r':
                                            fin = index;
                                            System.out.println("Palabra reservada desde " + inicio + " a " + fin);
                                    }
                            }
                            break;
                    }
                    break;
                case 'b'://CASO BREAK
                    inicio = index;
                    index++;
                    if (index >= cadena.length()) {
                        break;
                    }//si el siguiente valor de index supera el limite lo corta
                    caracter = cadena.charAt(index);
                    switch (caracter) {
                        case 'r':
                            //inicio=index;
                            index++;
                            if (index >= cadena.length()) {
                                break;
                            }//si el siguiente valor de index supera el limite lo corta
                            caracter = cadena.charAt(index);
                            switch (caracter) {
                                case 'e':
                                    //inicio=index;
                                    index++;
                                    if (index >= cadena.length()) {
                                        break;
                                    }//si el siguiente valor de index supera el limite lo corta
                                    caracter = cadena.charAt(index);
                                    switch (caracter) {
                                        case 'a':
                                            //inicio=index;
                                            index++;
                                            if (index >= cadena.length()) {
                                                break;
                                            }//si el siguiente valor de index supera el limite lo corta
                                            caracter = cadena.charAt(index);
                                            switch (caracter) {
                                                case 'k':
                                                    fin = index;
                                                    System.out.println("Palabra reservada desde " + inicio + " a " + fin);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case 'f'://CASE FOR/FLOAT
                    inicio = index;
                    index++;
                    if (index >= cadena.length()) {
                        break;
                    }//si el siguiente valor de index supera el limite lo corta
                    caracter = cadena.charAt(index);
                    switch (caracter) {
                        case 'o':
                            //inicio=index;
                            index++;
                            if (index >= cadena.length()) {
                                break;
                            }//si el siguiente valor de index supera el limite lo corta
                            caracter = cadena.charAt(index);
                            switch (caracter) {
                                case 'r':
                                    fin = index;
                                    System.out.println("Palabra reservada desde " + inicio + " a " + fin);
                                    break;
                            }
                            break;
                        case 'l':
                            inicio = index;
                            index++;
                            if (index >= cadena.length()) {
                                break;
                            }//si el siguiente valor de index supera el limite lo corta
                            caracter = cadena.charAt(index);
                            switch (caracter) {
                                case 'o':
                                    inicio = index;
                                    index++;
                                    if (index >= cadena.length()) {
                                        break;
                                    }//si el siguiente valor de index supera el limite lo corta
                                    caracter = cadena.charAt(index);
                                    switch (caracter) {
                                        case 'a':
                                            inicio = index;
                                            index++;
                                            if (index >= cadena.length()) {
                                                break;
                                            }//si el siguiente valor de index supera el limite lo corta
                                            caracter = cadena.charAt(index);
                                            switch (caracter) {
                                                case 't':
                                                    fin = index;
                                                    System.out.println("Palabra reservada desde " + inicio + " a " + fin);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case 'w'://CASE WHILE
                    inicio = index;
                    index++;
                    if (index >= cadena.length()) {
                        break;
                    }//si el siguiente valor de index supera el limite lo corta
                    caracter = cadena.charAt(index);
                    switch (caracter) {
                        case 'h':
                            //inicio=index;
                            index++;
                            if (index >= cadena.length()) {
                                break;
                            }//si el siguiente valor de index supera el limite lo corta
                            caracter = cadena.charAt(index);
                            switch (caracter) {
                                case 'i':
                                    //inicio=index;
                                    index++;
                                    if (index >= cadena.length()) {
                                        break;
                                    }//si el siguiente valor de index supera el limite lo corta
                                    caracter = cadena.charAt(index);
                                    switch (caracter) {
                                        case 'l':
                                            //inicio=index;
                                            index++;
                                            if (index >= cadena.length()) {
                                                break;
                                            }//si el siguiente valor de index supera el limite lo corta
                                            caracter = cadena.charAt(index);
                                            switch (caracter) {
                                                case 'e':
                                                    fin = index;
                                                    System.out.println("Palabra reservada desde " + inicio + " a " + fin);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case 'd'://CASE DO//DOUBLE
                    inicio = index;
                    index++;
                    if (index >= cadena.length()) {
                        break;
                    }//si el siguiente valor de index supera el limite lo corta
                    caracter = cadena.charAt(index);
                    switch (caracter) {
                        case 'o':
                            //inicio=index;
                            int findo = index;
                            index++;
                            if (index >= cadena.length()) {
                                fin = index - 1;
                                System.out.println("Palabra reservada desde " + inicio + " a " + fin);
                                break;
                            }//si el siguiente valor de index supera el limite lo corta
                            caracter = cadena.charAt(index);
                            switch (caracter) {
                                case 'u':
                                    //inicio=index;
                                    index++;
                                    if (index >= cadena.length()) {
                                        System.out.println("Palabra reservada desde " + inicio + " a " + findo);
                                        break;
                                    }//si el siguiente valor de index supera el limite lo corta
                                    caracter = cadena.charAt(index);
                                    switch (caracter) {
                                        case 'b':
                                            //inicio=index;
                                            index++;
                                            if (index >= cadena.length()) {
                                                System.out.println("Palabra reservada desde " + inicio + " a " + findo);
                                                break;
                                            }//si el siguiente valor de index supera el limite lo corta
                                            caracter = cadena.charAt(index);
                                            switch (caracter) {
                                                case 'l':
                                                    //inicio=index;
                                                    index++;
                                                    if (index >= cadena.length()) {
                                                        System.out.println("Palabra reservada desde " + inicio + " a " + findo);
                                                        break;
                                                    }//si el siguiente valor de index supera el limite lo corta
                                                    caracter = cadena.charAt(index);
                                                    switch (caracter) {
                                                        case 'e':
                                                            fin = index;
                                                            System.out.println("Palabra reservada desde " + inicio + " a " + fin);
                                                            break;
                                                        default:
                                                            System.out.println("Palabra reservada desde " + inicio + " a " + findo);
                                                            break;
                                                    }
                                                    break;
                                                default:
                                                    System.out.println("Palabra reservada desde " + inicio + " a " + findo);
                                                    break;
                                            }
                                            break;
                                        default:
                                            System.out.println("Palabra reservada desde " + inicio + " a " + findo);
                                            break;
                                    }
                                    break;
                                default:
                                    fin = index - 1;
                                    System.out.println("Palabra reservada desde " + inicio + " a " + fin);
                                    break;
                            }
                            break;
                    }
                    break;
                default:
                    valor = false;
                    break;
            }//fuera del switch principal
            if (index >= cadena.length()) {
                break;
            }//si termina siendo el ultimo elemento de la cadena
            if (valor == false) {
                index++;
            }//CLAVEEEEEE
        }
    }
}
