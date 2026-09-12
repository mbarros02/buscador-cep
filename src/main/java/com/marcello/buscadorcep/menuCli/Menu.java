package main.java.com.marcello.buscadorcep.menuCli;

import main.java.com.marcello.buscadorcep.exception.CepException;
import main.java.com.marcello.buscadorcep.model.Endereco;
import main.java.com.marcello.buscadorcep.service.BuscadorDeCep;

import java.util.Scanner;

public class Menu {

    private final BuscadorDeCep buscador;
    private final Scanner scan;

    public Menu(BuscadorDeCep buscador) {
        this.buscador = buscador;
        this.scan = new Scanner(System.in);
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            exibirOpcoes();
            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    realizarBusca();
                    break;
                case 2:
                    continuar = false;
                    System.out.println("Sistema encerrado com sucesso!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
        scan.close();
    }

    private void exibirOpcoes() {
        System.out.println("1 - Buscar CEP");
        System.out.println("2 - Sair");
    }

    private int lerOpcao() {
        String resposta = scan.nextLine();
        try {
            return Integer.parseInt(resposta);
        } catch (NumberFormatException e) {
            System.out.println("Erro: O texto digitado não é um número válido!");
            return -1;
        }
    }

    private void realizarBusca() {
        System.out.print("Digite o CEP: ");
        String cep = scan.nextLine();

        try {
            Endereco endereco = buscador.buscarCep(cep);
            exibirEndereco(endereco);
        } catch (CepException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void exibirEndereco(Endereco endereco) {
        System.out.println(endereco.toString());
        System.out.println();
    }

}
