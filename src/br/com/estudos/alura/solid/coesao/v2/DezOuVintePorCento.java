package br.com.estudos.alura.solid.coesao.v2;

public class DezOuVintePorCento implements RegraDeCalculo {

	@Override
    public double calcula(final Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}

	}
}
