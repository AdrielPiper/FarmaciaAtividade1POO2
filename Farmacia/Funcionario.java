package Farmacia;

public abstract class Funcionario {
		
				private String nome;
				private Double salarioBase;
				
				public Funcionario() {
					super();
				System.out.println("passei pelo construtor do funcionario");
				}

				public Funcionario(String nome, Double salarioBase) {
					super();
					this.nome = nome;
					this.salarioBase = salarioBase;
				}

				public String getNome() {
					return nome;
				}

				public void setNome(String nome) {
					this.nome = nome;
				}

				public Double getSalarioBase() {
					return salarioBase;
				}

				public void setSalarioBase(Double salarioBase) {
					this.salarioBase = salarioBase;
				}
				public void comporSalario1() {
					salarioBase= 1100.00;
				}
				
				public abstract void comporSalario();
}
