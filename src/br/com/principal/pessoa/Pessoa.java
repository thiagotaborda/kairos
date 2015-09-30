package br.com.principal.pessoa;

public class Pessoa {
/*
 * @ param args
 */
	
	int id_cli;
	String nom_cli;
	ClieType tp_clie;
	Endereco end_clie;
	PessoaType pes_clie;
	SexoType sexo;
	long cpf;
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cpf ^ (cpf >>> 32));
		result = prime * result + ((end_clie == null) ? 0 : end_clie.hashCode());
		result = prime * result + id_cli;
		result = prime * result + ((nom_cli == null) ? 0 : nom_cli.hashCode());
		result = prime * result + ((pes_clie == null) ? 0 : pes_clie.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((tp_clie == null) ? 0 : tp_clie.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf != other.cpf)
			return false;
		if (end_clie == null) {
			if (other.end_clie != null)
				return false;
		} else if (!end_clie.equals(other.end_clie))
			return false;
		if (id_cli != other.id_cli)
			return false;
		if (nom_cli == null) {
			if (other.nom_cli != null)
				return false;
		} else if (!nom_cli.equals(other.nom_cli))
			return false;
		if (pes_clie != other.pes_clie)
			return false;
		if (sexo != other.sexo)
			return false;
		if (tp_clie != other.tp_clie)
			return false;
		return true;
	}
	

}
