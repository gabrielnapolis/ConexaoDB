package tela;


public class Incluir {
	private String nome;
	private String especialidade;
	private int crm;
	
	
	public Incluir() {
		this.nome = "";
		this.especialidade = "";
		this.crm = 0;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public int getCrm() {
		return crm;
	}


	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	
}
