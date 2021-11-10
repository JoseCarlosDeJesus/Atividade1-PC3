package lista1;

public class DataPadraoBrasil {
	String dia;
	String mes;
	String ano;
	
	DataPadraoBrasil(String dia, String mes, String ano){
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	@Override
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}
}
