/**
 * 
 */
package br.com.principal.pessoa;

/**
 * @author thiago.taborda
 *
 */
public enum SexoType {
	M ("Masculino"),
	F ("Feminino");
	
	private String description ;
	private SexoType (String description){
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
