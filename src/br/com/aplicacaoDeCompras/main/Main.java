package br.com.aplicacaoDeCompras.main;
import br.com.aplicacaoDeCompras.gestaoDeCompras.CartaoDeCredito;
import br.com.aplicacaoDeCompras.gestaoDeCompras.Compra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o limite do cartão: ");
        double limite = sc.nextDouble();

        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);

        int encerrarUso = 1;
        while(encerrarUso != 0) {
            System.out.print("Digite a descrição da compra: ");
            String item = sc.next();

            System.out.print("Digite o valor da compra: ");
            double valor = sc.nextDouble();

            Compra compra = new Compra(item, valor);
            cartaoDeCredito.addCompras(compra);
            boolean compraRealizada = cartaoDeCredito.aprovacaoDeCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                encerrarUso = sc.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                encerrarUso = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");

        for (Compra c : cartaoDeCredito.getCompras()) {
            System.out.println(c.getItem() + " - " +c.getValor());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartaoDeCredito.getLimiteDisponivel());


    }
}