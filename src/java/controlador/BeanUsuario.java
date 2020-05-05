package controlador;

public class BeanUsuario {

    public String getId_seccion() {
        return id_seccion;
    }

    public void setId_seccion(String id_seccion) {
        this.id_seccion = id_seccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getTnombre() {
        return tnombre;
    }

    public void setTnombre(String tnombre) {
        this.tnombre = tnombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSapellido() {
        return sapellido;
    }

    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(String id_alumno) {
        this.id_alumno = id_alumno;
    }

   
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }



    public BeanUsuario(String nombre, String snombre, String tnombre, String apellido, String sapellido, String id_seccion) {
        
        this.nombre = nombre;
        this.snombre = snombre;
        this.tnombre = tnombre;
        this.apellido = apellido;
        this.sapellido = sapellido;
        this.id_seccion = id_seccion;
        
        
    }

    private String id_seccion;
    private String nombre;
    private String snombre;
    private String tnombre;
    private String apellido;
    private String sapellido;
    private String status;
    private String id_alumno;
    private String encargado;
    private String correo;
    private String telefono; 

    public BeanUsuario() {
    }

}
