
import Controladores.ControladorPersona;
import Modelos.ModeloPersonas;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;


public class Main {


    public static void main(String[] args) {
       
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmPersonas VistaPersonas = new frmPersonas(VistaPrincipal, true);
        ModeloPersonas ModeloPersonas = new ModeloPersonas();
        
        ControladorPersona ControladorPersonas = new ControladorPersona(VistaPrincipal, VistaPersonas, ModeloPersonas);
    }
    
}
