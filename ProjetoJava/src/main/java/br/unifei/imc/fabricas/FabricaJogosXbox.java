package fabricas;

import jogos.Jogo;
import jogos.JogoXbox;


public class FabricaJogosXbox implements FabricaDeJogo{
    @Override
    public Jogo criaJogos() {
        return new JogoXbox();
    }
}
