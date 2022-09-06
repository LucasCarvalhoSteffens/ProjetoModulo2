package entidade;

public class Avaliacao {

	private int id_avaliacao;
	private float peso_avaliacao;
	private float altura_avaliacao;
	private String cirurgia_avaliacao;
	private	String medicacao_avaliacao;
	public Aluno aluno;

	public int getId_avaliacao() {
		return id_avaliacao;
	}

	public void setId_avaliacao(int id_avaliacao) {
		this.id_avaliacao = id_avaliacao;
	}

	public float getPeso_avaliacao() {
		return peso_avaliacao;
	}

	public void setPeso_avaliacao(float peso_avaliacao) {
		this.peso_avaliacao = peso_avaliacao;
	}

	public float getAltura_avaliacao() {
		return altura_avaliacao;
	}

	public void setAltura_avaliacao(float altura_avaliacao) {
		this.altura_avaliacao = altura_avaliacao;
	}


	public String getCirurgia_avaliacao() {
		return cirurgia_avaliacao;
	}

	public void setCirurgia_avaliacao(String cirurgia_avaliacao) {
		this.cirurgia_avaliacao = cirurgia_avaliacao;
	}

	public String getMedicacao_avaliacao() {
		return medicacao_avaliacao;
	}

	public void setMedicacao_avaliacao(String medicacao_avaliacao) {
		this.medicacao_avaliacao = medicacao_avaliacao;
	}

	public Avaliacao(int id_avaliacao, float peso_avaliacao, float altura_avaliacao, String cirurgia_avaliacao,
			String medicacao_avaliacao) {
		super();
		this.id_avaliacao = id_avaliacao;
		this.peso_avaliacao = peso_avaliacao;
		this.altura_avaliacao = altura_avaliacao;
		this.cirurgia_avaliacao = cirurgia_avaliacao;
		this.medicacao_avaliacao = medicacao_avaliacao;
	}

	public Avaliacao() {
	}

}
