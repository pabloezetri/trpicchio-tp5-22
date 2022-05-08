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
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int numero[] = {23,52,56};
        
        int [] numero = new int[5]; 
        
        for(int i=0;i<numero.length;i++){
            numero[i] = (int)(Math.random()*9);
        }
        
        Arreglo.sumarLista(numero);
   
        System.out.println("---------------------------------------");
        
        
        int [][] arr2 = new int[5][5];
        
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]= (int)(Math.random()*9);            
            }
        }    
        
        Arreglo.buscarMayor(arr2);  
        
        System.out.println("---------------------------------------");
        
        
        String cadena = "si tu gusto gustara el gusto que gusta mi gusto";
        Arreglo.cuentaVocales(cadena);
        
        
        System.out.println("---------------------------------------");        
        
         String cadena2 = cadena;
        Arreglo.cuentaCaracter(cadena2, 's');         
       
    
    }
   
    
}
