package dto;

import java.time.LocalDate;

public class Pelicula {
	
	String titulo;
	String sinopsis;
	int duracion;
	LocalDate fechaEstreno;
	LocalDate fechaFin;
	
	public Pelicula() {
		super();
	}

	public Pelicula(String titulo, String sinopsis, int duracion, LocalDate fechaEstreno, LocalDate fechaFin) {
		super();
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.duracion = duracion;
		this.fechaEstreno = fechaEstreno;
		this.fechaFin = fechaFin;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", sinopsis=" + sinopsis + ", duracion=" + duracion + ", fechaEstreno="
				+ fechaEstreno + ", fechaFin=" + fechaFin + "]";
	}
	
	
	
}
