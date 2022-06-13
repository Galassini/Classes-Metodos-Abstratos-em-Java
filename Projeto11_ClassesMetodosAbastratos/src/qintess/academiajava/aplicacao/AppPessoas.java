package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppPessoas {
	public static void main(String[] args) {
		Pessoa p1 = new Funcionario("Priscila",33, Sexo.FEMININO, "Analista", 2000);
		JOptionPane.showMessageDialog(null, p1.mostrar());
	}
}
