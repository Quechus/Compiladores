/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *Ejercicio: Operadores relacionales (Supercadena)
 * @author service1
 */
public class parte3 {
    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
	String cadena;
	boolean valor = true;
	int index = 0;
	char caracter;
        
        int inicio=0;
        int fin=0;
	
        System.out.println("Ingrese una cadena");
	cadena = entrada.nextLine();
        entrada.close();
        
        while(index<cadena.length()){
            caracter=cadena.charAt(index);
            switch (caracter){
            case '>':
                inicio=index;
                index++;
                if(index>=cadena.length()){System.out.println("Operador relacional desde "+inicio+" a "+inicio);break;}//si termina siendo el ultimo elemento de la cadena
                caracter=cadena.charAt(index);
                switch(caracter){
                    case '=':
                        fin=index;
                        System.out.println("Operador relacional desde "+inicio+" a "+fin);
                        break;
                    default:
                        fin=index-1;
                        System.out.println("Operador relacional desde "+inicio+" a "+fin);
                        break;
                }
                break;
            case '<':
                inicio=index;
                index++;
                if(index>=cadena.length()){System.out.println("Operador relacional desde "+inicio+" a "+inicio);break;}//si termina siendo el ultimo elemento de la cadena
                caracter=cadena.charAt(index);
                switch(caracter){
                    case '=':
                        fin=index;
                        System.out.println("Operador relacional desde "+inicio+" a "+fin);
                        break;
                    default:
                        fin=index-1;
                        System.out.println("Operador relacional desde "+inicio+" a "+fin);
                        break;
                }
                break;
            case'=':
                inicio=index;
                index++;
                if(index>=cadena.length()){System.out.println("Operador relacional desde "+inicio+" a "+inicio);break;}//si termina siendo el ultimo elemento de la cadena
                caracter=cadena.charAt(index);
                switch(caracter){
                    case '=':
                        fin=index;
                        System.out.println("Operador relacional desde "+inicio+" a "+fin);
                        break;
                    default:
                        fin=index-1;
                        System.out.println("Operador relacional desde "+inicio+" a "+fin);
                        break;
                }
                break;
            case'!':
                inicio=index;
                index++;
                caracter=cadena.charAt(index);
                switch(caracter){
                    case '=':
                        fin=index;
                        System.out.println("Operador relacional desde "+inicio+" a "+fin);
                        break;
                    default:
                        break;
                }
            }
            if(index>=cadena.length()){break;}//si termina siendo el ultimo elemento de la cadena
            index++;
        }
    }
    
    
        
    
    
}
