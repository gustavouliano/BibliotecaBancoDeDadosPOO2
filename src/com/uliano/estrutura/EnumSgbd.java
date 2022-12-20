package com.uliano.estrutura;

/**
 * Enumerador para constantes relacionadas ao SGBD.
 * @author Gustavo Uliano
 */
public enum EnumSgbd {
	
	TIPO_MYSQL(1),
	TIPO_POSTGRE(2);

	EnumSgbd(int valor){
		this.valor = valor;
	}
	
	private int valor;

	public int getValor() {
		return this.valor;
	}
	
	public static EnumSgbd getTipoSgbd(int valor) {
		for (EnumSgbd e : EnumSgbd.values()) {
			if (e.getValor() == valor) {
				return e;
			}
		}
		return EnumSgbd.values()[0];
	}
	
}
