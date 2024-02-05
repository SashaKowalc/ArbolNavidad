package com.porfoliosasha.arbolitonavidad;

public class ArbolitoNavidad {

    public static void main(String[] args) {
        
        //Declarar la altura del arbolito
        int altura = 14;
        
        //Bucle para recorrer todas las filas del arbolito
        for (int fila = 0; fila < altura; fila++) {           
            //Bucle para los espacios
            for(int espacio = 0; espacio < (altura - fila - 1); espacio++) {
                System.out.print(" ");
            }
            //Bucle para los asteriscos
            for(int asterisco = 0; asterisco < (fila * 2) +1; asterisco++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //Tronco
        int largoTronco = 1;
        
        for(int base = 0; base < largoTronco; base++) {
        
            //Bucle para los espacios en blanco
            for (int espacio = 0; espacio < (altura - 2) ; espacio++) {
                System.out.print(" ");
            }
            
            //Bucle para las barritas del tronco
            for (int tronco = 0; tronco < 3; tronco++) {
                System.out.print("|");
            }
            
            System.out.println("");
            
        }
        
        
    }
}
