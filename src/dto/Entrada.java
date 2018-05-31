package dto;

public class Entrada {
	
	int idEntrada;
	int nAsiento;
	int nFila;
	
	public Entrada() {
		super();
	}

	public Entrada(int idEntrada, int nAsiento, int nFila) {
		super();
		this.idEntrada = idEntrada;
		this.nAsiento = nAsiento;
		this.nFila = nFila;
	}

	public int getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}

	public int getnAsiento() {
		return nAsiento;
	}

	public void setnAsiento(int nAsiento) {
		this.nAsiento = nAsiento;
	}

	public int getnFila() {
		return nFila;
	}

	public void setnFila(int nFila) {
		this.nFila = nFila;
	}

	@Override
	public String toString() {
		return "Entrada [idEntrada=" + idEntrada + ", nAsiento=" + nAsiento + ", nFila=" + nFila + "]";
	}
	
	
	
	
}
