package dto;

import java.time.LocalDateTime;
import java.util.List;

public class Sesion {
	
	int idSesion;
	LocalDateTime fechaHora;
	Sala sala;
	List<Entrada> entradasVendidas;
	
	public Sesion() {
		super();
	}

	public Sesion(int idSesion, LocalDateTime fechaHora, Sala sala, List<Entrada> entradasVendidas) {
		super();
		this.idSesion = idSesion;
		this.fechaHora = fechaHora;
		this.sala = sala;
		this.entradasVendidas = entradasVendidas;
	}

	public int getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(int idSesion) {
		this.idSesion = idSesion;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public List<Entrada> getEntradasVendidas() {
		return entradasVendidas;
	}

	public void setEntradasVendidas(List<Entrada> entradasVendidas) {
		this.entradasVendidas = entradasVendidas;
	}

	@Override
	public String toString() {
		return "Sesion [idSesion=" + idSesion + ", fechaHora=" + fechaHora + ", sala=" + sala + ", entradasVendidas="
				+ entradasVendidas + "]";
	}
	
	
	
}
