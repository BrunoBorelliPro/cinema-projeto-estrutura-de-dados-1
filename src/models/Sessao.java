package models;

import java.time.LocalTime;

public class Sessao {
	private Sala sala;
	private Filme filme;
	private LocalTime horario;
	private boolean[] lugares;
	private int codigo;
	
	public Sessao(int codigo, Sala sala, Filme filme, LocalTime horario){
		this.codigo = codigo;
		this.sala = sala;
		this.filme = filme;
		this.horario = horario;
		this.lugares = new boolean[sala.getNumeroDeLugares()];	
	}

	public void compraLugar(int idLugar){
		lugares[idLugar] = true;
	}

	public Filme getFilme(){
		return this.filme;
	}

	public LocalTime getHorario(){
		return this.horario;
	}

	public Sala getSala(){
		return this.sala;
	}

	public int getCodigo() {
		return this.codigo;
	}
}
