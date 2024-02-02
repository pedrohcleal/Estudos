import jandl.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;

public class P1012ListaSatelites  {
	public static void main(String a[]) throws SQLException {
		Scanner sc = new Scanner(System.in); // entrada de dados
		System.out.print("Nome do Planeta ? ");
		String planeta = sc.next();
		sc.close();

		// obt�m conex�o
		Connection con = DB.getInstance().getConnection();
		// cria sess�o interativa
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM satelites WHERE posicao = funcPosPlaneta('"
				+ planeta + "')";

		// executa consulta
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) { // exibe resultados
			System.out.println(rs.getInt("POSICAO") + ": " + rs.getString("NOME"));
		}

		// fecha sess�o
		stmt.close();
		DB.getInstance().shutdown();// encerra conex�o
	}
}