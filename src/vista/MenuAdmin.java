package vista;

import negocio.*;
import vista.utildades.Escaner;

public class MenuAdmin {
	
	Escaner sc;
	GestionEntradas ge;
	GestionPeliculas gp;
	GestionSesiones gs;
	
	public MenuAdmin() {
		super();
	}
	public MenuAdmin(Escaner sc, GestionEntradas ge, GestionPeliculas gp, GestionSesiones gs) {
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
	
	public void addPelicula(){
		
	}
	
	public void mostrarPeliculas() {
		
	}
	
	public void eliminarPelicula() {
		
	}
	
	public void crearSesion() {
		
	}
	
	public void mostrarSesiones() {
		
	}
	
	public void eliminarSesion() {
		
	}
}
