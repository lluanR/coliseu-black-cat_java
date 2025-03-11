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

    public String getNome() {
        return nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getVida() {
        return vida;
    }

    public int getEspecial() {
        return especial;
    }

    public String getFraseInicial() {
        return fraseInicial;
    }

    public String getFraseDaVitoria() {
        return fraseDaVitoria;
    }
}
