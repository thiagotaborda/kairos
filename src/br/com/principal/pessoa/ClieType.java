package br.com.principal.pessoa;



public enum ClieType {
	C ("Cliente"),
	T ("Transportadora"),
	F ("Fornecedor"),
	P ("Propect");
	
	private String description;
	
	private ClieType(String description){
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
