package ec.edu.espe.arquitectura.examen.model;

public class empleados {
    private String cedulaIdentidad;
    private String apellidos;
    private String nombres;
    private String numeroCuenta;
    public empleados() {
    }
   
    public String getCedulaIdentidad() {
        return cedulaIdentidad;
    }
    public void setCedulaIdentidad(String cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
     public empleados(String cedulaIdentidad, String apellidos, String nombres, String numeroCuenta) {
        this.cedulaIdentidad = cedulaIdentidad;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.numeroCuenta = numeroCuenta;
    }
}