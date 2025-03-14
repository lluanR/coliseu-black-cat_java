package service;

import personagens.Personagem;

public class Combate {

    // A PARTE DA LUTA
    // DEFINIR DE FORMA RANDÔMICA QUEM É O PRIMEIRO A ATACAR
    // ATAQUE = 10 RANDOMICO DE 0 AO VALOR MAXIMO
    // DEFESA = 10 RANDOMICO DE 0 AO VALOR MAXIMO
    // ATAQUE = DANO DE ATAQUE - DEFESA
    // SE DER NÚMERO NEGATIVO, VALIDAR COMO 0
    // ESPECIAL É SEMPRE O VALOR MÁXIMO DO ATAQUE X 1.5
    // BARRA DE ESPECIAL AUMENTA COM ATAQUE + DEFESA (PARA O DEFENSOR)
    // 2 parametros entrada = 2 jogadores
    // retorno 1 personagem = vencedor


    // metodo == ataque (valor de ataque(random) do personagemAtacante - valor de defesa(random) personagemDefensor) = retorna valor de vidaPerdida(dano)
    // vidaPersonagem = get.vida (personagem) - vidaPerdida
    // if (vidaPersonagem <= 0) = arredondar para 0

    // ataque especial personagem = valor de ataque(random) do personagemAtacante + valor de defesa(random) personagemDefensor
    // se o ataque especial for 100% = get.ataque (personagem) * 1.5

    public static Personagem combatePersonagem(Personagem personagemAtacante , Personagem personagemDefensor) {

        int qtdeAtaque = personagemAtacante.getAtaque();
        int qtdeDefesa = personagemDefensor.getDefesa();
        System.out.println(personagemAtacante.getNome() + " atacou com " + qtdeAtaque + " de dano");
        System.out.println("Porém, " + personagemDefensor.getNome() + " conseguiu defender " + qtdeDefesa + " do dano recebido");

        int vidaPerdida = qtdeAtaque - qtdeDefesa;
        personagemDefensor.setVida(personagemDefensor.getVida() - vidaPerdida);

        System.out.println("Defensor ficou com " + personagemDefensor.getVida() + " de vida");


        return personagemAtacante;

    }



}
