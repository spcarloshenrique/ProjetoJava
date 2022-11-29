package br.unifei.imc.main;

import br.unifei.imc.arquivo.LerArquivo;
import br.unifei.imc.jogos.CadastrarJogo;
import br.unifei.imc.jogos.Games;
import br.unifei.imc.jogos.JogoMultiplataforma;
import br.unifei.imc.vendas.Caixas;
import br.unifei.imc.vendas.JogoVendido;
import br.unifei.imc.vendas.VendaJogos;
import br.unifei.imc.vendas.VendaUnitaria;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {


//////////////////////////////////////////
//        TESTES
//////////////////////////////////////////


        CadastrarJogo c = new CadastrarJogo();
        c.criaJogo("jogosMultiplataforma.csv");
        JogoMultiplataforma j = new JogoMultiplataforma();
        List<Games> lista = new ArrayList<Games>();
        lista = LerArquivo.readProdutoCsv("jogosMultiplataforma.csv");
        j.exibeJogo(lista);

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
