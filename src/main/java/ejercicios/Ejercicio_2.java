package ejercicios;

import java.util.Scanner;

//Pedro A. Ruiz
public class Ejercicio_2 {
    
    //CONSTANTES - RANGOS Y NÚMERO INTENTOS
    public static final int RANGO_MIN = 0;
    public static final int RANGO_MAX = 20;
    public static final int NUM_INTENTOS = 5;
    //FIN DECLARACIÓN CONSTANTE
    
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        int valorUsuari = 0;
        int llegit;
        //int numIntents = 5; <- Variable innecesaria con las modificaciones
        //boolean valorNOk=true; <- Variable innecesaria con las modificaciones
        
        
        for (int i=0; i<NUM_INTENTOS;){
            System.out.print("Introdueix un valor enter entre " + RANGO_MIN + " i " + RANGO_MAX + ": ");
            llegit = lector.nextInt();
            lector.nextLine();
            if((llegit >= RANGO_MIN)&&(llegit <= RANGO_MAX)&&(llegit%2==0)){
               valorUsuari += llegit;                   
               i++; //Sólo incrementamos el valor de i si cumple rango y es par
            }      
        }
        System.out.println("Dada correcta. Has escrit " + valorUsuari);
    }
    
}
