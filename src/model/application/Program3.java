package model.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {
    public static void main(String[] args) {
        
        int cont = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\texto.txt"))){

            while (br.readLine() != null) {
                cont++;
            }

            System.out.println("Total de linhas: " + cont);

        }
        catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
