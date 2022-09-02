package com.cristian.agendaTelefonica.app;

import com.cristian.agendaTelefonica.dominio.Agenda;

public class AppAgenda {
    public static void main(String[] args) {

        Agenda miAgenda = new Agenda();

        miAgenda.agregar("Carlos", "Cifuentes", 3201758420l);
        miAgenda.agregar("Melissa", "Lopera", 3216975530l);
        miAgenda.agregar("Melissa", "Duque", 3225475920l);
        miAgenda.agregar("Claudia", "Agudelo", 3227875920l);
        miAgenda.agregar("Cristian", "Ospina", 3225647810l);
        miAgenda.agregar("Adriana", "Echeverri", 3156945013l);
        miAgenda.agregar("Diana", "Correa", 3124205010l);
        miAgenda.agregar("Elkyn", "Jaramillo", 31782327070l);
        miAgenda.agregar("Yuli", "Castano", 3101614100l);

        miAgenda.ordenarAlfabeticamente();

        System.out.println("\n----------------------------------\n");

        miAgenda.eliminar(3225475920l);
        miAgenda.editar(3216975530l, 3147254180l);

        System.out.println("\n------- Buscar un nuevo numero --------\n");
        miAgenda.buscarPorCelularConFilter(3147254180l);
        System.out.println("\n---------------------------------------\n");

        /* if (c != null) {
            System.out.println("Contacto buscado: " + c.getNombre() + " " + c.getApellido());
        } else {
            System.out.println("Contacto no encontrado");
        }
        */

        miAgenda.buscarPorApellido("Lopera");
        miAgenda.buscarPorNombre("Garcia");
        miAgenda.buscarPorApellido("Agudelo");

        System.out.println("\n---------------Agenda Ordenada---------------\n");
        miAgenda.ordenarAlfabeticamente();

    }
}