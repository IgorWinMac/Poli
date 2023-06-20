package entities;

public class Secretaria extends Funcionario{
	
	public Secretaria(String nome, int idade, String sexo, String departamento, double salario) {
		super(nome, idade, sexo, departamento, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bonificacao(double salario) {
		super.bonificacao(salario + 150);
		salario = salario + 150;
		System.out.println("Salário com bonificação: "+salario);
	}

	@Override
	public String toString() {
		return "Secretaria [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", departamento=" + departamento
				+ ", salario=" + salario + "]";
	}
}
