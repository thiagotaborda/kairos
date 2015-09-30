package br.com.principal.pessoa;

public enum PessoaType {
	F ("Pessoa F�sica"),
	J ("Pessoa Jur�dica Contribuinte"),
	N ("Pessoa Jur�dica N�o Contribuinte"),
	O ("Org�o Publico");
	
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


