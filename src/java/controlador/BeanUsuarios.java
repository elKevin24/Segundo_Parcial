
package controlador;


public class BeanUsuarios {

    
     public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFecha_commit() {
        return fecha_commit;
    }

    public void setFecha_commit(String fecha_commit) {
        this.fecha_commit = fecha_commit;
    }

    public String getHora_commit() {
        return hora_commit;
    }

    public void setHora_commit(String hora_commit) {
        this.hora_commit = hora_commit;
    }
   
     public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
  
    

   
  

    public BeanUsuarios(String id_usuario, String nombre, String apellido, String contraseña) {
        
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
  
    }

  
 private String id_usuario;
 private String nombre;
 private String apellido;
 private String contraseña;
 private String status;
 private String fecha_commit;
 private String hora_commit;
 
 

    public BeanUsuarios() {
    }
}
