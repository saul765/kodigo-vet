import domain.*;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creando personas
        Persona fisica = new PersonaFisica("Juan", "test@yopmail.com", "test", "22577777", "12345678");

        Persona juridica = new PersonaJuridica("Jon", "doe@yopmail.com", "test2", "25500000", "98765431");

        //Creando animales
        Animal animal = new Animal("Perro1", "3", "canino", fisica);

        System.out.println("animal: " + animal);

        // Creando personal
        Personal personal = new Veterinario("Juan", "Perez", new Date());

        Personal personal2 = new Auxiliar("Pedro", "Gomez", new Date());

        // Creando Elementos de Factura

        ElementoFactura elemento1 = new ElementoFactura("Vacuna", 50.00, 2);
        ElementoFactura elemento2 = new ElementoFactura("Desparasitante", 20.00, 1);
        ElementoFactura elemento3 = new ElementoFactura("Consulta", 30.00, 1);

        // Creando Factura
        Factura factura = new Factura(List.of(elemento1, elemento2, elemento3));

        System.out.println("Factura: " + factura.mostrarFactura());

        // Creando Diagnostico
        Diagnostico diagnostico = new Diagnostico(new Date(), "Diagnostico de Perro1", factura, List.of(personal, personal2));

        System.out.println(diagnostico);

    }
}