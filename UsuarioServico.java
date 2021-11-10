package lista1;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class UsuarioServico {
	public static void main(String[] args) {
		Integer opcao;
		ArrayList<Servico> lista = new ArrayList<Servico>();

		do {
			Integer codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código: "));
			String descricao = JOptionPane.showInputDialog("Digite a descrição: ");
			Double precoHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da hora: "));
			Double qtdeHora = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de hora: "));
			Servico serv = new Servico(codigo, descricao, precoHora, qtdeHora);

			lista.add(serv);
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 - para sair ou Digite 0 para continuar"));
		} while (opcao != 1);
		System.out.println("Ordem de inserção:");
		for (Servico serv : lista) {
			System.out.println(serv);
		}
		System.out.println("\nLista ordenada:");
		Collections.sort(lista);
		for (Servico serv : lista) {
			System.out.println(serv);
		}
		
	}

}
