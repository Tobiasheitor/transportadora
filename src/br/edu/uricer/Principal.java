package br.edu.uricer;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversorNumerosRomanos conversor = new ConversorNumerosRomanos();
        String entrada;
        int saida = 0;

        while (true) {
            System.out.print("Informe o número roman ou <exit> para sair: ");
            entrada = sc.nextLine();

            if ("exit".equals(entrada)) {
                break;
            }

            try {
                saida = conversor.converter(entrada);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: entrada inválida!");
            }

            System.out.print("Numero em decimal: " + saida);
            System.out.println("");
        }
    }
}
