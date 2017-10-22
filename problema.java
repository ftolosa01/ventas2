/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo7;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class problema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int j;
        int n=3;
        int suma=0;
        int maximo=0;
        int minimo=0;
        double promedio=0;
        int ventas[]= new int [n];
        Scanner intro = new Scanner(System.in);
        for (i = 0;  i< n; i++){ 
        do{
            System.out.println("ingrese ventas por dia"+i);
            ventas[i]=intro.nextInt();
        }while(ventas[i]<=0) ;  
            if(i<=15){
             suma = suma+ventas[i];
            }
        } 
        promedio=(double)(suma/15);
        System.out.println("el promedio de los primeros 15 dias son"+ promedio);
        for ( i = 0; i < n; i++) {
            if(ventas[i]>345000){
                System.out.println("la venta del dia " + (i+1) + " fue de " + ventas[i]);
            }
        }
        for (i = 0; i < n; i++) {
            if(ventas[i]>maximo){
                maximo =ventas[i];
            }
            if(i==0){
                maximo=ventas[i];
            }
        }
         System.out.println("el valor mayor de venta es : " + maximo);
        for ( i = 0; i < n; i++) {
            if(ventas[i]<minimo){
                minimo=ventas[i];
            }
            if(i==0){
                minimo=ventas[i];
            }
        }
        System.out.println("el valor menor de ventas es : " + minimo);
    }
    
}
