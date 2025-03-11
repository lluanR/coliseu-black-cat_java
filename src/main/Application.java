import personagens.*;

import java.util.Scanner;

import static constants.Constants.LOG_LISTA_PERSONAGENS;

public class Application {

    public static void main(String[] args) {

        // Você já fez a seleção de personagem mas...
        // Não atribuiu o valor à um personagem
        // Usando o Switch, defina o personagem selecionado

        int numeroPrimeiroPersonagem;
        int numeroSegundoPersonagem;
        Personagem primeiroPersonagem;
        Personagem segundoPersonagem;

        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Bem vindo ao coliseu Black Cats");

        System.out.println("\nEstes são os nossos competidores: ");
        System.out.println(LOG_LISTA_PERSONAGENS);

        numeroPrimeiroPersonagem = selecaoDePersonagem(true, scanner, null);
        primeiroPersonagem = atribuicaoDeNumeroAPersonagem(numeroPrimeiroPersonagem);
        System.out.println(primeiroPersonagem.getNome() + ": " + primeiroPersonagem.getFraseInicial());

        numeroSegundoPersonagem = selecaoDePersonagem(false, scanner, numeroPrimeiroPersonagem);
        segundoPersonagem = atribuicaoDeNumeroAPersonagem(numeroSegundoPersonagem);
        System.out.println(segundoPersonagem.getNome() + ": " + segundoPersonagem.getFraseInicial());

        scanner.close();
    }

    public static int selecaoDePersonagem(boolean isPrimeiroPersonagem, Scanner scanner, Integer numPrimeiroPersonagem) {
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

            while (numPersonagem <= 0 || numPersonagem > 7 || numPersonagem == numPrimeiroPersonagem) {
                if (numPersonagem == numPrimeiroPersonagem) {
                    System.out.println("\nSelecione um personagem diferente do primeiro.");
                }

                numPersonagem = reselecaoDePersonagem(scanner);
            }
        }

        return numPersonagem;
    }

    public static int reselecaoDePersonagem(Scanner scanner) {
        int numPersonagem;

        System.out.println("\nPersonagem inválido, por favor, selecione um personagem válido da lista abaixo:");
        System.out.println(LOG_LISTA_PERSONAGENS);
        System.out.print("Número do competidor: ");
        numPersonagem = scanner.nextInt();

        return numPersonagem;
    }

    public static Personagem atribuicaoDeNumeroAPersonagem(int numPersonagem) {

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
