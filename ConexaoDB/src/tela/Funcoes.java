package tela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Funcoes extends Conexao {
	private String nome;
	private String especialidade;
	private int crm;

	public Funcoes() {
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

	public void IncluirNoBanco() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/consultorio", "postgres",
					"123");

			String sql = "INSERT INTO medico(crm, nome, especialidade) VALUES (?,?,?)";
			PreparedStatement instrucao = con.prepareStatement(sql);
			instrucao.setInt(1, crm);
			instrucao.setString(2, nome);
			instrucao.setString(3, especialidade);
			instrucao.executeUpdate();
			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void Listar() {

		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/consultorio", "postgres",
					"123");

			java.sql.Statement st = con.createStatement();
			st.executeQuery("select * from medico");
			ResultSet select = st.getResultSet();

			/*
			 * String sql = "select * from medico"; PreparedStatement instrucao
			 * = con.prepareStatement(sql); ResultSet select =
			 * instrucao.getResultSet();
			 */

			while (select.next()) {
				System.out.println("CRM: " + select.getInt("crm"));
				System.out.println("Nome: " + select.getString("nome"));
				System.out.println("Especialidade: " + select.getString("especialidade") + "\n");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	public void AlterarNoBanco(){ 
		/*try {
			Class.forName("org.postgresql.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/consultorio", "postgres", "123");
	  
		}*/
	  }
	 
}
