package domain;

import utils.DateUtils;

import java.util.Date;

public abstract class Personal {

    private String nombre;

    private String apellido;

    private Date fechaContratacion;

    public Personal(String nombre, String apellido, Date fechaContratacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
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

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaContratacion=" + DateUtils.dateFormated(fechaContratacion) +
                '}';
    }
}
