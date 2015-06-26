/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit8;

/**
 *
 * @author Ami
 */
public class Asignatura {
    private String nombre;
    private double nota;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public Asignatura(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }
    
}
