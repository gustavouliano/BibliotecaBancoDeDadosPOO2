package com.uliano.estrutura;

import java.sql.Statement;

/**
 * Classe responsável pela execução de comandos SQL's.
 * @author Gustavo Uliano
 */
public class Query {
	
	private InterfaceConexao conexao;
	
	/**
	 * Construtor da classe Query.
	 * @param sgbd
	 */
	public Query(Sgbd sgbd) {
		this.conexao = new FactoryConexao().criarConexao(sgbd);
	}
	
	/**
	 * Executa o SQL de criação de um database.
	 * @param database
	 */
	public void executaFromDatabase(Database database) {
		try {
			Statement stmt = conexao.getConn().createStatement();
			stmt.addBatch(SQL.getSqlFromDatabase(database, false));
			stmt.addBatch("USE " + database.getNome() + ";");
			for(int i = 0; i < database.getTabela().size(); i++) {
				stmt.addBatch(SQL.getSqlFromTabela(database.getTabela().get(i)) + "; \n");
			}
			stmt.executeBatch();
			stmt.close();
		} catch (Exception e) {
			System.out.println("Houve erro na execução do comando SQL.");
			System.out.println(e.getMessage());
		}
	}
	
}
