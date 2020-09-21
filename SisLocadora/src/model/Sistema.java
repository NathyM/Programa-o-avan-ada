/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Natalie
 */
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;

public class Sistema {
    private static Sistema sistema;

    public Sistema() {
    }
    
    public static Sistema getInstance(){
        if (sistema == null){
            sistema = new Sistema();
        }return sistema;
    }
    public void cadastrarMidia(IAdapter midia) {
        Path arquivo = Paths.get("./loc_db.json");
        if (!Files.exists(arquivo)) {
            BufferedWriter bw;
            try {
                Files.createFile(arquivo);
                bw = new BufferedWriter(new FileWriter(arquivo.toFile(), true));
                bw.write(midia.imprimir());
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            BufferedWriter bw;
            try {
                bw = new BufferedWriter(new FileWriter(arquivo.toFile(), true));
                bw.newLine();
                bw.write(midia.imprimir());
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // No método listarTitulos, utiliza-se o padrão iterator para que a listagem continue enquanto existirem títulos.
    public void listarMidia() {
        Path arquivo = Paths.get("./loc_db.json");
        if (Files.exists(arquivo)) {
            List<String> midias = new ArrayList<>();
            try {
                midias = Files.readAllLines(arquivo, Charset.defaultCharset());
            } catch (IOException e) {
                System.out.println("Ainda não existem midias cadastradas.");
            }

            Iterator iterator;
            iterator = midias.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next().toString());
            }
        } else {
            System.out.println("Ainda não existem midias cadastradas.");
        }
    }
    
}
