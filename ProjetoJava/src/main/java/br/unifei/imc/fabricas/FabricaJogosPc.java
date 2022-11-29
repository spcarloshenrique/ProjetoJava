package br.unifei.imc.fabricas;

import br.unifei.imc.jogos.Jogo;
import br.unifei.imc.jogos.JogoPc;

public class FabricaJogosPc extends FabricaDeJogo{
    @Override
    public Jogo criaJogos() {
        return new JogoPc();
    }
}
