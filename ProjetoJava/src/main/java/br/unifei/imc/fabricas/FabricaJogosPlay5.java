package br.unifei.imc.fabricas;

import br.unifei.imc.jogos.Jogo;
import br.unifei.imc.jogos.JogoPlay5;

public class FabricaJogosPlay5 implements FabricaDeJogo{
    @Override
    public Jogo criaJogos() {
        return new JogoPlay5();
    }
}
