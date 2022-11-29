package br.unifei.imc.jogos;

import br.unifei.imc.arquivo.SalvaArquivo;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastrarJogo {

    public void criaJogo(String csv) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = myObj.nextLine();
        System.out.println("Valor: ");
        double valor = myObj.nextDouble();
        myObj.nextLine();
        System.out.println("Descrição: ");
        String desc = myObj.nextLine();
        System.out.println("Fabricante: ");
        String fab = myObj.nextLine();
        //List<Games> jogos = new ArrayList<>();
        Games j = new Games(nome,valor,desc,fab);
        SalvaArquivo salva = new SalvaArquivo();
        salva.salvaJogo(j,csv);
    }

}
