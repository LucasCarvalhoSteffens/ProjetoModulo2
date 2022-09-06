package entidade;

public class Exercicio {

	private int id_exercicio;
	private String nome_exercicio;
	private String grupoMuscular;

	public int getId_exercicio() {
		return id_exercicio;
	}

	public void setId_exercicio(int id_exercicio) {
		this.id_exercicio = id_exercicio;
	}

	public String getNome_exercicio() {
		return nome_exercicio;
	}

	public void setNome_exercicio(String nome_exercicio) {
		this.nome_exercicio = nome_exercicio;
	}

	public String getGrupoMuscular() {
		return grupoMuscular;
	}

	public void setGrupoMuscular(String grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}

	public Exercicio(int id_exercicio, String nome_exercicio, String grupoMuscular) {
		super();
		this.id_exercicio = id_exercicio;
		this.nome_exercicio = nome_exercicio;
		this.grupoMuscular = grupoMuscular;
	}

	public Exercicio() {
	}

	public void Treinopeito() {
		System.out.println("	Supino máquina: ");
		System.out.println("Séries: 2");
		System.out.println("Repetições: 15-20");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Supino reto com barra: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 8-15");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Crucifixo inclinado: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 12-15");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Desenvolvimento halteres: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 10-15");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Elevação lateral na polia com elevação de tronco: ");
		System.out.println("Séries: 2");
		System.out.println("Repetições: 15-20");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Triceps corda: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 8-12");
		System.out.println("Descanso: 60 segundos");
	}

	public void Treinocostas() {
		System.out.println("	Puxada frontal: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 10-15");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Pulley articulado: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 8-15");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Remada baixa: ");
		System.out.println("Séries: 4");
		System.out.println("Repetições: 8-12");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Rosca direta: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 8-12");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Rosca alternada: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 8-12");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Rosca biceps com halteres inclinado: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 8-12");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Abdominal maquina sentado: ");
		System.out.println("Séries: 4");
		System.out.println("Repetições: 12-18");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Prancha: ");
		System.out.println("Séries: 3");
		System.out.println("Duração: 90 segundos");
		System.out.println("Descanso: 120 segundos");
	}

	public void Treinoinferior() {
		System.out.println("	Agachamento hack squat: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 12-18");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Leg Press: ");
		System.out.println("Séries: 4");
		System.out.println("Repetições: 10-15");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Cadeira abdutora: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 10-15");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Cadeira adutora: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 10-15");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Cadeira extensora: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 10-15");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Elevação panturrilha: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 12-18");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Elevação de gemeos sentado: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 10-15");
		System.out.println("Descanso: 60 segundos");
		System.out.println("\n	Mesa flexora: ");
		System.out.println("Séries: 3");
		System.out.println("Repetições: 12-18");
		System.out.println("Descanso: 60 segundos");
	}
}
