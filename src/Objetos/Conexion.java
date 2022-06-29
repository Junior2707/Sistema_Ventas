package Objetos;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	Connection con;
	String url = "jdbc:mysql://localhosy:3306/evalati";
	String user = "root";
	String pass = "";
	
	public Connection Conectar() {
		try {
			Class.forName("con.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
		}catch(Exception e) {
			System.out.println("no funciona");
		}
		return con ;
	}
}
