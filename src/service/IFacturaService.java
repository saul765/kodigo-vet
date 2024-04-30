package service;

import domain.ElementoFactura;

public interface IFacturaService {

    void mostrarFactura();

    void crearFactura();

    void agregarElemento(ElementoFactura elementoFactura);

    void eliminarElemento(Integer idFactura, ElementoFactura elementoFactura);

    void modificarElemento(Integer idFactura, ElementoFactura elementoFactura);

    void imprimirFactura();
}
