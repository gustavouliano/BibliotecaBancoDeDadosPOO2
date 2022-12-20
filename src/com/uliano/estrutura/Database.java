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
 * Classe responsável pela representação de um Database.
 * @author Gustavo Uliano
 */
public class Database {
	
	private String nome;
	private List<Tabela> tabela;
	
	/**
	 * Construtor da classe.
	 */
	public Database() {
		this.tabela = new ArrayList<Tabela>();
	}
	
	/**
	 * Retorna o nome do database.
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Define o nome do database.
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Retorna as tabelas do database.
	 * @return
	 */
	public List<Tabela> getTabela() {
		return tabela;
	}
	
	/**
	 * Define as tabelas do database.
	 * @param tabela
	 */
	public void setTabela(List<Tabela> tabela) {
		this.tabela = tabela;
	}
	
	/**
	 * Adiciona uma nova tabela ao database.
	 * @param tabela
	 */
	public void addTabela(Tabela tabela) {
		this.tabela.add(tabela);
	}
	
	/**
	 * Retorna a instância do database a partir de um JSON.
	 * @param caminho
	 * @return
	 */
	public static Database getInstanceFromJson(String caminho) {
		if (!caminho.contains(".json")) {
			caminho.concat(".json");
		}
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(caminho));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Type listType = new TypeToken<Database>() {}.getType();
		Database database = new Gson().fromJson(bufferedReader, listType);
		return database;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Database [nome=");
		builder.append(nome);
		builder.append(", tabela=");
		builder.append(tabela);
		builder.append("]");
		return builder.toString();
	}

}
