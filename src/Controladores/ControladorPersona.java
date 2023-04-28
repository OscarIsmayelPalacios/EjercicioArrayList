
package Controladores;

import Modelos.ModeloPersonas;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ControladorPersona implements ActionListener {
    
    frmPrincipal VistaPrincipal;
    frmPersonas VistaPersonas;
    ModeloPersonas PersonasModelo;
    public DefaultTableModel TablaPersonas = new DefaultTableModel();

    public ControladorPersona(frmPrincipal VistaPrincipal, frmPersonas VistaPersonas, ModeloPersonas PersonasModelo) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPersonas = VistaPersonas;
        this.PersonasModelo = PersonasModelo;
        
        
        this.TablaPersonas.addColumn("Apellidos");
        this.TablaPersonas.addColumn("Nombres");
        this.TablaPersonas.addColumn("Telefono");
        
        this.VistaPersonas.jtTablaPersonas.setModel(TablaPersonas);

        
        this.VistaPersonas.btnAgregar.addActionListener(this);
        this.VistaPersonas.btnListar.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
 
        
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPersonas.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==this.VistaPersonas.btnAgregar)
        {

            
            JOptionPane.showMessageDialog(null, "Persona Agregada");
        }
        
        if(e.getSource()==this.VistaPersonas.btnListar)
        {
            this.PersonasModelo.AgregarUsuarios(this.VistaPersonas.txtApellidos.getText(),
                    this.VistaPersonas.txtNombres.getText(), this.VistaPersonas.txtTelefono.getText());
        }
        this.TablaPersonas.addRow(new Object[]{this.PersonasModelo.ListaPersonas.get(0).getApellidos(),
            this.PersonasModelo.ListaPersonas.get(0).getNombres(),this.PersonasModelo.ListaPersonas.get(0).getTelefono()});
      
    }
    
}
