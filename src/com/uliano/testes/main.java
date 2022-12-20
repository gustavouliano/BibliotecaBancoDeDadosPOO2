package com.uliano.testes;

import com.uliano.estrutura.Principal;
import com.uliano.estrutura.Sgbd;

public class main {

	public static void main(String[] args) {
		
		Sgbd sgbd = Sgbd.getInstanceFromJson("json/dados.json");
		
		String sql = Principal.getSql(sgbd);
		System.out.println(sql);
		Principal.executa(sgbd);
	}

}
