package lista1;

public class ContaCorrente {
	String agencia;
	String numero;
	String nome;
	String cpf;
	Double saldo;

	ContaCorrente(String agencia, String numero, String nome, String cpf, Double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public int hashCode() {
		return getNumero().length() * 2;
	}

	@Override
	public String toString() {
		return "Agência: " + agencia + " Número: " + numero + " Nome: " + nome + " CPF: " + cpf + " Saldo: " + saldo;
	}

	public boolean equals(Object obj) {
		if ((obj instanceof ContaCorrente) && ((ContaCorrente) obj).getNumero().equals(this.numero)) {
			return true;
		}
		return false;
	}

}
