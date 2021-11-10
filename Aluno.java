package lista1;

public class Aluno {
	String nome;
	String rg;
	DataPadraoBrasil dataDeNascimento;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public DataPadraoBrasil getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(DataPadraoBrasil dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Aluno) && ((Aluno) obj).getRg().equals(this.rg)) {
			return true;
		}
		return false;
	}

}
