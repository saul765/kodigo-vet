package domain;

import sequence.FacturaSequence;

import java.util.List;

public class Factura {

    private final Integer idFactura;

    private List<ElementoFactura> elementos;

    public Factura(List<ElementoFactura> elementos) {
        this.idFactura = FacturaSequence.getNextId();
        this.elementos = elementos;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public List<ElementoFactura> getElementos() {
        return elementos;
    }

    public void setElementos(List<ElementoFactura> elementos) {
        this.elementos = elementos;
    }

    private Double calcularSubtotal() {
        return elementos.stream().mapToDouble(e -> e.getPrecio() * e.getCantidad()).sum();
    }

    public String mostrarFactura() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elementos de la factura:\n");
        elementos.forEach(e -> sb.append(e.getElemento()).append(" - ").append(e.getPrecio()).append(" - ").append(e.getCantidad()).append("\n"));
        sb.append("Subtotal: ").append(calcularSubtotal());
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", elementos=" + elementos +
                '}';
    }
}
