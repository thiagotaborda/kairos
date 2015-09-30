package br.com.principal.pessoa;

public enum PessoaType {
	F ("Pessoa Física"),
	J ("Pessoa Jurídica Contribuinte"),
	N ("Pessoa Jurídica Não Contribuinte"),
	O ("Orgão Publico");
	
	private String description;
	private PessoaType (String description){
		this.setDescription(description);
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}


