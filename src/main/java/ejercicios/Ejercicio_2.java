package ejercicios;

import java.util.Scanner;

//Pedro A. Ruiz
public class Ejercicio_2 {
    
    //CONSTANTES
    public static final int RANGO_MIN = 0;
    public static final int RANGO_MAX = 20;
    
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        int valorUsuari = 0;
        int llegit;
        int numIntents = 5;
        boolean valorNOk=true;
        
        
        for (int i=0; i<numIntents;){
            System.out.print("Introdueix un valor enter entre " + RANGO_MIN + " i " + RANGO_MAX + ": ");
            llegit = lector.nextInt();
            lector.nextLine();
            if((llegit >= RANGO_MIN)&&(llegit <= RANGO_MAX)&&(llegit%2==0)){
               valorUsuari += llegit; 
                   //es el mateix que  valorUsuari= valorUsuari + llegit
               i++;
            }
        }
        System.out.println("Dada correcta. Has escrit " + valorUsuari);
    }
    
}
