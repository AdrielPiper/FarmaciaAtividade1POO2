package salao;

public class Servico {
	
	private String descricao;
	private Double preco;
	private Integer tempo;
	
	public Servico() {
		super();
	}

	public Servico(String descricao, Double preco, Integer tempo) {
		super();
		this.descricao = descricao;
		this.preco = preco;
		this.tempo = tempo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getTempo() {
		return tempo;
	}

	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}
	
	
	
	

}