package com.uliano.estrutura;

/**
 * Classe respons�vel pela cria��o do objeto de Conex�o MySQL.
 * @author Gustavo Uliano
 */
public class FactoryConexaoMysql implements InterfaceFactoryConexao {

	@Override
	public InterfaceConexao criarConexao(int tipoSgbd, int porta, String user, String password) {
		return new ConexaoMysql(porta, user, password);
	}
	
	@Override
	public InterfaceConexao criarConexao(Sgbd sgbd) {
		return this.criarConexao(sgbd.getTipoSgbd(), sgbd.getPorta(), sgbd.getUser(), sgbd.getPassword());
	}

}
