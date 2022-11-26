package jogos;

import java.util.List;

public class JogoPc implements Jogo{

    private String nome;
    private Double valor;
    private String descricao;
    private String fabricante;

    @Override
    public void jogo(String nome, Double valor, String descricao, String fabricante) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.fabricante = fabricante;
    }

    @Override
    public void exibeJogo(List<Games> jogos) {
        jogos.forEach(p->
                System.out.println("|Jogo(s) Pc|\nNome: "+p.getNome()+"\nPreço: "+p.getValor()+
                        "\nDescrição: "+p.getDescricao()+"\nFabricante: " + p.getFabricante()+"\n"));
    }

}
