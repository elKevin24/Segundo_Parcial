package controlador;

public class BeanUsuario {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

 



    public BeanUsuario(String id, String lote, String fecha, String campo, String cantidad, String variedad, String calidad) {
        
         this.id = id;
        this.lote = lote;
        this.fecha = fecha;
        this.campo = campo;
        this.cantidad = cantidad;
        this.variedad = variedad;
        this.calidad = calidad;
        
        
    }

     private String id;
    private String lote;
    private String fecha;
    private String campo;
    private String cantidad;
    private String variedad;
    private String calidad;

    public BeanUsuario() {
    }

}
