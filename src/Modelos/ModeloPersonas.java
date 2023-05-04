
package Modelos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ModeloPersonas {
    
    ArrayList ListaPersonas = new ArrayList();
    DefaultTableModel ModeloTabla;
    
    public void AgregarUsuarios(String apellidos, String nombre, String telefono)
    {
        ClasePersonas NuevoUsuarios = new ClasePersonas(apellidos, nombre, telefono);
        this.ListaPersonas.add(NuevoUsuarios);
    }
    
  public DefaultTableModel ListarPersonas()
    {
        ArrayList<ClasePersonas>listaLocal = ListaPersonas;
        ModeloTabla = new DefaultTableModel();
        this.ModeloTabla.setRowCount(0);
        this.ModeloTabla.addColumn("APELLIDOS");
        this.ModeloTabla.addColumn("NOMBRE");
        this.ModeloTabla.addColumn("TELEFONO");
        for(ClasePersonas MiListaDePersonas: listaLocal)
        {
            this.ModeloTabla.addRow(new Object []{MiListaDePersonas.getApellidos()
                    ,MiListaDePersonas.getNombres(),MiListaDePersonas.getTelefono()});
        }
        return ModeloTabla;
    }
}
