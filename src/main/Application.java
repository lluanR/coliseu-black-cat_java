import personagens.Personagem;

import java.util.Scanner;

import static service.Introducao.intro;
import static service.SelecaoDePersonagens.selecaoDePersonagem;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        intro();
        Personagem player1 = selecaoDePersonagem(true, scanner, null);
        System.out.println(player1.getNome() + ": " + player1.getFraseInicial());

        Personagem player2 = selecaoDePersonagem(false, scanner, player1);
        System.out.println(player2.getNome() + ": " + player2.getFraseInicial());

        scanner.close();
    }
}
