package entidade;

public class Personal {

	private int id_personal;
	private String nome_personal;
	private String dataNasc_personal;
	private String sexo_personal;
	private String cpf_personal;
	private String endereco_personal;
	private String telefone_personal;

	public int getId_personal() {
		return id_personal;
	}

	public void setId_personal(int id_personal) {
		this.id_personal = id_personal;
	}

	public String getNome_personal() {
		return nome_personal;
	}

	public void setNome_personal(String nome_personal) {
		this.nome_personal = nome_personal;
	}

	public String getDataNasc_personal() {
		return dataNasc_personal;
	}

	public void setDataNasc_personal(String dataNasc_personal) {
		this.dataNasc_personal = dataNasc_personal;
	}

	public String getSexo_personal() {
		return sexo_personal;
	}

	public void setSexo_personal(String sexo_personal) {
		this.sexo_personal = sexo_personal;
	}

	public String getCpf_personal() {
		return cpf_personal;
	}

	public void setCpf_personal(String cpf_personal) {
		this.cpf_personal = cpf_personal;
	}

	public String getEndereco_personal() {
		return endereco_personal;
	}

	public void setEndereco_personal(String endereco_personal) {
		this.endereco_personal = endereco_personal;
	}

	public String getTelefone_personal() {
		return telefone_personal;
	}

	public void setTelefone_personal(String telefone_personal) {
		this.telefone_personal = telefone_personal;
	}

	public Personal(int id_personal, String nome_personal, String dataNasc_personal, String sexo_personal,
			String cpf_personal, String endereco_personal, String telefone_personal) {
		super();
		this.id_personal = id_personal;
		this.nome_personal = nome_personal;
		this.dataNasc_personal = dataNasc_personal;
		this.sexo_personal = sexo_personal;
		this.cpf_personal = cpf_personal;
		this.endereco_personal = endereco_personal;
		this.telefone_personal = telefone_personal;
	}

	public Personal() {
	}

}
