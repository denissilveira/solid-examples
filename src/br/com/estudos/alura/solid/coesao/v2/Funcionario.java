package br.com.estudos.alura.solid.coesao.v2;

public class Funcionario {

    private Cargo cargo;
    private double salarioBase;

    public Cargo getCargo() {
        return cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double calcularSalario() {
        return cargo.getRegra().calcula(this);
    }
}