package dao;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.*;

import dto.*;

public class SesionDAO {
	
	Connection conexion;

	public SesionDAO() {
		try {
			conexion=DriverManager.getConnection(
					"jdbc:mysql://localhost/cinesaEEP","root","root");
			
		} catch (SQLException e) {
			System.err.println("Error al conectar");
			e.printStackTrace();
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	public List<Sesion> recuperarSesionesDe(Pelicula p){
		
	}
	
	public List<Sesion> recuperarSesiones(){
		
	}
	
	public boolean eliminarSesion(int idSesion) {
		
	}
	
	public boolean comprobarSesionLibre(int sala, LocalDateTime fechaHora) {
		
	}
	
}
