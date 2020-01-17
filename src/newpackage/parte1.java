/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *Ejercicio: Identificadores (Supercadena)
 * @author service1
 */
public class parte1 {
    
    public static void main(String []args){
    
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
            if (Character.isLetter(caracter)||caracter=='_'){
                inicio=index;
                index++;
                if(index==cadena.length()){fin=inicio;System.out.println("identificador desde "+inicio+" hasta "+fin);}
                while(index<cadena.length()){
                    caracter=cadena.charAt(index);
                    if(Character.isLetter(caracter)||caracter=='_'){
                        index++;
                        if(index==cadena.length()){fin=index-1;System.out.println("identificador desde "+inicio+" hasta "+fin);}
                    }else{
                        fin=index-1;
                        System.out.println("identificador desde "+inicio+" hasta "+fin);
                        inicio=0;
                        fin=0;
                        break;
                    }
                }
            }
            index++;  
        }
        
    }
}
