
package Modelos;

import java.util.ArrayList;


public class ModeloPersonas {
    
    public ArrayList<ClasePersonas> ListaPersonas = new ArrayList<ClasePersonas>();
    
    public void AgregarUsuarios(String apellidos, String nombre, String telefono)
    {
        ClasePersonas NuevoUsuarios = new ClasePersonas(apellidos, nombre, telefono);
        this.ListaPersonas.add(NuevoUsuarios);
    }
    

    
    public void Listar()
    {
       
    }
}
