package br.com.estudos.alura.solid.ocp.v2;

public class CalculadoraDePrecos {

    private TabelaDePreco tabela;
    private ServicoDeEntrega entrega;

    public CalculadoraDePrecos(final TabelaDePreco tabela, final ServicoDeEntrega entrega) {
        this.tabela = tabela;
        this.entrega = entrega;
    }

    public double calcula(final Compra produto) {
        double desconto = tabela.descontoPara(produto.getValor());
        double frete = entrega.para(produto.getCidade());
        return produto.getValor() * (1 - desconto) + frete;
    }
}