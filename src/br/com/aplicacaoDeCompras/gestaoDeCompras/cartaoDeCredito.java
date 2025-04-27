package br.com.aplicacaoDeCompras.gestaoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class cartaoDeCredito {
    private double limiteTotal;
    private double limiteDisponivel;
    private List<Compra> compras;

    // Construtor
    public cartaoDeCredito(double limiteTotal) {
        this.limiteTotal = limiteTotal;
        this.limiteDisponivel = limiteTotal;
        this.compras = new ArrayList<>();
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


    // Getters
    public double getLimiteTotal() { return limiteTotal; }
    public double getLimiteDisponivel() { return limiteDisponivel; }
    public List<Compra> getCompras() { return compras; }
}
