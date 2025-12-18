package model.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program4 {
    public static void main(String[] args) {
        
        int totalPalavras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\texto.txt"))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                if (!linha.trim().isEmpty()) {
                    String[] palavras = linha.split("\\s+");
                    totalPalavras += palavras.length;
                }
            }

            System.out.println("Total de palavras: " + totalPalavras);
        }
        catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
