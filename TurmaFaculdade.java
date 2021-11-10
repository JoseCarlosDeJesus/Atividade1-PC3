package lista1;

public class TurmaFaculdade {
	String nomeAluno;
	String rg;
	String curso;
	Integer semestre;
	
	public TurmaFaculdade(String nomeAluno, String rg, String curso, Integer semestre) {
		this.nomeAluno = nomeAluno;
		this.rg = rg;
		this.curso = curso;
		this.semestre = semestre;
	}
	
	private Object getRg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "TurmaFaculdade [nomeAluno=" + nomeAluno + ", rg=" + rg + ", curso=" + curso + ", semestre=" + semestre
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof TurmaFaculdade) && ((TurmaFaculdade) obj).getRg().equals(this.rg)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return (int) getRg();
	}


	
}
