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
public class copia {
    
    public static void main(String[]args){
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
            valor=true;//CLAVEEEEEEEEEEEE
            caracter=cadena.charAt(index);
            switch (caracter){
                case'i'://CASI IF
                    inicio=index;
                    index++;
                    if(index>=cadena.length()){break;}//si el siguiente valor de index supera el limite lo corta
                    caracter=cadena.charAt(index);
                    switch(caracter){
                        case'f':
                            fin=index;
                            System.out.println("Palabra reservada desde "+inicio+" a "+fin);
                        break;
                        default:
                            System.out.println("Hello moto");
                            break;
                    }
                break;
                case'f'://CASE FOR
                    inicio=index;
                    index++;
                    if(index>=cadena.length()){break;}//si el siguiente valor de index supera el limite lo corta
                    caracter=cadena.charAt(index);
                    switch(caracter){
                        case'o':
                            //inicio=index;
                            index++;
                            if(index>=cadena.length()){break;}//si el siguiente valor de index supera el limite lo corta
                            caracter=cadena.charAt(index);
                            switch(caracter){
                                case'r':
                                    fin=index;
                                    System.out.println("Palabra reservada desde "+inicio+" a "+fin);
                                break; 
                            }
                        break;
                    }
                break;  
                default:
                    valor=false;//CLAVEEEEEEE
                    
            }
            
            if(index>=cadena.length()){break;}//si termina siendo el ultimo elemento de la cadena
            //index++;
            if(valor==false){index++;}//CLAVEEEEEE
            
         }   
    }
    
}
