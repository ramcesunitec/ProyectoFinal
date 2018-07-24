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
}
