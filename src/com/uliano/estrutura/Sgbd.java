package com.uliano.estrutura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Classe responsável pela representação de um SGBD.
 * @author Gustavo Uliano
 */
public class Sgbd {
	
	private int tipoSgbd;
	private int porta;
	private String user;
	private String password;
	private List<Database> database;
	
	/**
	 * Construtor da classe.
	 */
	public Sgbd() {
		this.database = new ArrayList<Database>();
	}
	
	/**
	 * Retorna o tipo do SGBD
	 * @return
	 */
	public int getTipoSgbd() {
		return tipoSgbd;
	}
	
	/**
	 * Define o tipo do SGBD - Deve ser uma das constantes do EnumSgbd.
	 * @param tipoSgbd
	 */
	public void setTipoSgbd(int tipoSgbd) {
		this.tipoSgbd = tipoSgbd;
	}
	
	/**
	 * Retorna a porta.
	 * @return
	 */
	public int getPorta() {
		return porta;
	}
	
	/**
	 * Define a porta.
	 * @param porta
	 */
	public void setPorta(int porta) {
		this.porta = porta;
	}
	
	/**
	 * Retorna o user.
	 * @return
	 */
	public String getUser() {
		return user;
	}
	
	/**
	 * Define o user.
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}
	
	/**
	 * Retorna a senha.
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Define a senha.
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Retorna a lista de Database.
	 * @return
	 */
	public List<Database> getDatabase() {
		return database;
	}
	
	/**
	 * Define a lista de Database.
	 * @param database
	 */
	public void setDatabase(List<Database> database) {
		this.database = database;
	}
	
	/**
	 * Adiciona um novo Database.
	 * @param database
	 */
	public void addDatabase(Database database) {
		this.database.add(database);
	}
	
	/**
	 * Retorna a instância do sgbd a partir de um JSON.
	 * @param caminho
	 * @return
	 */
	public static Sgbd getInstanceFromJson(String caminho) {
		if (!caminho.contains(".json")) {
			caminho = caminho.concat(".json");
		}
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(caminho));
		} catch (FileNotFoundException e) {
			System.out.println("Erro no caminho JSON");
			e.printStackTrace();
		}
		Type listType = new TypeToken<Sgbd>() {}.getType();
		Sgbd sgbd = new Gson().fromJson(bufferedReader, listType);
		return sgbd;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sgbd [tipoSgbd=");
		builder.append(tipoSgbd);
		builder.append(", porta=");
		builder.append(porta);
		builder.append(", user=");
		builder.append(user);
		builder.append(", password=");
		builder.append(password);
		builder.append(", database=");
		builder.append(database);
		builder.append("]");
		return builder.toString();
	}
}
