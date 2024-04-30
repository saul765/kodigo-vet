package domain;

public class ElementoFactura {

    private String elemento;

    private Double precio;

    private Integer cantidad;

    public ElementoFactura(String elemento, Double precio, Integer cantidad) {
        this.elemento = elemento;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ElementoFactura{" +
                "elemento='" + elemento + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
