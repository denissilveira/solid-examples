package br.com.estudos.alura.solid.ocp.v2;

public class Frete implements ServicoDeEntrega {
    
    @Override
    public double para(String cidade) {
        if ("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }

}