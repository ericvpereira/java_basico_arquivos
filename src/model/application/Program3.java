package model.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        
        try {
            File path = new File("c:\\temp\\texto.txt");
            Scanner sc = new Scanner(path);

            int cont = 0;

            while (sc.hasNextLine()) {
                sc.nextLine();
                cont++;
            }

            sc.close();

            System.out.println("Total de linhas: " + cont);

        }
        catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
