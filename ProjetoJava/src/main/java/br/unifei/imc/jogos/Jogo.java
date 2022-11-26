package jogos;

import java.util.List;

public interface Jogo {

    void jogo(String nome,Double valor,String descricao,String fabricante);

    void exibeJogo(List<Games> jogos);

}
