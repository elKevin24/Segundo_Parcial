package controlador;

/**
 *
 * @author Ariel
 */
public class BeanNotasMalla {

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

    public String getProcidimental() {
        return procidimental;
    }

    public void setProcidimental(String procidimental) {
        this.procidimental = procidimental;
    }

    public String getActitudinal() {
        return actitudinal;
    }

    public void setActitudinal(String actitudinal) {
        this.actitudinal = actitudinal;
    }

    public String getDeclarativo() {
        return declarativo;
    }

    public void setDeclarativo(String declarativo) {
        this.declarativo = declarativo;
    }

    public String getId_seccion() {
        return id_seccion;
    }

    public void setId_seccion(String id_seccion) {
        this.id_seccion = id_seccion;
    }

    public String getId_malla() {
        return id_malla;
    }

    public void setId_malla(String id_malla) {
        this.id_malla = id_malla;
    }

    

    public BeanNotasMalla(String id_malla, String id_nota, String id_seccion, String id_alumno, String id_curso, String procidimental, String actitudinal, String declarativo) {
        
        this.id_malla = id_malla;
        this.id_nota = id_nota;
        this.id_seccion = id_seccion;
        this.id_alumno = id_alumno;
        this.id_curso = id_curso;
        this.procidimental = procidimental;
        this.actitudinal = actitudinal;
        this.declarativo = declarativo;
        

    }
    private String id_malla;
    private String procidimental;
    private String actitudinal;
    private String declarativo;      
    private String id_nota;
    private String id_seccion;
    private String id_alumno;
    private String id_curso;

    public BeanNotasMalla() {

    }
}
