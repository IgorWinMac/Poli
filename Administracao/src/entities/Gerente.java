package entities;

public class Gerente extends Funcionario{
	
	
	
	public Gerente(String nome, int idade, String sexo, String departamento, double salario) {
		super(nome, idade, sexo, departamento, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bonificacao(double salario) {
		super.bonificacao(salario + 500);
		salario = salario + 500;
		System.out.println("Salário com bonificação: "+salario);
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", departamento=" + departamento
				+ ", salario=" + salario + "]";
	}
}
