package lista1;

public class Servico implements Comparable <Servico> {
	Integer codigo;
	String descricao;
	Double precoHora;
	Double qtdeHora;

	Servico(Integer codigo, String descricao, Double precoHora, Double qtdeHora){
		this.codigo=codigo;
		this.descricao=descricao;
		this.precoHora = precoHora;
		this.qtdeHora = qtdeHora;
	}
	
	public Double Valor(Double precoHora, Double qtdeHora) {
		double valor;
		valor=precoHora*qtdeHora;
		return valor;
	}
	
	@Override
	public int compareTo(Servico serv) {
		return this.descricao.compareTo(serv.descricao);
	}
	
	public String toString() {
		return "Código: "+ codigo + " Descrição: " + descricao + " Valor: "+Valor(precoHora, qtdeHora); 
	}

}
