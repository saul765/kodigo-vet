package domain;

import enums.TipoPersona;

public class PersonaJuridica extends Persona {

    public PersonaJuridica(String nombre, String email, String direccion, String telefono, String documento) {
        super(nombre, email, direccion, telefono, TipoPersona.JURIDICA, documento);
    }


    @Override
    public String toString() {
        return "PersonaJuridica{" +
                "nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", tipoPersona=" + getTipoPersona() +
                ", CIF='" + getDocumento() + '\'' +
                '}';
    }
}
