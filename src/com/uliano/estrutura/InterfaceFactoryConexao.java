package com.uliano.estrutura;

/**
 * Interface respons�vel pela cria��o da inst�ncia de uma Conex�o.
 * @author Gustavo Uliano
 */
public interface InterfaceFactoryConexao {
	
	/**
	 * Realiza a instancia��o do objeto de Conex�o.
	 * @param tipoSgbd
	 * @param porta
	 * @param user
	 * @param password
	 * @return
	 */
	public InterfaceConexao criarConexao(int tipoSgbd, int porta, String user, String password);
	
	/**
	 * Realiza a instancia��o do objeto de Conex�o a partir de um SGBD.
	 * @param sgbd
	 * @return
	 */
	public InterfaceConexao criarConexao(Sgbd sgbd);
}
