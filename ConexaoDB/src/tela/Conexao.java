package tela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract class Conexao {
	
	public void conectar() throws SQLException{
			try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/consultorio", "postgres", "123");
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

	
}
