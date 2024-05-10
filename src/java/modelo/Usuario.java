package modelo;

public class Usuario {
    private String usuario;
    private String clave;
    private Double dinero;

    public Usuario() {
    }

    public Usuario(String usuario, String clave, Double dinero) {
        this.usuario = usuario;
        this.clave = clave;
        this.dinero = dinero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }
}
