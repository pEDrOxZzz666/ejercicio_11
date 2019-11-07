package ejercicios;

import java.util.Scanner;

//Pedro A. Ruiz
public class Ejercicio_2 {
    
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        int valorUsuari = 0;
        int llegit;
        int numIntents = 3;
        boolean valorNOk=true;
        for (int i=0; i<numIntents; i++){
            System.out.print("Introdueix un valor enter entre 0 i 5: ");
            llegit = lector.nextInt();
            lector.nextLine();
            if((llegit >= 0)&&(llegit <= 5)){
               valorUsuari += llegit; 
                   //es el mateix que  valorUsuari= valorUsuari + llegit
            }
        }
        System.out.println("Dada correcta. Has escrit " + valorUsuari);
    }
    
}
