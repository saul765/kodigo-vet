package domain;

import utils.DateUtils;

import java.util.Date;
import java.util.List;

public class Diagnostico {

    private Date fecha;

    private String descripcion;

    private Factura factura;

    private List<Personal> personal;


    public Diagnostico(Date fecha, String descripcion, Factura factura, List<Personal> personal) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.factura = factura;
        this.personal = personal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "Diagnostico{" +
                "fecha=" + DateUtils.dateFormated(fecha)  +
                ", descripcion='" + descripcion + '\'' +
                ", factura=" + factura +
                ", personal=" + personal +
                '}';
    }
}
