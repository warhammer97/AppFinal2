package dto;

public class Sala {
	
	int idFila;
	int nfilas;
	int asientosFila;
	
	public Sala() {
		super();
	}

	public Sala(int idFila, int nfilas, int asientosFila) {
		super();
		this.idFila = idFila;
		this.nfilas = nfilas;
		this.asientosFila = asientosFila;
	}

	public int getIdFila() {
		return idFila;
	}

	public void setIdFila(int idFila) {
		this.idFila = idFila;
	}

	public int getNfilas() {
		return nfilas;
	}

	public void setNfilas(int nfilas) {
		this.nfilas = nfilas;
	}

	public int getAsientosFila() {
		return asientosFila;
	}

	public void setAsientosFila(int asientosFila) {
		this.asientosFila = asientosFila;
	}

	@Override
	public String toString() {
		return "Sala [idFila=" + idFila + ", nfilas=" + nfilas + ", asientosFila=" + asientosFila + "]";
	}
	
	
	
}
