/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author ramce
 */
public class Opcion implements Serializable{
    private String titulo;
    private boolean correcta;

    public Opcion() {
    }

    public Opcion(String titulo, boolean correcta) {
        this.titulo = titulo;
        this.correcta = correcta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }
    
}
