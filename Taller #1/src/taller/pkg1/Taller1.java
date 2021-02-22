/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg1;

/**
 *
 * @author Usuario
 */
class taller {
    //funcion ejerciio de navshesh
    public int navshesh(int n){
        System.out.println("");
        if(n<10){
            return n;
        }else{
            return navshesh (n/10) + n%10;    
        }
    }
    //Ejercicio de la potencia
    public double potencia  (double n, int m){
        if (m==1){
            return (n);
        }else{
            return potencia(n,(m-1))* n;
        }
        
    }
    
    
    //ejercicio encontar el minimo de un arreglo
    public int minimoarreglo(int[] arreglo, int indice , int minimo){
        if  (indice != arreglo.length)
            if (arreglo[indice]<minimo){
            } else{
                minimo=minimoarreglo(arreglo, indice +1, minimo);
            }
        return minimo;
    }
    //Ejercicio serie Tribonacci
    
    public int funcionTribonacci(int num){
        // Caso base 1
        if(num == 0 || num == 1 || num == 2){
            return 0;
        //Caso Basse 2
        }
        if (num == 3) {
            return 1;
        } else {
            return funcionTribonacci(num-1) + funcionTribonacci(num-2) + funcionTribonacci(num-3);
        }
    }
    
}
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        taller r = new taller();
        //La variable arreglo se usará para determinar si existe un valor en un arreglo y para econtrar el dato menor del mismo.
        int[] arreglo= {5,8,6,4,6,7,9};
        int datobuscar = 7;
        System.out.println("EJERCICIO NAVESH: La suma de digitos de 412 es:    "+ r.navshesh(412));
        System.out.println("EJERCICIO SERIE TRIBONACCI: La serie de Tribonacci para el valor 5 es :    "+ r.funcionTribonacci(5));
        System.out.println("EJERCIIO EL DATO MENOR: El dato menor del arreglo 5,8,6:    "+ minimoarreglo(arreglo,0,arreglo[0]));
         System.out.println("EJERCIIO EXISTENCIA DE UN DATO: El dato 7 del arreglo 5,8,6, 4, 6, 7, 9:     "+ buscardato(arreglo,4,0));
        System.out.println("EJERCICIO DE POTENCIA: La potencia de 4  a la 2 es:    "+ r.potencia(4.2, 2));
    }
    public static int minimoarreglo(int[] arreglo, int indice , int minimo){
        if  (indice != arreglo.length)
            if (arreglo[indice]<minimo){
            } else{
                minimo=minimoarreglo(arreglo, indice +1, minimo);
            }
        return minimo;
    }
    
    public static int buscardato (int[] arreglo,int elemento_busqueda, int indice){
        if (arreglo[indice]==elemento_busqueda){
            return indice;
        }else{
            return buscardato(arreglo, elemento_busqueda, indice+1);
        }
    }
    
}
