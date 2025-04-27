package br.com.aplicacaoDeCompras.gestaoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limiteTotal;
    private double limiteDisponivel;
    private List<Compra> compras = new ArrayList<>();;

    // Construtor
    public CartaoDeCredito(double limiteTotal) {
        this.limiteTotal = limiteTotal;
        this.limiteDisponivel = limiteTotal;
    }

    // Compra Aprovada
    public boolean aprovacaoDeCompra(Compra compra) {
        if (this.limiteDisponivel >= compra.getValor()) {
            this.limiteDisponivel -= compra.getValor();
            return true;
        } else {
            return false;
        }
    }

    public void addCompras(Compra compras) {
        this.compras.add(compras);
    }


    // Getters
    public double getLimiteTotal() { return limiteTotal; }
    public double getLimiteDisponivel() { return limiteDisponivel; }
    public List<Compra> getCompras() { return compras; }
}
