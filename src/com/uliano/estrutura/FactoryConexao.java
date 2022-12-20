package com.uliano.estrutura;

/**
 * Classe responsável pela criação do objeto de Conexão.
 * @author Gustavo Uliano
 */
public class FactoryConexao implements InterfaceFactoryConexao {

	@Override
	public InterfaceConexao criarConexao(int tipoSgbd, int porta, String user, String password) {
		EnumSgbd enumSgbd = EnumSgbd.getTipoSgbd(tipoSgbd);
		
		switch (enumSgbd) {
			case TIPO_MYSQL:
				FactoryConexaoMysql fc = new FactoryConexaoMysql();
				return fc.criarConexao(tipoSgbd, porta, user, password);
			case TIPO_POSTGRE:
			default:
				FactoryConexaoMysql fc1 = new FactoryConexaoMysql();
				return fc1.criarConexao(tipoSgbd, porta, user, password);
		}
	}
	
	@Override
	public InterfaceConexao criarConexao(Sgbd sgbd) {
		return this.criarConexao(sgbd.getTipoSgbd(), sgbd.getPorta(), sgbd.getUser(), sgbd.getPassword());
	}
	
}
