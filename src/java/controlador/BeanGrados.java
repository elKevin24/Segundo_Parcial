
package controlador;

public class BeanGrados {

    public String getId_seccion() {
        return id_seccion;
    }

    public void setId_seccion(String id_seccion) {
        this.id_seccion = id_seccion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(String id_nivel) {
        this.id_nivel = id_nivel;
    }

    public String getId_nivel1() {
        return id_nivel1;
    }

    public void setId_nivel1(String id_nivel1) {
        this.id_nivel1 = id_nivel1;
    }

    public String getNombre_nivel() {
        return nombre_nivel;
    }

    public void setNombre_nivel(String nombre_nivel) {
        this.nombre_nivel = nombre_nivel;
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

   

   

    public BeanGrados(String id_seccion, String grado, String seccion, String status, String id_nivel) {
        
        this.id_seccion = id_seccion;
        this.grado = grado;
        this.seccion = seccion;
        this.status = status;
        this.id_nivel = id_nivel;
        
    }

  
 private String id_seccion;
 private String grado;
 private String seccion;
 private String status;
 private String id_nivel;
 private String id_nivel1;
 private String nombre_nivel;
 private String status1;

 
 
 
 

    public BeanGrados() {
    }
 
   
}