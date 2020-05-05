
package controlador;

/**
 *
 * @author Ariel
 */
public class BeanNotas {

    public String getId_nota() {
        return id_nota;
    }

    public void setId_nota(String id_nota) {
        this.id_nota = id_nota;
    }

    public String getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(String id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getId_curso() {
        return id_curso;
    }

    public void setId_curso(String id_curso) {
        this.id_curso = id_curso;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
   
    
     public BeanNotas( String id_alumno, String id_curso, String nota, String unidad) {
        
     
        this.id_alumno = id_alumno;
        this.id_curso = id_curso;
        this.nota = nota;
        this.unidad = unidad;
       
    }
     
     private String id_nota;
     private String id_alumno;
     private String id_curso;
     private String nota;
     private String unidad;
     private String tipo;
     
     
         public BeanNotas(){
             
         }
   }
