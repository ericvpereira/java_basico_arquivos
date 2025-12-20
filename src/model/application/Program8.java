package model.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();

        boolean encontrou = false;
        int numeroLinha = 1;

        try (BufferedReader br = new BufferedReader(
                new FileReader("c:\\temp\\buscarpalavra.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains(palavra)) {
                    System.out.println(
                            "A palavra \"" + palavra + "\" foi encontrada na linha " + numeroLinha);
                    encontrou = true;
                }
                numeroLinha++;
            }

            if (!encontrou) {
                System.out.println("A palavra \"" + palavra + "\" não foi encontrada no arquivo.");
            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}
