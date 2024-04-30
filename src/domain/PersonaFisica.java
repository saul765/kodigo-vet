package domain;

import enums.TipoPersona;

public class PersonaFisica extends Persona {


    public PersonaFisica(String nombre, String email, String direccion, String telefono, String documento) {
        super(nombre, email, direccion, telefono, TipoPersona.FISICA, documento);
    }

    @Override
    public String toString() {
        return "PersonaFisica{" +
                "nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", tipoPersona=" + getTipoPersona() +
                ", DNI='" + getDocumento() + '\'' +
                '}';
    }
}
