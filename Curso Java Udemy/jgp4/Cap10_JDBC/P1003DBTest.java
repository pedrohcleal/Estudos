import jandl.db.DB;

import java.sql.Connection;

public class P1003DBTest {
	public static void main (String a[]) throws Exception {
		// obt�m conex�o
		Connection con = DB.getInstance().getConnection();
		// Exibe informa��es da conex�o
		System.out.println(con.getMetaData().getDatabaseProductName() + ":" + con);
		// encerramento da conex�o
		DB.getInstance().shutdown();
	}
}
