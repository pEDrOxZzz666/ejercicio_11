/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import java.util.Scanner;

//Pedro A. Ruiz
public class Ejercicio_3 {
    
    public static void main (String[] args) {
    Scanner lector = new Scanner(System.in);
    int llegit, notesAcumulades;
    notesAcumulades = 0;
    int numNotes = 4;

    for (int i=0; i<numNotes; i++){
       System.out.print("Introdueix la nota (entre 0 i 10): ");
       llegit = lector.nextInt();
       lector.nextLine();
       if((llegit >= 0)&&(llegit <= 10)){
          notesAcumulades += llegit; 
       }
    }
    System.out.println("La nota mitjana és " + notesAcumulades/numNotes);
 }
    
}
