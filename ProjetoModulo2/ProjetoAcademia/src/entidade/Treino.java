package entidade;

public class Treino {

	private int serie;
	private int repeticao;
	private String descanso;

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public int getRepeticao() {
		return repeticao;
	}

	public void setRepeticao(int repeticao) {
		this.repeticao = repeticao;
	}

	public String getDescanso() {
		return descanso;
	}

	public void setDescanso(String descanso) {
		this.descanso = descanso;
	}

	public Treino(int serie, int repeticao, String descanso) {
		super();
		this.serie = serie;
		this.repeticao = repeticao;
		this.descanso = descanso;
	}

	public Treino() {
	}

}
