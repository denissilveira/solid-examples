package br.com.estudos.alura.solid.acoplamento.v1;

public class NotaFiscal {
    
    private double valor;
    private double impostoSimplesSobreO;

    public NotaFiscal(double valor, double impostoSimplesSobreO) {
        this.valor = valor;
        this.impostoSimplesSobreO = impostoSimplesSobreO;
    }

}