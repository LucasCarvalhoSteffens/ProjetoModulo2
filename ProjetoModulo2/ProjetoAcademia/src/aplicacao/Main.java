/*

Nome do programa: Software para Academia​

Objetivo do programa: Ferramenta de gestão de academias​

Nome dos programadores: Denilson Schreder;
						Lucas Steffens;
						NICOLAS BORGERT;

Data de criação: 31/08/2022

*/


package aplicacao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import entidade.Aluno;
import entidade.Personal;
import entidade.Avaliacao;
import entidade.Exercicio;
import entidade.Treino;

public class Main {

	public static void main(String[] args) {

		Connection conecta = null;

		try {

			conecta = DriverManager.getConnection("jdbc:mysql://localhost/academia?" + "user=root&password=root");

			System.out.println("Conexão com DB realizada com sucesso!");

			int opcao;
			do {

				Aluno aluno = new Aluno();
				Personal personal = new Personal();
				Avaliacao avaliacao = new Avaliacao();
				Exercicio exercicio = new Exercicio();
				Treino treino = new Treino();

//MENU GERAL --------------------------------------------------------------------------------------------------------------

				do {
					System.out.println("Bem vindo a academia X");
					System.out.println("--------- Menu Academia ---------");
					System.out.println("*         1. Alunos             *");
					System.out.println("*         2. Treino             *");
					System.out.println("*         3. Avaliacao          *");
					System.out.println("*         4. Personal           *");
					System.out.println("*         5. Sair               *");
					opcao = new Scanner(System.in).nextInt();
				} while (opcao < 1 || opcao > 5);
				switch (opcao) {

// MENU DE ALUNO - OPÇÕES -------------------------------------------------------------------------------------------------

				case 1:

					do {
						System.out.println("--------- Menu Aluno ---------");
						System.out.println("*         1. Cadastrar       *");
						System.out.println("*         2. Excluir         *");
						System.out.println("*         3. Listar          *");
						opcao = new Scanner(System.in).nextInt();
					} while (opcao < 1 || opcao > 3);
					switch (opcao) {

//OPÇÃO 1 - CADASTRAR ALUNO -----------------------------------------------------------------------------------------------
					case 1:

						System.out.println("ID aluno:");
						int id_aluno = new Scanner(System.in).nextInt();
						aluno.setId_aluno(id_aluno);

						System.out.println("CPF aluno:");
						String cpf = new Scanner(System.in).nextLine();
						aluno.setCpf_aluno(cpf);

						System.out.println("Informe o nome do aluno:");
						String nome_aluno = new Scanner(System.in).nextLine();
						aluno.setNome_aluno(nome_aluno);

						System.out.println("Data de nascimento:");
						String nasc_aluno = new Scanner(System.in).nextLine();
						aluno.setNasc_aluno(nasc_aluno);

						System.out.println("Informe o sexo do aluno:");
						String sexo = new Scanner(System.in).nextLine();
						aluno.setSexo_aluno(sexo);

						System.out.println("Informe o telefone para contato:");
						String telefone = new Scanner(System.in).nextLine();
						aluno.setTelefone_aluno(telefone);

						System.out.println("Informe o endereco do aluno:");
						String endereco = new Scanner(System.in).nextLine();
						aluno.setEndereco_aluno(endereco);

						String sql = "INSERT INTO aluno(id_aluno, cpf, nome_aluno, nasc_aluno, sexo, telefone, endereco) VALUES(?,?,?,?,?,?,?)";
						try {

							PreparedStatement stmt = conecta.prepareStatement(sql);

							stmt.setInt(1, aluno.getId_aluno());
							stmt.setString(2, aluno.getCpf_aluno());
							stmt.setString(3, aluno.getNome_aluno());
							stmt.setString(4, aluno.getNasc_aluno());
							stmt.setString(5, aluno.getSexo_aluno());
							stmt.setString(6, aluno.getTelefone_aluno());
							stmt.setString(7, aluno.getEndereco_aluno());

							stmt.execute();

							stmt.close();

						} catch (SQLException u) {

							throw new RuntimeException(u);

						}

						System.out.println("ID aluno:" + aluno.getId_aluno());
						System.out.println("CPF aluno:" + aluno.getCpf_aluno());
						System.out.println("Nome aluno:" + aluno.getNome_aluno());
						System.out.println("Nascimento aluno:" + aluno.getNasc_aluno());
						System.out.println("Sexo aluno:" + aluno.getSexo_aluno());
						System.out.println("Telefone aluno:" + aluno.getTelefone_aluno());
						System.out.println("Endereco aluno:" + aluno.getEndereco_aluno());
						System.out.println("\nAluno cadastrado com sucesso!\n\n");
						break;

//EXCLUIR ALUNO DO BANCO - OPÇÃO 2 ---------------------------------------------------------------------------------

					case 2:
						String sql10 = "SELECT * from Aluno;";
						Statement comando = conecta.prepareStatement(sql10);
						ResultSet retorno = comando.executeQuery(sql10);
						System.out.println("Alunos  |  ID  :\n");
						while (retorno.next()) {

							System.out.print(retorno.getString("nome_aluno"));
							System.out.print(" | ");
							System.out.print(retorno.getInt("Id_aluno"));
							System.out.println(" ");
						}
						System.out.println("Digite o Id do Aluno que deseja excluir");
						int id_excluir = new Scanner(System.in).nextInt();

						String exclui1 = "DELETE from Avaliacao where Id_aluno = ?";
						try {
							PreparedStatement stmt = conecta.prepareStatement(exclui1);
							stmt.setInt(1, id_excluir);
							stmt.execute();
							stmt.close();
						} catch (SQLException u) {
							throw new RuntimeException(u);
						}

						String exclui2 = "DELETE from Treino where Id_aluno = ?";
						try {
							PreparedStatement stmt = conecta.prepareStatement(exclui2);
							stmt.setInt(1, id_excluir);
							stmt.execute();
							stmt.close();
						} catch (SQLException u) {
							throw new RuntimeException(u);
						}

						String exclui = "DELETE from Aluno where Id_aluno = ?";
						try {
							PreparedStatement stmt = conecta.prepareStatement(exclui);
							stmt.setInt(1, id_excluir);
							stmt.execute();
							stmt.close();
						} catch (SQLException u) {
							throw new RuntimeException(u);
						}

						System.out.println("\n\n Aluno excluido com sucesso!\n\n");
						break;

//OPÇÃO 3 - LISTAR ALUNOS DO BANCO -----------------------------------------------------------------------------------------
					case 3:

						String sql11 = "SELECT * from Aluno;";
						Statement comando1 = conecta.prepareStatement(sql11);
						ResultSet retorno1 = comando1.executeQuery(sql11);
						System.out.println("Alunos  |  ID  :\n");
						while (retorno1.next()) {

							System.out.print(retorno1.getString("nome_aluno"));
							System.out.print(" | ");
							System.out.print(retorno1.getInt("Id_aluno"));
							System.out.println(" ");
						}
						System.out.println("\n");
						break;
					}
					break;
//FIM DO CASE 1 -------------------------------------------------------------------------------------------------------------

//INICIO DO CASE 2 DO MENU---------------------------------------------------------------------------------------------------

//OPÇÕES DE MENU DE IMPRIMIR TREINO------------------------------------------------------------------------------------------
				case 2:
					do {
						System.out.println("--------- Menu Treino ---------");
						System.out.println("*         1. Imprimir       *");
						opcao = new Scanner(System.in).nextInt();
					} while (opcao < 1 || opcao > 1);
					switch (opcao) {

//INFORME GRUPO MUSCULAR DE TREINO--------------------------------------------------------------------------------------------
					case 1:
						System.out.println(" Informe Grupo muscular para gerar seu treino: ");
						System.out.println("1 - Peito, ombros e triceps");
						System.out.println("2 - Costas, bíceps e abdomen");
						System.out.println("3 - Parte inferior, pernas e glúteo");
						int gpmusc = new Scanner(System.in).nextInt();
						if (gpmusc == 1) {
							exercicio.Treinopeito();
						}
						if (gpmusc == 2) {
							exercicio.Treinocostas();
						}
						if (gpmusc == 3) {
							exercicio.Treinoinferior();
						}

						break;
//IMPLENMENTAR INSERÇÃO DO TREINO NO BANCO DE DADOS----------------------------------------------------------------------------
					/*
					 * if (opctreino == 2) { System.out.println("Informe o grupo muscular:"); String
					 * grupomuscular = new Scanner(System.in).nextLine();
					 * exercicio.setGrupoMuscular(grupomuscular);
					 * 
					 * System.out.println("Informe o nome do exercicio:"); String nomeex = new
					 * Scanner(System.in).nextLine(); exercicio.setNome_exercicio(nomeex);
					 * 
					 * System.out.println("Informe quantas series necessarias:"); int series = new
					 * Scanner(System.in).nextInt(); treino.setSerie(series);
					 * 
					 * System.out.println("Informe a quantidade de repeticao:"); int repeticoes =
					 * new Scanner(System.in).nextInt(); treino.setRepeticao(repeticoes);
					 * 
					 * System.out.println("Informe o tempo de descanso:"); String descanso = new
					 * Scanner(System.in).nextLine(); treino.setDescanso(descanso);
					 * 
					 * System.out.println("O gp muscular e:" + exercicio.getGrupoMuscular());
					 * System.out.println("O nome do exercicio e:" + exercicio.getNome_exercicio());
					 * System.out.println("Series de:" + treino.getSerie());
					 * System.out.println("Repeticoes:" + treino.getRepeticao());
					 * System.out.println("Descanso:" + treino.getDescanso());
					 * System.out.println("\n\n");
					 * 
					 * break; }
					 */
//IMPLEMENTAR EXCLUIR TREINO ------------------------------------------------------------------------------------------------
					/*
					 * case 2:
					 * 
					 * exercicio.setGrupoMuscular(null); exercicio.setNome_exercicio(null);
					 * treino.setSerie(0); treino.setRepeticao(0); treino.setDescanso(null);
					 * System.out.println("Treino excluido com sucesso!\n\n");
					 * 
					 * break; //IMPLEMENTAR CONSULTA
					 * TREINO-----------------------------------------------------------------------
					 * --------------------------- case 3: System.out.println("O gp muscular e:" +
					 * exercicio.getGrupoMuscular()); System.out.println("O nome do exercicio e:" +
					 * exercicio.getNome_exercicio()); System.out.println("Series de:" +
					 * treino.getSerie()); System.out.println("Repeticoes:" +
					 * treino.getRepeticao()); System.out.println("Descanso:" +
					 * treino.getDescanso()); System.out.println("\n\n"); break;
					 */

					}
					break;
//FIM DO CASE 2 DO MENU----------------------------------------------------------------------------------------------------------
//INICIO DO CASE 3 DO MENU-------------------------------------------------------------------------------------------------------
//MENU DE AVALIAÇÃO--------------------------------------------------------------------------------------------------------------
				case 3:

					do {
						System.out.println("--------- Menu avaliacao ---------");
						System.out.println("*         1. Cadastrar       *");
						System.out.println("*         2. Listar          *");
						opcao = new Scanner(System.in).nextInt();
					} while (opcao < 1 || opcao > 2);

//CADASTRAR AVALIAÇÃO DO ALUNO--------------------------------------------------------------------------------------------------
					if (opcao == 1) {

						System.out.println("Digite o Id do aluno");
						int id_aluno = new Scanner(System.in).nextInt();
						aluno.setId_aluno(id_aluno);

						System.out.println("Digite o Id da avaliacao");
						int id_avaliacao = new Scanner(System.in).nextInt();
						avaliacao.setId_avaliacao(id_avaliacao);

						System.out.println("Informe o peso do aluno:");
						float pesoaluno = new Scanner(System.in).nextFloat();
						avaliacao.setPeso_avaliacao(pesoaluno);

						System.out.println("Informe a altura do aluno:");
						float alturaaluno = new Scanner(System.in).nextFloat();
						avaliacao.setAltura_avaliacao(alturaaluno);

						System.out.println("O aluno toma alguma medicacao?");
						String medicacao = new Scanner(System.in).nextLine();
						avaliacao.setMedicacao_avaliacao(medicacao);

						System.out.println("O aluno tem alguma cirurgia?");
						String cirurgia = new Scanner(System.in).nextLine();
						avaliacao.setCirurgia_avaliacao(cirurgia);

						String sql3 = "INSERT INTO Avaliacao( id_aluno,id_avaliacao, pesoaluno, alturaaluno, medicacao, cirurgia) VALUES(?,?,?,?,?,?)";

						try {

							PreparedStatement stmt3 = conecta.prepareStatement(sql3);
							stmt3.setInt(1, aluno.getId_aluno());
							stmt3.setInt(2, avaliacao.getId_avaliacao());
							stmt3.setFloat(3, avaliacao.getPeso_avaliacao());
							stmt3.setFloat(4, avaliacao.getAltura_avaliacao());
							stmt3.setString(5, avaliacao.getMedicacao_avaliacao());
							stmt3.setString(6, avaliacao.getCirurgia_avaliacao());
							stmt3.execute();
							stmt3.close();

						} catch (SQLException u) {
							throw new RuntimeException(u);
						}
						System.out.println("Avaliacao do Aluno cadastrada com sucesso!");
						System.out.println("\n");
					}
//LISTAR AVALIAÇÕES DE ALUNOS-----------------------------------------------------------------------------------------------
					if (opcao == 2) {
						String sql9 = "SELECT * from Aluno;";
						Statement comando9 = conecta.prepareStatement(sql9);
						ResultSet retorno9 = comando9.executeQuery(sql9);
						System.out.println("Alunos  |  ID  :\n");
						while (retorno9.next()) {
							System.out.print(retorno9.getString("nome_aluno"));
							System.out.print(" | ");
							System.out.print(retorno9.getInt("Id_aluno"));
							System.out.println(" ");
						}
						System.out.println("\n");
						System.out.println("Digite o ID do aluno que voce que ver a avaliacao:");
						int id_alunoavaliacao = new Scanner(System.in).nextInt();

						String sql8 = "SELECT * from Avaliacao;";
						Statement comando8 = conecta.prepareStatement(sql8);
						ResultSet retorno8 = comando8.executeQuery(sql8);
						System.out.printf("Avaliacao do aluno ID %d:\n", id_alunoavaliacao);
						while (retorno8.next()) {
							System.out.print("ID avaliação: ");
							System.out.println(retorno8.getInt("id_avaliacao"));
							System.out.print("Peso do aluno: ");
							System.out.println(retorno8.getFloat("pesoaluno"));
							System.out.print("Altura do aluno: ");
							System.out.println(retorno8.getFloat("alturaaluno"));
							System.out.print("Usa medicacao: ");
							System.out.println(retorno8.getString("medicacao"));
							System.out.print("Usa cirurgia: ");
							System.out.println(retorno8.getString("cirurgia"));
						}
						System.out.println("\n");
					}
					break;
//FIM DO CASE 3----------------------------------------------------------------------------------------------------------------
//INICIO DO CASE 4-------------------------------------------------------------------------------------------------------------

//MENU PERSONAL----------------------------------------------------------------------------------------------------------------
				case 4:

					do {
						System.out.println("--------- Menu Personal ---------");
						System.out.println("*         1. Cadastrar       *");
						System.out.println("*         2. Excluir         *");
						System.out.println("*         3. Listar          *");
						opcao = new Scanner(System.in).nextInt();
					} while (opcao < 1 || opcao > 3);
					switch (opcao) {
//OPCAO 1 - CADASTRAR PERSONAL--------------------------------------------------------------------------------------------------
					case 1:

						System.out.println("Informe o ID do personal:");
						int Id_personal = new Scanner(System.in).nextInt();
						personal.setId_personal(Id_personal);

						System.out.println("Informe o CPF do personal:");
						String Cpf_personal = new Scanner(System.in).nextLine();
						personal.setCpf_personal(Cpf_personal);

						System.out.println("Informe o nome do personal:");
						String Nome_personal = new Scanner(System.in).nextLine();
						personal.setNome_personal(Nome_personal);

						System.out.println("Informe a data de nascimento do personal:");
						String DataNasc_personal = new Scanner(System.in).nextLine();
						personal.setDataNasc_personal(DataNasc_personal);

						System.out.println("Informe o sexo do personal:");
						String Sexo_personal = new Scanner(System.in).nextLine();
						personal.setSexo_personal(Sexo_personal);

						System.out.println("Informe o telefone do personal:");
						String Telefone_personal = new Scanner(System.in).nextLine();
						personal.setTelefone_personal(Telefone_personal);

						System.out.println("Informe o endereco do personal:");
						String Endereco_personal = new Scanner(System.in).nextLine();
						personal.setEndereco_personal(Endereco_personal);

						String sql4 = "INSERT INTO personal(id_personal, cpf_personal, nome_personal, nasc_personal, sexo_personal, tel_personal, endereco) VALUES(?,?,?,?,?,?,?)";

						try {

							PreparedStatement stmt4 = conecta.prepareStatement(sql4);

							stmt4.setInt(1, personal.getId_personal());
							stmt4.setString(2, personal.getCpf_personal());
							stmt4.setString(3, personal.getNome_personal());
							stmt4.setString(4, personal.getDataNasc_personal());
							stmt4.setString(5, personal.getSexo_personal());
							stmt4.setString(6, personal.getTelefone_personal());
							stmt4.setString(7, personal.getEndereco_personal());
							stmt4.execute();
							stmt4.close();

						} catch (SQLException u) {

							throw new RuntimeException(u);

						}

						System.out.println("Personal cadastrado com sucesso!\n\n");

						break;

//OPCAO 2 - EXCLUIR PERSONAL-----------------------------------------------------------------------------------------------
					case 2:

						String sqlep = "SELECT * from Personal;";
						Statement comandoep = conecta.prepareStatement(sqlep);
						ResultSet retornoep = comandoep.executeQuery(sqlep);
						System.out.println("Nome personal  |  ID  :\n");
						while (retornoep.next()) {

							System.out.print(retornoep.getString("nome_personal"));
							System.out.print(" | ");
							System.out.print(retornoep.getInt("id_personal"));
							System.out.println(" ");
						}
						System.out.println("\nDigite o Id do Personal que deseja excluir");
						int id_excluirep = new Scanner(System.in).nextInt();

						String exclui10 = "DELETE from Personal where Id_personal = ?";
						try {
							PreparedStatement stmtep = conecta.prepareStatement(exclui10);
							stmtep.setInt(1, id_excluirep);
							stmtep.execute();
							stmtep.close();
						} catch (SQLException u) {
							throw new RuntimeException(u);
						}

						System.out.println("\nPersonal excluido com sucesso!\n\n");

						break;
//OPCAO 3 - LISTAR PERSONAL------------------------------------------------------------------------------------------------
					case 3:

						String sqllp = "SELECT * from Personal;";
						Statement comandolp = conecta.prepareStatement(sqllp);
						ResultSet retornolp = comandolp.executeQuery(sqllp);
						System.out.println("Personal  |  ID  :\n");
						while (retornolp.next()) {

							System.out.print(retornolp.getString("nome_personal"));
							System.out.print(" | ");
							System.out.print(retornolp.getInt("Id_personal"));
							System.out.println(" ");
						}
						System.out.println("\n");
						break;
					}
//FIM DA OPCAO 3 DE LISTAR----------------------------------------------------------------------------------------------------
					break;
//FIM DO CASE 4 --------------------------------------------------------------------------------------------------------------
//INICIO DO CASE 5------------------------------------------------------------------------------------------------------------
				case 5:
					System.out.println("Programa encerrado com sucesso!");

					break;
//FIM DO CASE 5----------------------------------------------------------------------------------------------------------------
				}

			} while (opcao != 5);

		} catch (

		SQLException ex) {

// Caso ocorram erros na tentativa de conexao com o MySQL

			System.out.println("SQLException: " + ex.getMessage());

			System.out.println("SQLState: " + ex.getSQLState());

			System.out.println("VendorError: " + ex.getErrorCode());

		}
	}
}