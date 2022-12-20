package com.uliano.estrutura;

/**
 * Classe responsável pela representação de uma Coluna do Database.
 * @author Gustavo Uliano
 */
public class Coluna {

	private String nome;
	private String tipo;
	private boolean primaryKey;
	private boolean autoIncrement;
	private boolean isNull;
	
	/**
	 * Retorna o nome da coluna.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Define o nome da coluna.
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Retorna o tipo da coluna.
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * Define o tipo da coluna.
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * Retorna se a coluna é chave primária.
	 * @return
	 */
	public boolean isPrimaryKey() {
		return primaryKey;
	}
	
	/**
	 * Define se a coluna é chave primária.
	 * @param primaryKey
	 */
	public void setPrimaryKey(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}
	
	/**
	 * Retorna se a coluna pode ser nula.
	 * @return
	 */
	public boolean isNull() {
		return isNull;
	}
	
	/**
	 * Define se a coluna pode ser nula.
	 * @param isNull
	 */
	public void setNull(boolean isNull) {
		this.isNull = isNull;
	}
	
	/**
	 * Retorna se a coluna é auto-incremento.
	 * @return
	 */
	public boolean isAutoIncrement() {
		return autoIncrement;
	}
	
	/**
	 * Define se a coluna é auto-incremento.
	 * @param autoIncrement
	 */
	public void setAutoIncrement(boolean autoIncrement) {
		this.autoIncrement = autoIncrement;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coluna [nome=");
		builder.append(nome);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", primaryKey=");
		builder.append(primaryKey);
		builder.append(", isNull=");
		builder.append(isNull);
		builder.append(", autoIncrement=");
		builder.append(autoIncrement);
		builder.append("]");
		return builder.toString();
	}
	
}
