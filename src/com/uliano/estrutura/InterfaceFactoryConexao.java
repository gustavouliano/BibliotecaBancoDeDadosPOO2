package com.uliano.estrutura;

/**
 * Interface responsável pela criação da instância de uma Conexão.
 * @author Gustavo Uliano
 */
public interface InterfaceFactoryConexao {
	
	/**
	 * Realiza a instanciação do objeto de Conexão.
	 * @param tipoSgbd
	 * @param porta
	 * @param user
	 * @param password
	 * @return
	 */
	public InterfaceConexao criarConexao(int tipoSgbd, int porta, String user, String password);
	
	/**
	 * Realiza a instanciação do objeto de Conexão a partir de um SGBD.
	 * @param sgbd
	 * @return
	 */
	public InterfaceConexao criarConexao(Sgbd sgbd);
}
