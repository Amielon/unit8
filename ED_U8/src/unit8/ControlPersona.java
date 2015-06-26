/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit8;

import static java.lang.System.out;
import java.util.ArrayList;

/**
 *
 * @author Ami
 */
public class ControlPersona {
    
    static ArrayList <Persona> Personas;
    
    public ControlPersona()
    {
        
    }
    
    public static void main(String [] args)
    {
        Personas = new ArrayList();
        Asignatura Entornos = new Asignatura("Entornos");
        Entornos.setNota(5);
        Asignatura LM = new Asignatura("LM");
        LM.setNota(6);
        Asignatura Programacion = new Asignatura("Programacion");
        Programacion.setNota(6);
        
        Alumno Josemiguel = new Alumno("Josemiguel","3232123A");
        Josemiguel.AnyadirAsignatura(LM);
        Josemiguel.AnyadirAsignatura(Entornos);
        Josemiguel.AnyadirAsignatura(Programacion);
        
        Profesor Ricardo = new Profesor("Ricardo","asdfasdf432");
        Ricardo.AnyadirAsignatura(LM);
        Ricardo.AnyadirAsignatura(Entornos);
        Ricardo.AnyadirAsignatura(Programacion);
        
        anyadirPersona(Ricardo);
        anyadirPersona(Josemiguel);
        
        MostrarListado();
    }
    
    public static void anyadirPersona(Persona P)
    {
        Personas.add(P);
    }
    public void ordenarPorDni()
    {
        //Ordena por DNI no se hacerlo
    }
    public void ordenarporOrdenAlfabetico()
    {
        //No se hacerlo
    }
    
    public static void MostrarListado()
    {
        int longitud = Personas.size();
        
        for (int c = 0 ; c <longitud; c++)
        {
            Personas.get(c).mostrarListadoAsignaturasNota();
        }
    }
}
