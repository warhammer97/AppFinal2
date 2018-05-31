package dao;

import java.sql.*;

import dto.*;

public class EntradaDAO {
	
	Connection conexion;

	public EntradaDAO() {
		
			try {
				conexion=DriverManager.getConnection(
						"jdbc:mysql://localhost/cinesaEEP","root","root");
			} catch (SQLException e) {
				System.err.println("Error a conectar");
				e.printStackTrace();
			}
		
	}
	
	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	public boolean comprobarEntradaDisponible(Entrada e, Sesion s) {
		
	}
	
	public Entrada guardarEntrada(Entrada e) {
		
	}
	
}
