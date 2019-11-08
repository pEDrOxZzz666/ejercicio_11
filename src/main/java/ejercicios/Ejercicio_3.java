package ejercicios;

import java.util.Scanner;

//Pedro A. Ruiz
public class Ejercicio_3 {

    //DECLARACION CONSTANTES
    public static final int NUM_NOTES = 4;
    public static final int RANGO_MIN = 0;
    public static final int RANGO_MAX = 10;
    //FIN DECLARACIÓN

    public static void main (String[] args) {
        
        //Entrada de datos
        Scanner lector = new Scanner(System.in);
        
        //Declaración de variables
        int llegit;
        float notesAcumulades = 0;        
        boolean salir = false;

        //Iniciamos el bucle
        for (int i=0; i<NUM_NOTES; i++){
            System.out.print("Introdueix la nota (entre 0 i 10): ");
            llegit = lector.nextInt();
            lector.nextLine();
            //Si la nota está en rango sumamos valor a notesAcumulades
            if((llegit >= RANGO_MIN)&&(llegit <= RANGO_MAX)){
                notesAcumulades += llegit; 
            }else // Si introducimos valor fuera rango salimos del bucle
            {
                i = NUM_NOTES;
                salir = true;
            }
        }        

        //En función del valor variable boolean "salir" imprimimos un mensaje
        if(!salir)//si el bucle ha finalizado correctamente...
        {
            float media = (notesAcumulades/NUM_NOTES); //cálculo media
            System.out.println("La nota mitjana és " + media);
        }else//Si el bucle ha finalizado por valor incorrecto...
        {
            System.out.println("Error, nota incorrecta.");
        }

    }

}
