package com.uliano.estrutura;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

/**
 * Classe responsável pela conexão com o MySQL.
 * @author Gustavo Uliano
 */
public class ConexaoMysql implements InterfaceConexao {
	
	private int porta;
	private String user;
	private String password;
	private Connection conn;
	
	public ConexaoMysql(int porta, String user, String password) {
		this.setPorta(porta);
		this.setUser(user);
		this.setPassword(password);
		this.conecta();
	}
	
	@Override
	public boolean conecta() {
		if (this.isConectado()) {
			return true;
		}
		
		try {
			String url = "jdbc:mysql://localhost:" + porta + "/";
			this.conn = DriverManager.getConnection(url, this.getUser(), this.getPassword());
			return true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return false;
		}
	}

	@Override
	public boolean isConectado() {
		if (this.conn == null) {
			return false;
		}
		try {
			return this.conn.isValid(0);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return false;
		}
	}

	@Override
	public void encerraConexao() {
		if (this.conn != null) {
			try{
				this.conn.close();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
	}
	
	@Override
	public Connection getConn() {
		if (conn == null) {
			this.conecta();
		}
		return this.conn;
	}

	@Override
	public int getPorta() {
		return this.porta;
	}

	@Override
	public void setPorta(int porta) {
		this.porta = porta;
	}

	@Override
	public String getUser() {
		return this.user;
	}

	@Override
	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

}
	