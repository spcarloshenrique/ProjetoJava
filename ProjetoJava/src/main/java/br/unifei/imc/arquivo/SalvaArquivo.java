package arquivo;
;
import jogos.Games;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SalvaArquivo {

    public void salvaJogo(List<Games> jogos, String csv) {
        CriaArquivo c = new CriaArquivo();
        if (Files.exists(Path.of(csv))) {
            List<Games> listaAtual = LerArquivo.readProdutoCsv(csv);
            List<Games> novaLista = new ArrayList<>();
            listaAtual.forEach(p -> {
                novaLista.add(new Games(p.getNome(), p.getValor(), p.getDescricao(), p.getFabricante()));
            });
            jogos.forEach(p -> {
                novaLista.add(new Games(p.getNome(), p.getValor(), p.getDescricao(), p.getFabricante()));
            });
            c.criaArquivo(novaLista,csv);
        } else{
            c.criaArquivo(jogos,csv);
        }

    }
}
