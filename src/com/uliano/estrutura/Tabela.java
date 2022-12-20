package com.uliano.estrutura;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável pela representação de uma Tabela do Database.
 * @author Gustavo Uliano
 */
public class Tabela {
	
	private String nome;
	private List<Coluna> coluna;
	
	/**
	 * Construtor da classe.
	 * @param nome - Nome da tabela.
	 */
	public Tabela(String nome) {
		this.setNome(nome);
		this.coluna = new ArrayList<Coluna>();
	}
	
	/**
	 * Retorna o nome da tabela.
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Define o nome da tabela.
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Retorna as colunas da tabela.
	 * @return
	 */
	public List<Coluna> getColuna() {
		return coluna;
	}
	
	/**
	 * Define as colunas da tabela.
	 * @param coluna
	 */
	public void setColuna(List<Coluna> coluna) {
		this.coluna = coluna;
	}
	
	/**
	 * Adiciona uma nova coluna à tabela.
	 * @param coluna
	 */
	public void addColuna(Coluna coluna) {
		this.coluna.add(coluna);
	}
	
	/**
	 * Reseta as colunas da tabela.
	 */
	public void resetColuna() {
		this.coluna.clear();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tabela [nome=");
		builder.append(nome);
		builder.append(", coluna=");
		builder.append(coluna);
		builder.append("]");
		return builder.toString();
	}

}
