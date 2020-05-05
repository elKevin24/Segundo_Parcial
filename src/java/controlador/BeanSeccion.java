
package controlador;


public class BeanSeccion {
    
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
        
     public String getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(String id_nivel) {
        this.id_nivel = id_nivel;
    }
    
    public BeanSeccion (String id_seccion, String grado, String seccion, String id_nivel){
        
        this.id_seccion = id_seccion;
        this.grado = grado;
        this.seccion = seccion;
        this.id_nivel = id_nivel;
    }
        
    private String id_seccion;
    private String grado;
    private String seccion;
    private String id_nivel;
    
    public BeanSeccion(){
        
    }
    
}
