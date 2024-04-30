package domain;

import java.util.List;

public class Historico {

    private List<ElementoHistorico> elementos;

    public Historico(List<ElementoHistorico> elementos) {
        this.elementos = elementos;
    }

    public List<ElementoHistorico> getElementos() {
        return elementos;
    }

    public void setElementos(List<ElementoHistorico> elementos) {
        this.elementos = elementos;
    }
}
