package br.unifei.imc.facade;

import br.unifei.imc.arquivo.CriaArquivo;
import br.unifei.imc.arquivo.SalvaArquivo;
import br.unifei.imc.fabricas.*;
import br.unifei.imc.jogos.Games;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class registraJogo {
    private String nome;
    private Double valor;
    private String descricao;
    private String fabricante;
    private FabricaDeJogo fab;
    private Games game;
    private SalvaArquivo save = new SalvaArquivo();

    public void registraJogo(String nome, Double valor, String descricao, String fabricante) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.game = new Games(this.nome, this.valor, this.descricao, this.fabricante);
    }



    public void registrar(Plataformas plataforma) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {


        // Fazer if no ANDROID STUDIO para saber qual é a plataforma do jogo
        if (plataforma.name() == "Pc") {
            fab = new FabricaJogosPc();
            boolean exists = (new File("jogosPc.csv")).exists();
            if (!exists) {
                CriaArquivo c = new CriaArquivo();
                c.criaArquivo("jogosPc.csv");
            }
            save.salvaJogo(game, "jogosPc.csv");

        } else if (plataforma.name() == "Multiplataforma") {
            fab = new FabMultiplataforma();
            boolean exists = (new File("jogosMultiplataforma.csv")).exists();
            if (!exists) {
                CriaArquivo c = new CriaArquivo();
                c.criaArquivo("jogosMultiplataforma.csv");
            }
            save.salvaJogo(game, "jogosMultiplataforma.csv");

        } else if (plataforma.name() == "Xbox") {
            fab = new FabricaJogosXbox();
            boolean exists = (new File("jogosXbox.csv")).exists();
            if (!exists) {
                CriaArquivo c = new CriaArquivo();
                c.criaArquivo("jogosXbox.csv");
            }
            save.salvaJogo(game, "jogosXbox.csv");

        } else if (plataforma.name() == "Playstation5") {
            fab = new FabricaJogosPlay5();
            boolean exists = (new File("jogosPlay5.csv")).exists();
            if (!exists) {
                CriaArquivo c = new CriaArquivo();
                c.criaArquivo("jogosPlay5.csv");
            }
            save.salvaJogo(game, "jogosPlay5.csv");
        }

    }
}
