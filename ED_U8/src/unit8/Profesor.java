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
public class Profesor extends Persona{
    
    public int Salario;
    
    public Profesor(String nombre, String dni)
    {
        super(nombre,dni);
    }
    
    public boolean Esprofesor()
    {
        return true;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }
    
}
