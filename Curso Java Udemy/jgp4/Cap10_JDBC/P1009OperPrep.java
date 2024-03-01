import jandl.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class P1009OperPrep {
	public static void main(String a[]) throws SQLException {
		// obt�m conex�o
		Connection con = DB.getInstance().getConnection();

		// cria comando preparado
		String sql = "INSERT INTO "
				+ "planetas(posicao, nome, distancia, diametro) VALUES(?, ?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		// insere novos planetas de teste
		for (int i = 0, res = 1; i < 100 && res > 0; i++) { 
			double valor = Math.random(); // gera valor aleat�rio
			pstmt.setInt(1, 1000 + i); // par�metro 1
			pstmt.setString(2, "Planeta#" + i); // par�metro 2
			pstmt.setDouble(3, 1_000_000 * valor); // par�metro 3
			pstmt.setDouble(4, 1_000 * valor); // par�metro 4
			res = pstmt.executeUpdate(); // executa comando
			System.out.println("Planeta#" + i + (res > 0 ? " ok" : " erro"));
		}

		pstmt.close(); // encerra comando preparado
		DB.getInstance().shutdown(); // encerra conex�o
	}
}