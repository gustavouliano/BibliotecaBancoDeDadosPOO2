package com.uliano.estrutura;

public class Principal {

	/**
	 * Retorna o SQL de criação do SGBD.
	 * @param sgbd
	 * @return
	 */
	public static String getSql(Sgbd sgbd) {
		StringBuilder builder = new StringBuilder();
		for (Database database : sgbd.getDatabase()) {
			builder.append(SQL.getSqlFromDatabase(database, true));
		}
		return builder.toString();
	}

	/**
	 * Executa o comando de criação do SGBD.
	 * @param sgbd
	 */
	public static void executa(Sgbd sgbd) {
		Query query = new Query(sgbd);
		for (Database database : sgbd.getDatabase()) {
			query.executaFromDatabase(database);
		}
	}
	
	/**
	 * Retorna um Sgbd a partir do caminho para um arquivo no formato JSON.
	 * @param caminho - caminho até o arquivo JSON.
	 * @return
	 */
	public static Sgbd getSgbdFromJson(String caminho) {
		return Sgbd.getInstanceFromJson(caminho);
	}

}
