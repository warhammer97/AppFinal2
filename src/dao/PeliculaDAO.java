package dao;

import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

import dto.*;

public class PeliculaDAO {
	
	Connection conexion;

	public PeliculaDAO() {
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
	
	
	public ArrayList<Pelicula> recuperarPeliculas(){
		ResultSet resulset;
		ArrayList<Pelicula> peliculas= new ArrayList<>();
		try {
			Statement statement = conexion.createStatement();
			resulset=statement.executeQuery("select * from peliculas");
			while(resulset.next()) {
				String titulo=resulset.getString("titulo");
				String sinopsis=resulset.getString("sinopsis");
				int duracion=resulset.getInt("duracion");
				LocalDate fechaEstreno=resulset.getDate("fecha_estreno").toLocalDate();
				LocalDate fechaFin=resulset.getDate("fecha_fin").toLocalDate();
				Pelicula p= new Pelicula(titulo,sinopsis,duracion,fechaEstreno,fechaFin);
				peliculas.add(p);
			}
		} catch (SQLException e) {
			System.err.println("Halgo salió mal...");
			e.printStackTrace();
		}
		return peliculas;
	}
	
	public boolean addPelicula(Pelicula p) {
		try {
			/*Cambiar base de datos, eliminar la columna id_pelicula*/
			PreparedStatement statement= conexion.prepareStatement("insert into peliculas(titulo,sinopsis,duracion,fecha_estreno,fecha_fin) values(?,?,?,?,?)");
			statement.setString(1, p.getTitulo());
			statement.setString(2, p.getSinopsis());
			statement.setInt(3, p.getDuracion());
			statement.setDate(4, Date.valueOf(p.getFechaEstreno()));
			statement.setDate(5, Date.valueOf(p.getFechaFin()));
			if(statement.executeUpdate()>0) {
				return true;
			}else {
				return false;
			}
			
		} catch (SQLException e) {
			System.err.println("Az susdo su aber ke pasa. Jaja salu2.");
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean eliminarPelicula(String titulo) {
		int filas=0;
		try {
			Statement statement= conexion.createStatement();
			filas=statement.executeUpdate("delete from peliculas where titulo=\""+titulo+"\"");
			System.out.println("Se han modificado "+filas+" filas");
			
		} catch (Exception e) {
			System.err.println("Query not OK");
			e.printStackTrace();
		}
		if(filas>0)
			return true;
		else
			return false;
	}
		
	
	
	public boolean comprobarPelicula(String titulo) {
		
	}
	
}
