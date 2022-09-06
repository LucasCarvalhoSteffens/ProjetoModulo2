package entidade;

public class Aluno {

	public int id_aluno;
	public String nome_aluno;
	private String nasc_aluno;
	private String sexo_aluno;
	private String cpf_aluno;
	private String endereco_aluno;
	private String telefone_aluno;
	private Personal personal;

	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

	public String getNasc_aluno() {
		return nasc_aluno;
	}

	public void setNasc_aluno(String nasc_aluno) {
		this.nasc_aluno = nasc_aluno;
	}

	public String getSexo_aluno() {
		return sexo_aluno;
	}

	public void setSexo_aluno(String sexo_aluno) {
		this.sexo_aluno = sexo_aluno;
	}

	public String getCpf_aluno() {
		return cpf_aluno;
	}

	public void setCpf_aluno(String cpf_aluno) {
		this.cpf_aluno = cpf_aluno;
	}

	public String getEndereco_aluno() {
		return endereco_aluno;
	}

	public void setEndereco_aluno(String endereco_aluno) {
		this.endereco_aluno = endereco_aluno;
	}

	public String getTelefone_aluno() {
		return telefone_aluno;
	}

	public void setTelefone_aluno(String telefone_aluno) {
		this.telefone_aluno = telefone_aluno;
	}

	public String NomePersonal() {
		return personal.getNome_personal();
	}
}
