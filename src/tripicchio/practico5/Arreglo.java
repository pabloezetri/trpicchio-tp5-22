/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripicchio.practico5;

/**
 *
 * @author pablo
 */
public class Arreglo {
    
    public static void sumarLista(int numero[]){
        
        double suma = 0;
        double promedio = 0;
        
        for(int i=0;i<numero.length;i++){
        
            suma += numero[i];
        }
        promedio = suma / numero.length;
    
        
        System.out.println("Total suma:" + suma);
        System.out.println("El promedio de la misma es:" + promedio);
    }
    
    
    
    public static void buscarMayor(int arreglo2[][]){
        int mayor=0;
        for(int i=0;i<arreglo2.length;i++){
            for(int j=0;j<arreglo2[i].length;j++){
                System.out.print(arreglo2[i][j]+" ");
            if(mayor < arreglo2[i][j]){
                mayor = arreglo2[i][j];
            }
        }
            System.out.println();
        }
        System.out.println("-----------------");
        System.out.println("El numero mayor es: " + mayor);  
        
    }


    public static void cuentaVocales(String cadena){
        int cant=0;    
        for(int i=0;i<cadena.length();i++){

            if ((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u')){ 
               cant++; 
            }

        }
        System.out.println("La cantidad de vocales es: " + cant);
    }    
    
    
    public static void cuentaCaracter(String cadena, char caracter){
        int cantc=0;    
        for(int i=0;i<cadena.length();i++){

            if (cadena.charAt(i)==caracter){ 
               cantc++; 
            }

        }
        System.out.println("La cantidad de caracter " + caracter + ", que tiene la cadena es: " + cantc);
    }   
    
    
}
