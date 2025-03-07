package personagens;

public class Personagem {

    String nome;
    int ataque;
    int defesa;
    int vida;
    int especial;
    String fraseInicial;
    String fraseDaVitoria;

    public Personagem(String nome, int ataque, int defesa, int vida, int especial, String fraseInicial, String fraseDaVitoria) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.vida = vida;
        this.especial = especial;
        this.fraseInicial = fraseInicial;
        this.fraseDaVitoria = fraseDaVitoria;
    }

}
