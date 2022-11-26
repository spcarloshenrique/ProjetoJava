package fabricas;

import jogos.Jogo;
import jogos.JogoPc;

public class FabricaJogosPc implements FabricaDeJogo{
    @Override
    public Jogo criaJogos() {
        return new JogoPc();
    }
}
