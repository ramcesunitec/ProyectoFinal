/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author ramce
 */
public class PersistenciaPregunta {
     public static void guardar(Pregunta p)throws Exception{
        //Paso 1 Generar el archivo donde se va a guardar nuestro serializado
        ArrayList<Pregunta>preguntas=new ArrayList<>();
        File file=new File("cuestionario.yo"); //Esta linea crea o sobrescribe un archivo
        
        if(file.exists()) preguntas=leer();
        preguntas.add(p);
        
        //Paso 2 es indicar que lo vamos a generar para escribirlo en el 
        FileOutputStream fos =new FileOutputStream(file);
        
        //Paso 3 Escribir un objeto en el
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(preguntas);
        oos.close();    
    }
    
    public static ArrayList<Pregunta> leer()throws Exception{
	File file=new File("cuestionario.yo");
	FileInputStream fis=new FileInputStream(file);
	ObjectInputStream ois=new ObjectInputStream(fis);
	ArrayList<Pregunta> preguntas=(ArrayList<Pregunta>) ois.readObject();
	return preguntas;
    }
    
    public static void actualizar(ArrayList<Pregunta> nuevas)throws Exception{
        File file=new File("cuestionario.yo"); //Esta linea crea o sobrescribe un archivo
       // preguntas.add(p);
        
        //Paso 2 es indicar que lo vamos a generar para escribirlo en el 
        FileOutputStream fos =new FileOutputStream(file);
        
        //Paso 3 Escribir un objeto en el
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(nuevas);
        oos.close();    
    }
    
    public static void borrar(int indice) throws Exception{
        ArrayList<Pregunta>preguntas=new ArrayList<>();
        File file =new File("cuestionario.yo");
        if(file.exists())preguntas=leer();
        preguntas.remove(indice);
        FileOutputStream fos =new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(preguntas);
        oos.close();  
        
    }
    
    public static ArrayList<Opcion>opcionesAleatorias(ArrayList<Opcion> opciones){
        ArrayList<Opcion>opcionesAleatorias=new ArrayList<>();
        Set<Integer> enteros=new LinkedHashSet<>();
        //enteros.add(numero);
        while(enteros.size()<4){
            
            Random r=new Random();
            int numero=r.nextInt(4); 
            enteros.add(numero);
            
           }
        for(Integer i:enteros){
            opcionesAleatorias.add(opciones.get(i));
        }
         return opcionesAleatorias;
               
    
    }

    public static void borrar(ArrayList<Pregunta> pregunta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
