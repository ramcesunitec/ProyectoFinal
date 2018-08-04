/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedHashSet;
import java.util.*;

/**
 *
 * @author ramce
 */
public class ProbarOrdenamientos {
    public static void main(String[] args) {
       
            
        
        //Un arreglo que no acepta duplicados
        Set<Integer> enteros=new LinkedHashSet<>();
        //enteros.add(numero);
        while(enteros.size()<4){
            
            Random r=new Random();
            int numero=r.nextInt(4); 
            enteros.add(numero);
            
        }
        
                
        for(Integer i:enteros){
            System.out.println(i);
        }
        
        
        }
        
}
