package com.algaworks.erp.model;

public enum TipoEmpresa {
	
	MEI("Microempreendedor Individual"),
	EIRELI("Empresa Individual de Responsabilidade Limitada"),
	LTDA("Sociedade Limitada"),
	SA("Sociedade Anônima");
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
	TipoEmpresa(String string) {}

}
