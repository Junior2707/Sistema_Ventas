package Objetos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ClientesDAO {
	int r;
	PreparedStatement ps;
	ResultSet rs;
	Connection con;
	Conexion acceso = new Conexion();
	Usuarios pro =  new Usuarios();
	
	public List listarUsuario() {
		String sql = "select * from usuarios";
		List<Usuarios> listaprod = new ArrayList<>();
		try {
			con = acceso.Conectar();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Usuarios p = new Usuarios();
				p.setUsuario_id(rs.getInt(1));
				p.setNombre(rs.getString(2));
				listaprod.add(p);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return listaprod;
	}

}
