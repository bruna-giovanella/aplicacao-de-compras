package br.com.aplicacaoDeCompras.gestaoDeCompras;
import java.util.List;

public class Compra {
    private String item;
    private double valor;

    // Construtor
    public Compra(String item, double valor) {
        this.item = item;
        this.valor = valor;
    }

    // Setters
    public void setItem (String item) { this.item = item; }
    public void setValor (double valor) { this.valor = valor; }
    // Getters
    public double getValor() { return valor; }
    public String getItem() { return item; }

    @Override
    public String toString() {
        return "Item: " + this.item + " (R$ " + this.valor + ")";
    }
}
