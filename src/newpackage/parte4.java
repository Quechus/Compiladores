
package newpackage;

import java.util.Scanner;

public class parte4 {
    
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
            case '&':
                inicio=index;
                index++;
                if(index>=cadena.length()){break;}//si el siguiente valor de index supera el limite lo corta
                caracter=cadena.charAt(index);
                switch(caracter){
                    case '&':
                        fin=index;
                        System.out.println("Operador logico desde "+inicio+" a "+fin);
                        break;
                    default:
                        break;
                }
                break;
            case '|':
                inicio=index;
                index++;
                if(index>=cadena.length()){break;}//si el siguiente valor de index supera el limite lo corta
                caracter=cadena.charAt(index);
                switch(caracter){
                    case '|':
                        fin=index;
                        System.out.println("Operador logico desde "+inicio+" a "+fin);
                        break;
                    default:
                        break;
                }
                break;
            
            case'!':
                inicio=index;
                fin=inicio;
                index++;
                caracter=cadena.charAt(index);
                System.out.println("Operador logico desde "+inicio+" a "+fin);
                break;
            }
            if(index>=cadena.length()){break;}//si termina siendo el ultimo elemento de la cadena
            index++;
        }
    }  
}
