package com.uliano.estrutura;

/**
 * Classe responsável pela criação do objeto de Conexão MySQL.
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
