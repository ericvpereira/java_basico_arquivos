package model.application;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        File path = new File("c:\\temp\\escrita.txt");

        System.out.print("Quer iniciar o programa? (s/n) ");
        char op = sc.next().charAt(0);
        char upper = Character.toUpperCase(op);

        while (upper != 'N') {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
                System.out.print("Digite um nome: ");
                String nome = sc.next();
                bw.write(nome);
                bw.newLine();
                System.out.print("Deseja continuar? ");
                op = sc.next().charAt(0);
                upper = Character.toUpperCase(op);
                System.out.println("Nome adicionado com sucesso!");
            }
            catch (IOException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
        sc.close();
    }
}
