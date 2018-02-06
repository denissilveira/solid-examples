package br.com.estudos.alura.solid.acoplamento.v2;

import java.util.List;

import br.com.estudos.alura.solid.acoplamento.v1.Fatura;

public class GeradorDeNotaFiscal {

    private final List<AcaoAposGerarNota> acoes;

    public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {
        double valor = fatura.getValorMensal();
        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));
        for (AcaoAposGerarNota acao : acoes) {
            acao.executa(nf);
        }
        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }

}
