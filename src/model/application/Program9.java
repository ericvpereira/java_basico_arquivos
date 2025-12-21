package model.application;

import java.io.*;
import java.util.Scanner;

/*Substituir palavras
Leia um arquivo
Substitua todas as ocorrências de uma palavra por outra
Salve o resultado em um novo arquivo */

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        System.out.print("Digite a nova palavra: ");
        String novaPalavra = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\substituir.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\novoSubstituir.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                line = line.replace(palavra, novaPalavra);

                bw.write(line);
                bw.newLine();
            }

            System.out.println("Substituição concluída com sucesso!");

        }
        catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}
