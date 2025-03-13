package service;

import static constants.Constants.LOG_LISTA_PERSONAGENS;

public class Introducao {

    public static void intro() {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Bem vindo ao coliseu Black Cats");

        System.out.println("\nEstes são os nossos competidores: ");
        System.out.println(LOG_LISTA_PERSONAGENS);
    }
}
