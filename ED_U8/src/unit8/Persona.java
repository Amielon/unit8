package unit8;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ami
 */
public abstract class Persona {
    
    protected String nombre;
    protected String dni;
    protected ArrayList <Asignatura> Asignaturas;
    
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
        Asignaturas = new ArrayList();
    }
    public void AnyadirAsignatura(Asignatura A)
    {
        Asignaturas.add(A);
    }
    public void OrdenarporAsignatura()
    {
      //No se ha explicado en clase, no idea
    }
    public void ordenarporNota()
    {
        //Ni idea
    }
    public void mostrarListadoAsignaturasNota()
    {
        int longitud = Asignaturas.size();
        
        for (int c = 0; c < longitud ; c++)
        {
            out.println("Nombre de la persona: " + nombre);
            out.println("Asignatura: " + Asignaturas.get(c).getNombre());
            out.println("Nota: " + Asignaturas.get(c).getNota());
        }
    }
    public abstract boolean Esprofesor();

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return Asignaturas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAsignaturas(ArrayList<Asignatura> Asignaturas) {
        this.Asignaturas = Asignaturas;
    }
    
}
