package com.uliano.estrutura;

import java.sql.Connection;

/**
 * Interface para Conexões com Database.
 * @author Gustavo Uliano
 */
public interface InterfaceConexao {
	
	/**
	 * Retorna a porta da conexão.
	 * @return
	 */
	public int getPorta();
	/**
	 * Define a porta da conexão.
	 * @param porta
	 */
	public void setPorta(int porta);
	/**
	 * Retorna o usuário da conexão.
	 * @return
	 */
	public String getUser();
	/**
	 * Define o usuário da conexão.
	 * @param user
	 */
	public void setUser(String user);
	/**
	 * Retorna a senha da conexão.
	 * @return
	 */
	public String getPassword();
	/**
	 * Define a senha da conexão.
	 * @param password
	 */
	public void setPassword(String password);
	/**
	 * Retorna a conexão com o Banco de Dados.
	 * @return
	 */
	public Connection getConn();
	/**
	 * Responsável pela conexão com o database.
	 * @return
	 */
	public boolean conecta();
	/**
	 * Retorna se está conectado com o database.
	 * @return
	 */
	public boolean isConectado();
	/**
	 * Encerra a conexão com o database.
	 */
	public void encerraConexao();
	
}
