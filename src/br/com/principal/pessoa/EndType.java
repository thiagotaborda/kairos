package br.com.principal.pessoa;

public enum EndType {
 P ("PRINCIPAL"),
 E ("ENTREGA") , 
 C ("COBRANÇA");
 
	private String description;
 	private EndType (String description){
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
