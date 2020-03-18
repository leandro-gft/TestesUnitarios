package br.ce.wcaquino.builders;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Usuario;

public class FilmeBuilder {

	private Filme filme;
	
	private FilmeBuilder() {}
	
	public static FilmeBuilder umFilme() {
		FilmeBuilder builder = new FilmeBuilder();
		builder.filme = new Filme();
		builder.filme.setNome("Titanic");
		builder.filme.setEstoque(2);
		builder.filme.setPrecoLocacao(4.0);
		return builder;
	}
	
	public static FilmeBuilder umFilmeSemEstoque() {
		FilmeBuilder builder = new FilmeBuilder();
		builder.filme = new Filme();
		builder.filme.setNome("Titanic");
		builder.filme.setEstoque(0);
		builder.filme.setPrecoLocacao(4.0);
		return builder;
	}
	
//	public FilmeBuilder semEstoque() {
//		filme.setEstoque(0);
//		return this;
//	}
	
	public FilmeBuilder comValor(Double valor) {
		filme.setPrecoLocacao(valor);
		return this;
	}
	
	
	public Filme agora() {
		return filme;
	}
}