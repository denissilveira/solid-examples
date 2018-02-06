package br.com.estudos.alura.solid.coesao.v2;

public enum Cargo {

    DESENVOLVEDOR(new DezOuVintePorCento()), 
    DBA(new QuinzeOuVinteCincoPorCento()), 
    TESTER(new QuinzeOuVinteCincoPorCento());
   
    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }
    public RegraDeCalculo getRegra() {
        return regra;
    }

}