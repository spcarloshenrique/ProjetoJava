package br.unifei.imc.fabricas;

import br.unifei.imc.jogos.Jogo;
import br.unifei.imc.jogos.JogoMultiplataforma;

public class FabMultiplataforma extends FabricaDeJogo{
    @Override
    Jogo criaJogos() {
        return new JogoMultiplataforma();
    }
}
