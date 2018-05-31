package vista;

import java.time.LocalDateTime;
import java.util.List;

import dto.Entrada;
import dto.Pelicula;
import dto.Sesion;
import negocio.*;
import vista.utildades.*;

public class MenuTaquillero {
	
	Escaner sc;
	GestionEntradas ge;
	GestionPeliculas gp;
	GestionSesiones gs;
	
	public MenuTaquillero() {
		super();
	}
	public MenuTaquillero(Escaner sc, GestionEntradas ge, GestionPeliculas gp, GestionSesiones gs) {
		super();
		this.sc = sc;
		this.ge = ge;
		this.gp = gp;
		this.gs = gs;
	}
	public Escaner getSc() {
		return sc;
	}
	public void setSc(Escaner sc) {
		this.sc = sc;
	}
	public GestionEntradas getGe() {
		return ge;
	}
	public void setGe(GestionEntradas ge) {
		this.ge = ge;
	}
	public GestionPeliculas getGp() {
		return gp;
	}
	public void setGp(GestionPeliculas gp) {
		this.gp = gp;
	}
	public GestionSesiones getGs() {
		return gs;
	}
	public void setGs(GestionSesiones gs) {
		this.gs = gs;
	}
	
	/****************************************Comienzo de los métodos*****************************************/
	
	public void mostrarMenuPrincipal(){
		
	}
	
	public void mostrarPeliculas() {
		
	}
	
	public void mostrarelicula(Pelicula p) {
		
	}
	
	public void mostrarSesiones(Pelicula p) {
		
	}
	
	public void mostrarYcomprarEntradas(Sesion s) {
		
	}
	
	public void mostrarEntradas(List<Entrada> entradas, Sesion s) {
		
	}
	
	public void mostrarSesiones(LocalDateTime fh) {
		
	}
}
