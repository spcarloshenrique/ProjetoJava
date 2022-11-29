package br.unifei.imc.arquivo;

import com.opencsv.CSVWriter;
import br.unifei.imc.jogos.Games;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CriaArquivo {

    public void criaArquivo(List<Games> jogos, String csv){

        try{
            FileWriter arquivo;
            arquivo = new FileWriter(csv);
            CSVWriter writer = new CSVWriter(arquivo);
            String[] cabecalho = {"Nome", "Valor", "Descricao", "Fabricante"};
            writer.writeNext(cabecalho);
            jogos.forEach(p -> {
                String[] dado = {p.getNome(), Double.toString(p.getValor()), p.getDescricao(), p.getFabricante()};
                writer.writeNext(dado);
            });
            writer.close();
    }catch (
    IOException e){
        e.printStackTrace();
    }
        }

}
