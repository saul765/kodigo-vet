package domain;

public class Animal {

    private String nombre;

    private String edad;

    private String tipo;

    private Persona duenio;

    public Animal(String nombre, String edad, String tipo, Persona duenio) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", tipo='" + tipo + '\'' +
                ", duenio=" + duenio +
                '}';
    }
}
