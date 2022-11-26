package main;

import arquivo.LerArquivo;
import jogos.CadastrarJogo;
import jogos.Games;
import jogos.JogoMultiplataforma;
import vendas.Caixas;
import vendas.JogoVendido;
import vendas.VendaJogos;
import vendas.VendaUnitaria;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//////////////////////////////////////////
//        TESTES
//////////////////////////////////////////


//        CadastrarJogo c = new CadastrarJogo();
//        c.criaJogo("jogosMultiplataforma.csv");
//        JogoMultiplataforma j = new JogoMultiplataforma();
//        List<Games> lista = new ArrayList<>();
//        lista = LerArquivo.readProdutoCsv("jogosMultiplataforma.csv");
//        j.exibeJogo(lista);

//        VendaJogos v = new VendaJogos();
//        List<Games> list = v.carinho();
//        list.forEach(p->{
//            System.out.println("\n"+p.getNome()+"\n"+p.getValor());
//        });

//        Caixas cx = new Caixas(new ArrayList<>());
//        VendaJogos v = new VendaJogos();
//        List<Games> list = v.carinho();
//
//        cx.addJogo(new VendaUnitaria(list));
//        System.out.println(cx.calculaPrecoFinal());
    }

}
