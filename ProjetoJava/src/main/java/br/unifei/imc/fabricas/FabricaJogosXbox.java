package br.unifei.imc.fabricas;

import br.unifei.imc.jogos.Jogo;
import br.unifei.imc.jogos.JogoXbox;


public class FabricaJogosXbox extends FabricaDeJogo{
    @Override
    public Jogo criaJogos() {
        return new JogoXbox();
    }
}
