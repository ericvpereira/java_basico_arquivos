package model.application;

import java.io.*;
import java.util.Scanner;

public class Program7 {

    private static final String FILE_PATH = "c:\\temp\\calcular.txt";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (!iniciarPrograma(sc)) {
            sc.close();
            return;
        }

        executarPrograma(sc);
        sc.close();
    }

    private static boolean iniciarPrograma(Scanner sc) {
        System.out.print("Quer iniciar o programa? (s/n) ");
        return Character.toUpperCase(sc.next().charAt(0)) != 'N';
    }

    private static void executarPrograma(Scanner sc) {
        File path = new File(FILE_PATH);
        char op = 'S';

        while (op != 'N') {
            double media = calcularMedia(path);
            System.out.println("Media dos numeros: " + String.format("%.2f", media));
            op = perguntarContinuacao(sc);
        }
    }

    private static double calcularMedia(File path) {

        double soma = 0.0;
        int quantidade = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                double numero = Double.parseDouble(line);
                soma += numero;
                quantidade++;
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        if (quantidade == 0) {
            return 0.0;
        }

        return soma / quantidade;

    }

    private static char perguntarContinuacao(Scanner sc) {
        System.out.print("Deseja continuar? (s/n) ");
        return Character.toUpperCase(sc.next().charAt(0));
    }
}