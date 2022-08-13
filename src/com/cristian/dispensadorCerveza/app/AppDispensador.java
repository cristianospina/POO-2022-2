package com.cristian.dispensadorCerveza.app;

import com.cristian.dispensadorCerveza.dominio.Cerveza;
import com.cristian.dispensadorCerveza.dominio.Dispensador;

public class AppDispensador {
    public static void main(String[] args) {
        Cerveza clubNegra = new Cerveza("Club Colombia Negra", -4);
        Cerveza pilsen = new Cerveza("Pilsen", 2);

        Dispensador dispensadora = new Dispensador("Black and Decker", 1000);

        dispensadora.cambiarCerveza(clubNegra);
        boolean sirvioBien = dispensadora.servir(250);

        if (sirvioBien) {
            System.out.println("Se sirvió " + dispensadora.cervezaActual.nombre + " a "
                    + dispensadora.temperatura + "°c correctamente. Queda " + dispensadora.cantidadActual);
        } else {
            System.out.println("No se pudo servir cerveza.");
        }

        dispensadora.cambiarCerveza(pilsen);
        boolean sirvioBienPilsen = dispensadora.servir(340);

        if (sirvioBienPilsen) {
            System.out.println("Se sirvió " + dispensadora.cervezaActual.nombre + " a "
                    + dispensadora.temperatura + "°c correctamente. Queda " + dispensadora.cantidadActual);
        } else {
            System.out.println("No se pudo servir cerveza.");
        }
    }
}
