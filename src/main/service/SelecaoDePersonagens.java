package service;

import personagens.*;

import java.util.Scanner;

import static constants.Constants.LOG_LISTA_PERSONAGENS;

public class SelecaoDePersonagens {

    public static Personagem selecaoDePersonagem(boolean isPrimeiroPersonagem, Scanner scanner, Personagem player1) {

        int numPersonagem;

        if (isPrimeiroPersonagem) {
            System.out.print("\nSelecione o número do primeiro competidor: ");
            numPersonagem = scanner.nextInt();

            while (numPersonagem <= 0 || numPersonagem > 7) {
                numPersonagem = reselecaoDePersonagem(scanner);
            }
        } else {
            System.out.print("\nSelecione o número do segundo competidor: ");
            numPersonagem = scanner.nextInt();

            while (numPersonagem <= 0 || numPersonagem > 7 || atribuicaoDeNumeroAPersonagem(numPersonagem).equals(player1)) {
                if (atribuicaoDeNumeroAPersonagem(numPersonagem).equals(player1)) {
                    System.out.println("\nSelecione um personagem diferente do primeiro.");
                }

                numPersonagem = reselecaoDePersonagem(scanner);
            }
        }

        return atribuicaoDeNumeroAPersonagem(numPersonagem);
    }

    private static int reselecaoDePersonagem(Scanner scanner) {
        int numPersonagem;

        System.out.println("\nPersonagem inválido, por favor, selecione um personagem válido da lista abaixo:");
        System.out.println(LOG_LISTA_PERSONAGENS);
        System.out.print("Número do competidor: ");
        numPersonagem = scanner.nextInt();

        return numPersonagem;
    }

    private static Personagem atribuicaoDeNumeroAPersonagem(int numPersonagem) {

        switch (numPersonagem) {
            case 1:
                return new Eduarda();
            case 2:
                return new Erico();
            case 3:
                return new Jose();
            case 4:
                return new Karol();
            case 5:
                return new Luan();
            case 6:
                return new Samuel();
            case 7:
                return new Victor();
            default:
                return new Luan();
        }
    }

}
