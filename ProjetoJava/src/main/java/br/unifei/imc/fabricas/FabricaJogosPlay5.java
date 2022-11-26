package fabricas;

import jogos.Jogo;
import jogos.JogoPlay5;

public class FabricaJogosPlay5 implements FabricaDeJogo{
    @Override
    public Jogo criaJogos() {
        return new JogoPlay5();
    }
}
