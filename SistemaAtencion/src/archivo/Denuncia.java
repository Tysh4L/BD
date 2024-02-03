package archivo;

public class Denuncia {
    
    private String tipoFeedback;
    private String nombre;
    private String telefono;
    private String correo;
    private String domicilio;
    private String detalles;
    

    public Denuncia(String nombre, String telefono, String correo, String domicilio, String detalles, String tipoFeedback) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.domicilio = domicilio;
        this.detalles = detalles;
        this.tipoFeedback = tipoFeedback;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
    public String getTipoFeedback() {
        return tipoFeedback;
    }

    public void setTipoFeedback(String tipoFeedback) {
        this.tipoFeedback = tipoFeedback;
    }
    
    
    
}
