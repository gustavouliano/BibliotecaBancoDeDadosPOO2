
package com.uliano.estrutura;

/**
 * Classe responsável pela criação de comandos SQL's.
 * @author Gustavo Uliano
 */
public class SQL {
	
	/**
	 * Retorna o comando SQL de criação de um database.
	 * @param database
	 * @param incluiTabelas
	 * @return
	 */
	public static String getSqlFromDatabase(Database database, boolean incluiTabelas) {
		StringBuilder builder = new StringBuilder();
		builder.append("CREATE DATABASE IF NOT EXISTS " + database.getNome() + ";");
		if (incluiTabelas) {
			builder.append("\nUSE " + database.getNome() + ";");		
			builder.append("\n");
			for (Tabela tabela : database.getTabela()) {
				builder.append(SQL.getSqlFromTabela(tabela));
				builder.append("\n");
			}
		}
		
		return builder.toString();
	}
	
	/**
	 * Retorna o comando SQL de criação de uma tabela.
	 * @param tabela
	 * @return
	 */
	public static String getSqlFromTabela(Tabela tabela) {
		StringBuilder builder = new StringBuilder();
		builder.append("CREATE TABLE IF NOT EXISTS " + tabela.getNome() + " (");
		
		for(int i = 0; i < tabela.getColuna().size(); i++) {
			Coluna coluna = tabela.getColuna().get(i);
			builder.append("\n");
			builder.append(SQL.getSqlFromColuna(coluna));
			if (i < tabela.getColuna().size() - 1) {
				builder.append(",");
			}
		}
		builder.append("\n");
		builder.append(");");
		return builder.toString();
	}
	
	/**
	 * Retorna o comando SQL de criação de uma coluna.
	 * @param coluna
	 * @return
	 */
	public static String getSqlFromColuna(Coluna coluna) {
		StringBuilder builder = new StringBuilder();
		builder.append("" + coluna.getNome() + " ");
		builder.append(coluna.getTipo().toLowerCase());
		if (coluna.isNull()) {
			builder.append(" NOT NULL");
		}
		if (coluna.isAutoIncrement()) {
			builder.append(" AUTO_INCREMENT");
		}
		if (coluna.isPrimaryKey()) {
			builder.append(",");
			builder.append("\n");
			builder.append("PRIMARY KEY (");
			builder.append(coluna.getNome() + ")");
		}
		return builder.toString();
	}

}
