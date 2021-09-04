package Farmacia;

public class Caixa extends Funcionario {
	
	private Integer produtividade=1; //escala de 1 a 3 (1 = 10% de aumento; 2 = 15% ; 3 = 25% )
	
public Caixa(Integer produtividade) {
		super();
		this.produtividade = produtividade;
}

public Caixa() {
	
		System.out.println("paseei pelo construtor)");
				
}

public Integer getProdutividade() {
	return produtividade;
}

public void setProdutividade(Integer produtividade) {
	this.produtividade = produtividade;
}


public void comporSalario() {
	 
	 if (produtividade.equals(1)) 
		 super.setSalarioBase(super.getSalarioBase() * 1.1);
	 else
		 if (produtividade.equals(2))
			 super.setSalarioBase(super.getSalarioBase() * 1.15);
		 else super.setSalarioBase(super.getSalarioBase() * 1.25);
		 
	 System.out.println("Salario do Caixa: " + super.getSalarioBase());
	 
}
}
