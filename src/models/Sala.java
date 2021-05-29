package models;

public class Sala {
	private int codigo;
	private String tipoSala;
	private int numeroDeLugares;

	public Sala(int codigo, String tipoSala, int nFileiras, int nLugaresPorFileira){
		this.codigo = codigo;
		this.tipoSala = tipoSala;
		this.numeroDeLugares = nFileiras * nLugaresPorFileira;
	}
}
