package com.uliano.estrutura;

import java.sql.Connection;

/**
 * Interface para Conex�es com Database.
 * @author Gustavo Uliano
 */
public interface InterfaceConexao {
	
	/**
	 * Retorna a porta da conex�o.
	 * @return
	 */
	public int getPorta();
	/**
	 * Define a porta da conex�o.
	 * @param porta
	 */
	public void setPorta(int porta);
	/**
	 * Retorna o usu�rio da conex�o.
	 * @return
	 */
	public String getUser();
	/**
	 * Define o usu�rio da conex�o.
	 * @param user
	 */
	public void setUser(String user);
	/**
	 * Retorna a senha da conex�o.
	 * @return
	 */
	public String getPassword();
	/**
	 * Define a senha da conex�o.
	 * @param password
	 */
	public void setPassword(String password);
	/**
	 * Retorna a conex�o com o Banco de Dados.
	 * @return
	 */
	public Connection getConn();
	/**
	 * Respons�vel pela conex�o com o database.
	 * @return
	 */
	public boolean conecta();
	/**
	 * Retorna se est� conectado com o database.
	 * @return
	 */
	public boolean isConectado();
	/**
	 * Encerra a conex�o com o database.
	 */
	public void encerraConexao();
	
}
