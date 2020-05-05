
package controlador;

public class BeanCurso {

    public String getId_curso() {
        return id_curso;
    }

    public void setId_curso(String id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombredecurso() {
        return nombredecurso;
    }

    public void setNombredecurso(String nombredecurso) {
        this.nombredecurso = nombredecurso;
    }

    public String getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(String id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getId_grado() {
        return id_grado;
    }

    public void setId_grado(String id_grado) {
        this.id_grado = id_grado;
    }

   

    
  
    

   
  

    public BeanCurso(String id_curso, String nombredecurso, String id_profesor, String id_grado) {
        
        this.id_curso = id_curso;
        this.nombredecurso = nombredecurso;
        this.id_profesor = id_profesor;
        
        this.id_grado = id_grado;
        
    }

  
 private String id_curso;
 private String nombredecurso;
 private String id_profesor;
 private String id_grado;
 
 
 

    public BeanCurso() {
    }
 
   
}