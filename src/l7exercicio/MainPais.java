package l7exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPais {
    public static void main(String[] args) {

        List<String> fronteira = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Qual país você deseja conhecer? " +
                "n\" [1] - Brasil [2] - Colombia ");
        int numeroDeEscolha = input.nextInt();

        if (numeroDeEscolha == 1) {
            Pais pais1 = new Pais("BRA", "Brasil", 212.6, 8.516, fronteira);
            fronteira.add("Argentina");
            fronteira.add("Uruguai");
            fronteira.add("Paraguai");
            fronteira.add("Bolívia");
            fronteira.add("Peru");
            fronteira.add("Colômbia");
            fronteira.add("Venezuela");
            fronteira.add("Guiana");
            fronteira.add("Guiana Francesa");
            fronteira.add("Suriname");

            pais1.status();

            System.out.print("Digite o nome de um país: ");
            Scanner input2 = new Scanner(System.in);
            String resposta2 = input2.next();
            System.out.println("O Brasil tem fronteira com " + resposta2 + "? " + pais1.fronteira(resposta2));
        } else if (numeroDeEscolha == 2) {

            List<String> fronteiraColombia = new ArrayList<>();
            Pais colombia = new Pais("COL", "Colômbia", 51.88, 1.14, fronteiraColombia);
            fronteiraColombia.add("Brasil");
            fronteiraColombia.add("Equado");
            fronteiraColombia.add("Venezuela");
            fronteiraColombia.add("Peru");
            fronteiraColombia.add("Panama");
            colombia.status();
            System.out.println("Digite um nome de um País");

            Scanner input3 = new Scanner(System.in);
            String resposta3 = input3.next();
            System.out.println("A Colombia tem fronteira com " + resposta3 + "? " + colombia.fronteira(resposta3));


        }


    }
}

