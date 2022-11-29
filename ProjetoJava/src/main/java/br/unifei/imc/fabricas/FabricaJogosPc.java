package br.unifei.imc.fabricas;

import br.unifei.imc.jogos.Jogo;
import br.unifei.imc.jogos.JogoPc;

public class FabricaJogosPc implements FabricaDeJogo{
    @Override
    public Jogo criaJogos() {
        return new JogoPc();
    }
}
