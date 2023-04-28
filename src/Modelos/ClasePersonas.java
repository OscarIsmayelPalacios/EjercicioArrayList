
package Modelos;


public class ClasePersonas {
    
    String Apellidos;
    String Nombres;
    String Telefono;

    public ClasePersonas(String Apellidos, String Nombres, String Telefono) {
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Telefono = Telefono;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

}
