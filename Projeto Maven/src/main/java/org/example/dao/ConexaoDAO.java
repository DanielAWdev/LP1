

package org.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

	private static final String SERVIDOR = "localhost";
	private static final String PORTA = "3306";
	private static final String USUARIO = "root";
	private static final String SENHA = "";

	// Conectar a um banco específico
	public static Connection conectar(String banco) {

		String url = "jdbc:mysql://" + SERVIDOR + ":" + PORTA + "/" + banco;

		try {
			Connection con = DriverManager.getConnection(
					url,
					USUARIO,
					SENHA
			);

			System.out.println("Conectado ao banco: " + banco);

			return con;

		} catch (SQLException e) {

			System.out.println("Erro ao conectar ao banco: " + banco);
			e.printStackTrace();

			return null;
		}
	}

	// Banco principal
	public static Connection conectarMegaBrain() {
		return conectar("megabrain_db");
	}

	// Banco de testes
	public static Connection conectarTestes() {
		return conectar("megabrain_testes");
	}

	// Outro banco
	public static Connection conectarOutroBanco() {
		return conectar("outro_banco");
	}
}
