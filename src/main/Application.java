import java.util.Scanner;

import static constants.Constants.LOG_LISTA_PERSONAGENS;

public class Application {

    public static void main(String[] args) {

        // Criar uma classe para Personagens
        // Criar uma classe para cada personagem
        // Implementar o Scanner para escolher 2 Personagens

        // A aplicação consistirá em um duelo, o duelo ocorrerá de forma automática e declarará um vencedor.
        // O primeiro atacante será aleatório
        // Cada personagem vai ter um status de: ataque, defesa, vida, carregamento do especial (próximo ataque x3)
        // Será informado cada rodada na tela

        // ORIENTAÇÃO À OBJETO
        // 4 pilares
        // Herança, Encapsulamento, Polimorfismo, Abstração

        int numeroPrimeiroPersonagem;
        int numeroSegundoPersonagem;

        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Bem vindo ao coliseu Black Cats");

        System.out.println("\nEstes são os nossos competidores: ");
        System.out.println(LOG_LISTA_PERSONAGENS);

        numeroPrimeiroPersonagem = selecaoDePersonagem(true, scanner, null);

        numeroSegundoPersonagem = selecaoDePersonagem(false, scanner, numeroPrimeiroPersonagem);

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
}
